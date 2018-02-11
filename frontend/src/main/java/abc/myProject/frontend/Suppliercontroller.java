package abc.myProject.frontend;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import abc.myProject.DAO.supplierDAO;
import abc.myProject.model.supplier;

@Controller
public class Suppliercontroller {
	@Autowired
	supplierDAO supDAO;
	@RequestMapping("/addsupplier")
	public String addsupplier() {
		return "addsupplier";
	}
	
	@RequestMapping("/viewsupplier")
	public String viewsupplier(Model m) {
		List<supplier> list=supDAO.getallsupplier();
		m.addAttribute("supList", list);
		return "viewsupplier";
	}
	
	@RequestMapping("/savesupplier")
	public String savesupplier(@RequestParam Map<String, String> supp) {
		supplier sup= new supplier();
		if(supp.get("s_id")!=null)
			sup.setS_id(Integer.parseInt(supp.get("s_id")));
		sup.setS_add(supp.get("s_address"));
		sup.setS_name(supp.get("s_name"));
		supDAO.saveOrUpdateSupplier(sup);
		return "redirect:/viewsupplier";
	}
	@RequestMapping("deletesupplier/{id}")
	public String deletesupplier(@PathVariable int id){
		supplier sup=supDAO.getsupplier(id);
		supDAO.deletesupplier(sup);
		return "redirect:/viewsupplier";
	}
	@RequestMapping("updatesupplier/{id}")
	public String updatesupplier(@PathVariable int id,Model m){
		supplier sup=supDAO.getsupplier(id);
		m.addAttribute("sup",sup);
		return "updatesupplier";
	}
}
