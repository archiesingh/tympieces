package abc.myProject.frontend;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import abc.myProject.DAO.categoryDAO;
import abc.myProject.model.category;

@Controller
public class categorycontroller {
	@Autowired
	categoryDAO catDAO;
	@RequestMapping("/addcategory")
	public String addcategory() {
		return "addcategory";
	}
	
	@RequestMapping("/viewcategory")
	public String viewcategory(Model m) {
		List<category> list=catDAO.getallcategory();
		m.addAttribute("catList", list);
		return "viewcategory";
	}
	
	@RequestMapping("/savecategory")
	public String savecategory(@RequestParam Map<String, String> catp) {
		category cat= new category();
		if(catp.get("c_id")!=null)
			cat.setC_id(Integer.parseInt(catp.get("c_id")));
		cat.setC_desc(catp.get("c_desc"));
		cat.setC_name(catp.get("c_name"));
		catDAO.saveOrUpdatecategory(cat);
		return "redirect:/viewcategory";
	}
	@RequestMapping("deletecategory/{id}")
	public String deletecategory(@PathVariable int id){
		category cat=catDAO.getcategory(id);
		catDAO.deletecategory(cat);
		return "redirect:/viewcategory";
	}
	@RequestMapping("updatecategory/{id}")
	public String updatecategory(@PathVariable int id,Model m){
		category cat=catDAO.getcategory(id);
		m.addAttribute("cat",cat);
		return "updatecategory";
	}
}
