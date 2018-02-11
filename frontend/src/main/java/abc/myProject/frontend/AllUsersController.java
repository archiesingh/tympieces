package abc.myProject.frontend;

import java.util.List;
import java.util.Map;
import java.util.jar.Attributes.Name;

import javax.servlet.http.HttpSession;

import org.h2.engine.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import abc.myProject.DAO.AllUserDAO;
import abc.myProject.DAO.categoryDAO;
import abc.myProject.model.AllUsers;
import abc.myProject.model.category;

@Controller
public class AllUsersController {
	@Autowired
	AllUserDAO allUserDAO;
	@Autowired
	categoryDAO catDAO;

	@RequestMapping(value = "/login_success", method = RequestMethod.POST)
	public String loginsuccess(HttpSession session)
	{ Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		String username=authentication.getName();
		session.setAttribute("username",username);
		session.setAttribute("loggedIn", true);
		List<category> list=catDAO.getallcategory();
		session.setAttribute("categoryList", list);
	for(GrantedAuthority role:authentication.getAuthorities()){
			if(role.getAuthority().equals("ROLE_ADMIN"))
				session.setAttribute("role", "admin");
			else
				session.setAttribute("role", "user");
		}
		return "redirect:/";
	}
	@RequestMapping("perform_logout")
	public String logout(HttpSession httpSession){
		httpSession.removeAttribute("username");
		httpSession.removeAttribute("loggedIn");
		httpSession.invalidate();
		return "redirect:login?1d=2";
	}

	@RequestMapping(value = "/addAllUsers", method = RequestMethod.POST)
	public String addProduct(@RequestParam Map<String, String> user) {
		AllUsers allusers = new AllUsers();
		allusers.setUserName(user.get("username"));
		allusers.setName(user.get("name"));
		allusers.setPassword(user.get("password"));
		allusers.setRole(user.get("roll"));
		allusers.setEnabled(true);
		allusers.setEmail(user.get("email"));
		allusers.setPhnNo(Long.parseLong(user.get("phoneNo")));
		allusers.setRole("ROLE_USER");
		allUserDAO.saveOrUpdateUser(allusers);
		return "redirect:login";

	}


}
