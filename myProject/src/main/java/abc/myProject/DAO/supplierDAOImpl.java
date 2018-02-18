package abc.myProject.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import abc.myProject.model.supplier;
@Repository("supplierDAOImpl")
public class supplierDAOImpl implements supplierDAO{
	@Autowired
	SessionFactory factory;
	public supplierDAOImpl(SessionFactory factory) {
		this.factory=factory;
	}
	@Transactional
	public boolean saveOrUpdateSupplier(supplier sup) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(sup);
		return true;
	}
	@Override
	@Transactional
	public boolean deletesupplier(supplier sup) {
		Session session=factory.getCurrentSession();
		session.delete(sup);
		return true;
	}
	@Override
	public supplier getsupplier(int id) {
	Session session= factory.openSession();
	 supplier sup =session.get(supplier.class, id);	
	session.close();	
	 return sup;
	}
	@Override
	public List<supplier> getallsupplier() {
		Session session= factory.openSession();
		List<supplier> list=session.createQuery("from supplier").list();
		session.close();
		return list;
	}

}
