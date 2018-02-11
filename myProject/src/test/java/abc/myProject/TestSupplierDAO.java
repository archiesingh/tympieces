package abc.myProject;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import abc.myProject.DAO.supplierDAO;
import abc.myProject.model.supplier;
import junit.framework.TestCase;

public class TestSupplierDAO{
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	context =new AnnotationConfigApplicationContext();
	context.scan("abc");
	context.refresh();
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	context.close();
	
	}


	@Test
	public void testSaveOrUpdateSupplier() {
		supplier sup=new supplier();
		sup.setS_add("Delhi");
		sup.setS_name("Ajay");
		supplierDAO supDAO=(supplierDAO)context.getBean("supplierDAOImpl");
		Assert.assertEquals(true,supDAO.saveOrUpdateSupplier(sup));
	}

	@Test
	public void testDeletesupplier() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetsupplier() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetallsupplier() {
		fail("Not yet implemented");
	}
}
