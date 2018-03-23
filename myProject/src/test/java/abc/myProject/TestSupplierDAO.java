package abc.myProject;

import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import abc.myProject.DAO.supplierDAO;
import abc.myProject.model.supplier;
import junit.framework.TestCase;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestSupplierDAO{
	static AnnotationConfigApplicationContext context;
	static supplier sup= new supplier();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	context =new AnnotationConfigApplicationContext();
	context.scan("abc");
	context.refresh();
	sup.setS_add("Delhi");
	sup.setS_name("Ajay");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	context.close();
	
	}


	@Test
	public void test1SaveOrUpdateSupplier() {
		supplierDAO supDAO=(supplierDAO)context.getBean("supplierDAOImpl");
		Assert.assertEquals(true,supDAO.saveOrUpdateSupplier(sup));
	}

	@Test
	public void test2Deletesupplier() {
		supplierDAO supDAO=(supplierDAO)context.getBean("supplierDAOImpl");
		Assert.assertEquals(true,supDAO.deletesupplier(sup));	
		
		
	}


}
