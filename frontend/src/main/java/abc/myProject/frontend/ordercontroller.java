package abc.myProject.frontend;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import abc.myProject.DAO.cartDAO;
import abc.myProject.DAO.categoryDAO;
import abc.myProject.DAO.orderdetailsDAO;
import abc.myProject.model.shipaddress;
import abc.myProject.model.billaddress;
import abc.myProject.model.cart;
import abc.myProject.model.orderdetails;

@Controller
public class ordercontroller {
	@Autowired
	orderdetailsDAO orderDAO;
	@Autowired
	cartDAO cart_DAO;
	
	@RequestMapping("/checkout")
	public String checkout() {
		return "checkout";
	}
	@RequestMapping("/myorders")
	public String myorders(Model m) {
		 Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
			String username=authentication.getName();
		List<orderdetails> list=orderDAO.getallorders(username);
		m.addAttribute("orderlist", list);
		return "myorders";
	}
	
	@RequestMapping(value="/placeorder",method=RequestMethod.POST)
	public String placeorder(@RequestParam Map<String, String> details) {
		shipaddress s_address=new shipaddress();
		billaddress b_address=new billaddress();
		 Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
			String username=authentication.getName();
		List<cart> list=cart_DAO.getcartitems(username);
		orderdetails order=new orderdetails();
		s_address.setCity(details.get("s_city"));
		s_address.setHouseno(details.get("s_houseno"));
		s_address.setMobile(details.get("s_mobile"));
		s_address.setName(details.get("s_name"));
		s_address.setPincode(Integer.parseInt(details.get("s_pincode")));
		s_address.setState(details.get("s_state"));
		b_address.setCity(details.get("b_city"));
		b_address.setHouseno(details.get("b_houseno"));
		b_address.setMobile(details.get("b_mobile"));
		b_address.setName(details.get("b_name"));
		b_address.setPincode(Integer.parseInt(details.get("b_pincode")));
		b_address.setState(details.get("b_state"));
		order.setBill_addess(b_address);
		order.setShip_address(s_address);
		orderDAO.insertaddress(order.getShip_address(), order.getBill_addess());
		order.setOrder_id((int)(Math.random()*1000000));
		order.setPaymentmode(details.get("paymode"));
		for(cart item:list){
			order.setId(0);
			order.setPro(item.getPro());
			order.setQaunt(item.getQuant());
			order.setPrice(item.getQuant()*item.getPro().getP_price());
			order.setUser(item.getUser());
			orderDAO.insertorderdetails(order);
			item.setStatus("P");
			cart_DAO.insertOrUpdateCart(item);
		}				
		return "redirect:/myorders";
	}
}
