package abc.myProject.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import abc.myProject.model.category;
@Repository("categoryDAOImpl")
public class categoryDAOImpl implements categoryDAO{
	@Autowired
	SessionFactory factory;
	public categoryDAOImpl(SessionFactory factory) {
		this.factory=factory;
	}
	@Transactional
	public void saveOrUpdatecategory(category cat) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(cat);
	}
	@Override
	@Transactional
	public void deletecategory(category cat) {
		Session session=factory.getCurrentSession();
		session.delete(cat);
	}
	@Override
	public category getcategory(int id) {
	Session session= factory.openSession();
	 category cat =session.get(category.class, id);	
	session.close();	
	 return cat;
	}
	@Override
	public List<category> getallcategory() {
		Session session= factory.openSession();
		List<category> list=session.createQuery("from category").list();
		session.close();
		return list;
	}

}
