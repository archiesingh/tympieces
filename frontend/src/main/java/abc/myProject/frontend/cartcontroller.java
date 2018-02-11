package abc.myProject.frontend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import abc.myProject.DAO.AllUserDAO;
import abc.myProject.DAO.cartDAO;
import abc.myProject.DAO.productDAO;
import abc.myProject.model.cart;
import abc.myProject.model.product;

@Controller
public class cartcontroller {
	@Autowired
	cartDAO cart_DAO;
	@Autowired
	productDAO proDAO;
	@Autowired
	AllUserDAO allUserDAO;
	@RequestMapping("/viewcart")
	public String viewcart(Model m) {
		 Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
			String username=authentication.getName();
		List<cart> list=cart_DAO.getcartitems(username);
		m.addAttribute("cartlist", list);
		return "cart";
	}
	@RequestMapping("/addtocart/{id}")
	public String addtocart(@PathVariable int id){
		 Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
			String username=authentication.getName();
			cart cart_item=cart_DAO.checkCartItem(username,id);
			if(cart_item!=null){
			cart_item.setQuant(cart_item.getQuant()+1);
			cart_DAO.insertOrUpdateCart(cart_item);
			return "redirect:/viewcart";
			}
		product pro=proDAO.getproduct(id);
		cart_item=new cart();
		cart_item.setPro(pro);
		cart_item.setQuant(1);
		cart_item.setStatus("U");
		cart_item.setUser(allUserDAO.getUserByUsername(username));
		cart_DAO.insertOrUpdateCart(cart_item);
		return "redirect:/viewcart";
	}
	
	@RequestMapping("/changequantity/{id}/{condition}")
	public String changequantity(@PathVariable int id,@PathVariable int condition){
			cart cart_item=cart_DAO.getcartitembyid(id);
			if(condition==1){
			cart_item.setQuant(cart_item.getQuant()+1);
			cart_DAO.insertOrUpdateCart(cart_item);
			return "redirect:/viewcart";
			}
			else if(condition==0){
				cart_item.setQuant(cart_item.getQuant()-1);
				cart_DAO.insertOrUpdateCart(cart_item);
				return "redirect:/viewcart";		
			}
			return "redirect:/viewcart";		
		}
	
	@RequestMapping("/deletecartitem/{id}")
	public String deletecart(@PathVariable int id){
			cart cart_item=cart_DAO.getcartitembyid(id);
			cart_DAO.deleteCartItem(cart_item);
			return "redirect:/viewcart";		
		}

}
