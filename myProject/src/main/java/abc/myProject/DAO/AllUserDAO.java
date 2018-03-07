package abc.myProject.DAO;

import abc.myProject.model.AllUsers;

public interface AllUserDAO {
public boolean saveOrUpdateUser(AllUsers allUsers);
public AllUsers getUserByUsername(String username);
}
