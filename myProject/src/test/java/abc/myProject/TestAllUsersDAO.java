package abc.myProject;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import abc.myProject.DAO.AllUserDAO;
import abc.myProject.DAO.productDAO;
import abc.myProject.model.AllUsers;
import abc.myProject.model.product;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestAllUsersDAO {
	static AnnotationConfigApplicationContext context;
	static AllUsers users=new AllUsers();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context =new AnnotationConfigApplicationContext();
		context.scan("abc");
		context.refresh();
		users.setName("joey");
		users.setUserName("tribianni");
		users.setEmail("abc@xyz.com");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	context.close();
	}

	@Test
	public void test1SaveOrUpdateUser() {
		AllUserDAO usersDAO=(AllUserDAO)context.getBean("AllUsersDAOImpl");
		Assert.assertEquals(true,usersDAO.saveOrUpdateUser(users));
	
	}
	

}
