package abc.myProject.frontend;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import abc.myProject.DAO.categoryDAO;
import abc.myProject.DAO.productDAO;
import abc.myProject.DAO.supplierDAO;
import abc.myProject.DAO.supplierDAOImpl;
import abc.myProject.model.category;
import abc.myProject.model.product;
import abc.myProject.model.supplier;

@Controller
public class productcontroller {
	@Autowired
	productDAO proDAO;
	@Autowired
	supplierDAO supDAO;
	@Autowired
	categoryDAO catDAO;
	@RequestMapping("/addproduct")
	public String addproduct( Model m ) {
		
	
		List<supplier> list1=supDAO.getallsupplier();
		List<category> list2=catDAO.getallcategory();
		LinkedHashMap<Integer,String> listsup= new LinkedHashMap<Integer,String>();
		for(supplier s:list1)
		{
			listsup.put(s.getS_id(),s.getS_name());
		}
		
		LinkedHashMap<Integer,String> listcat= new LinkedHashMap<Integer,String>();
		for(category c:list2)
		{
			listcat.put(c.getC_id(),c.getC_name());
		}
		m.addAttribute("listsup",listsup);
		m.addAttribute("listcat",listcat);
		m.addAttribute("pro",new product());
		return "addproduct";
	}
	
	
	@RequestMapping("/saveproduct")
	public String saveproduct(@ModelAttribute("pro") product pro) {
	String imagepath="C:\\Users\\Dharmender\\workspace\\frontend\\src\\main\\webapp\\resources\\images\\";	
		proDAO.saveOrUpdateproduct(pro);
		String fileinfo= imagepath+pro.getP_id()+".jpg";
		File f= new File(fileinfo);
		if(!pro.getP_image().isEmpty()){
			try{
				byte buff[]=pro.getP_image().getBytes();
				BufferedOutputStream bs= new BufferedOutputStream(new FileOutputStream(f));   
				bs.write(buff);
				bs.close();
			}
			catch(Exception e){
				
				
			}
			
			
		}
		return "redirect:/viewproduct";
	}
	@RequestMapping("/viewproduct")
	public String viewproduct(Model m) {
		List<product> list=proDAO.getallproduct();
		m.addAttribute("proList", list);
		return "viewproduct";
	}
	@RequestMapping("deleteproduct/{id}")
	public String deleteproduct(@PathVariable int id){
		product pro=proDAO.getproduct(id);
		proDAO.deleteproduct(pro);
		return "redirect:/viewproduct";
	}
	@RequestMapping("updateproduct/{id}")
	public String updateproduct(@PathVariable int id,Model m){
		product pro=proDAO.getproduct(id);
		List<supplier> list1=supDAO.getallsupplier();
		List<category> list2=catDAO.getallcategory();
		LinkedHashMap<Integer,String> listsup= new LinkedHashMap<Integer,String>();
		for(supplier s:list1)
		{
			listsup.put(s.getS_id(),s.getS_name());
		}
		
		LinkedHashMap<Integer,String> listcat= new LinkedHashMap<Integer,String>();
		for(category c:list2)
		{
			listcat.put(c.getC_id(),c.getC_name());
		}
		m.addAttribute("listsup",listsup);
		m.addAttribute("listcat",listcat);
		m.addAttribute("pro",pro);
		return "updateproduct";
	}
	
	@RequestMapping("/productlist/{id}")
	public String productlist(Model m,@PathVariable int id) {
		List<product> list=proDAO.allproductsbycategory(id);
		m.addAttribute("proList", list);
		return "productlist";
	}
	@RequestMapping("productdetails/{id}")
	public String productdetails(@PathVariable int id,Model m){
		product pro=proDAO.getproduct(id);
		m.addAttribute("product",pro);
		return "productdetails";
	}
}
