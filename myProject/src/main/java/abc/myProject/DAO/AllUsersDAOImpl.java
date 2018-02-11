package abc.myProject.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import abc.myProject.model.AllUsers;
@Repository("allUsersDAO")
public class AllUsersDAOImpl implements AllUserDAO {
	@Autowired
	SessionFactory factory;
	public AllUsersDAOImpl(SessionFactory factory) {
		this.factory=factory;
	}
	@Transactional
	public void saveOrUpdateUser(AllUsers allUsers) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(allUsers);
	}
	@Override
	public AllUsers getUserByUsername(String username) {
		Session session=factory.openSession();
		AllUsers user = session.get(AllUsers.class, username);
		session.close();
		return user;
	}
}
