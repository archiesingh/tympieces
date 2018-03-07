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
import abc.myProject.DAO.orderdetailsDAO;
import abc.myProject.model.billaddress;
import abc.myProject.model.cart;
import abc.myProject.model.orderdetails;
import abc.myProject.model.shipaddress;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class TestOrderDetailsDAO {
	static AnnotationConfigApplicationContext context;
	static orderdetails od=new orderdetails();
	static billaddress billadd=new billaddress();
	static shipaddress shipadd=new shipaddress();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context =new AnnotationConfigApplicationContext();
		context.scan("abc");
		context.refresh();
		od.setPrice(2900);
		od.setQaunt(23);
		od.setId(2);
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	context.close();
	}

	@Test
	public void test2Insertorderdetails() {
		orderdetailsDAO orderdetailsDAO=(orderdetailsDAO)context.getBean("orderdetailsDAOImpl");
		od.setBill_addess(billadd);
		od.setShip_address(shipadd);
		Assert.assertEquals(true,orderdetailsDAO.insertorderdetails(od));
	}

	@Test
	public void test1Insertaddress() {
		orderdetailsDAO orderdetailsDAO=(orderdetailsDAO)context.getBean("orderdetailsDAOImpl");
		billadd.setCity("city");
		billadd.setHouseno("houseno");
		billadd.setName("name");
		shipadd.setCity("city");
		shipadd.setHouseno("houseno");
		shipadd.setName("name");
		Assert.assertEquals(true,orderdetailsDAO.insertaddress(shipadd,billadd));
	}

}
