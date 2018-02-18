package abc.myProject;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import abc.myProject.DAO.categoryDAO;
import abc.myProject.DAO.productDAO;
import abc.myProject.model.category;
import abc.myProject.model.product;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestProductDAO {
	static AnnotationConfigApplicationContext context;
	static product pro=new product();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context =new AnnotationConfigApplicationContext();
		context.scan("abc");
		context.refresh();
		pro.setP_desc_bandcolor("check");
		pro.setP_desc_casematerial("brass");
		pro.setP_desc_bandcolor("blue");
		pro.setP_desc_dialcolor("black");
		pro.setP_desc_displaytype("analog");
		pro.setP_desc_momenttype("xyz");
		pro.setP_desc_warr("2 yrs ");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void test1SaveOrUpdateproduct() {
		productDAO proDAO=(productDAO)context.getBean("productDAOImpl");
		Assert.assertEquals(true,proDAO.saveOrUpdateproduct(pro));
	
		}

	@Test
	public void test2Deleteproduct() {
		productDAO proDAO=(productDAO)context.getBean("productDAOImpl");
		Assert.assertEquals(true,proDAO.deleteproduct(pro));
		
	}

}
