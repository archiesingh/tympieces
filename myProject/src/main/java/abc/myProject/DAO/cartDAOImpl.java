package abc.myProject.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import abc.myProject.model.cart;
import abc.myProject.model.cart;

@Repository("cartDAO")
public class cartDAOImpl implements cartDAO {
	@Autowired
	SessionFactory factory;

	public cartDAOImpl(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public List<cart> getcartitems(String username) {
		Session session = factory.openSession();
		Query<cart> query = session.createQuery("from cart where user.userName=:username and status=:status");
		query.setParameter("username", username);
		query.setParameter("status", "U");
		List<cart> list = query.list();
		session.close();
		return list;
	}

	@Transactional
	public boolean insertOrUpdateCart(cart cart_item) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(cart_item);
		return true;
	}

	@Override
	public cart getcartitembyid(int id) {
		Session session = factory.openSession();
		cart cart_item=session.get(cart.class,id);
		session.close();
		return cart_item;
	}

	@Override
	public cart checkCartItem(String username, int p_id) {
		Session session = factory.openSession();
		Query<cart> query = session.createQuery("from cart where user.userName=:username and status=:status and pro.p_id=:p_id");
		query.setParameter("username", username);
		query.setParameter("status", "U");
		query.setParameter("p_id", p_id);
		List<cart> list = query.list();
		for(cart c:list)
			if(c!=null){
				return c;
			}
		session.close();
		return null;
		}

	@Transactional
	public boolean deleteCartItem(cart cart_item) {
		Session session = factory.getCurrentSession();
		session.delete(cart_item);	
		return true;
	}
}
