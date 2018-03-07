package abc.myProject.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import abc.myProject.model.billaddress;
import abc.myProject.model.orderdetails;
import abc.myProject.model.product;
import abc.myProject.model.shipaddress;
@Repository
public class orderdetailsDAOImpl implements orderdetailsDAO {
	@Autowired
	SessionFactory factory;
	public orderdetailsDAOImpl(SessionFactory factory) {
		this.factory=factory;
		
	}

	@Transactional
	public boolean insertorderdetails(orderdetails order) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(order);
		return true;
	}
	@Transactional
	public boolean insertaddress(shipaddress s_add,billaddress b_add) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(s_add);
		session.save(b_add);
		return true;
	}
	
	@Override
	public List<orderdetails> getallorders(String username) {
		Session session= factory.openSession();
		Query<orderdetails> query=session.createQuery("from orderdetails where user.userName=:username");
		query.setParameter("username", username);
		List<orderdetails> list=query.list();
		session.close();
		return list;
	}
}
