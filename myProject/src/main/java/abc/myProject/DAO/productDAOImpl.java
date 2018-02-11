package abc.myProject.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import abc.myProject.model.product;
@Repository("productDAOImpl")
public class productDAOImpl implements productDAO{
	@Autowired
	SessionFactory factory;
	public productDAOImpl(SessionFactory factory) {
		this.factory=factory;
	}
	@Transactional
	public void saveOrUpdateproduct(product pro) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(pro);
	}
	@Override
	@Transactional
	public void deleteproduct(product pro) {
		Session session=factory.getCurrentSession();
		session.delete(pro);
	}
	@Override
	public product getproduct(int id) {
	Session session= factory.openSession();
	 product pro =session.get(product.class, id);	
	session.close();	
	 return pro;
	}
	@Override
	public List<product> getallproduct() {
		Session session= factory.openSession();
		List<product> list=session.createQuery("from product").list();
		session.close();
		return list;
	}
	@Override
	public List<product> allproductsbycategory(int c_id) {
		Session session= factory.openSession();
		List<product> list=session.createQuery("from product where p_cat.c_id="+c_id).list();
		session.close();
		return list;
	}

}
