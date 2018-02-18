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
import abc.myProject.DAO.supplierDAO;
import abc.myProject.model.category;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCategoryDAO {
	static AnnotationConfigApplicationContext context;
	static category cat=new category();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	context =new AnnotationConfigApplicationContext();
	context.scan("abc");
	context.refresh();
	cat.setC_desc("metalic");
	cat.setC_name("titan");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	context.close();
	
	}


	@Test
	public void test1SaveOrUpdatecategory() {
		categoryDAO catDAO=(categoryDAO)context.getBean("categoryDAOImpl");
		Assert.assertEquals(true,catDAO.saveOrUpdatecategory(cat));
	}

	@Test
	public void test2Deletecategory() {
	categoryDAO catDAO=(categoryDAO)context.getBean("categoryDAOImpl");
	Assert.assertEquals(true,catDAO.deletecategory(cat));
	}
}
