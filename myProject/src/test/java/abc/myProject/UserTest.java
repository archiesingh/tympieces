package abc.myProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import abc.myProject.DAO.AllUserDAO;
import abc.myProject.DAO.AllUsersDAOImpl;
import abc.myProject.model.AllUsers;

public class UserTest {
public static void main(String arg[]){
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
	context.scan("abc.myProject");
	context.refresh();
	AllUsers all = new AllUsers();
	all.setEmail("xy@zbc");
	all.setName("john");
	all.setPassword("root");
	all.setEnabled(true);
	all.setPhnNo(23234234);
	all.setRole("ROLE_ADMIN");
	all.setUserName("john");
	AllUserDAO alldao = (AllUserDAO)context.getBean("allUsersDAO");
	alldao.saveOrUpdateUser(all);
	context.close();
}
}
