package abc.myProject;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import abc.myProject.DAO.cartDAO;
import abc.myProject.DAO.productDAO;
import abc.myProject.model.cart;
import abc.myProject.model.product;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestCartDAO {
	static AnnotationConfigApplicationContext context;
	static cart cartobj=new cart();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context =new AnnotationConfigApplicationContext();
		context.scan("abc");
		context.refresh();
		cartobj.setQuant(23);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	context.close();
	}

	@Test
	public void test1InsertOrUpdateCart() {
		cartDAO cartDAO=(cartDAO)context.getBean("cartDAOImpl");
		Assert.assertEquals(true,cartDAO.insertOrUpdateCart(cartobj));
	}

	@Test
	public void testDeleteCartItem() {
		cartDAO cartDAO=(cartDAO)context.getBean("cartDAOImpl");
		Assert.assertEquals(true,cartDAO.deleteCartItem(cartobj));
	}
}
