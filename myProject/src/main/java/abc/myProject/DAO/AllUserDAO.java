package abc.myProject.DAO;

import abc.myProject.model.AllUsers;

public interface AllUserDAO {
public void saveOrUpdateUser(AllUsers allUsers);
public AllUsers getUserByUsername(String username);
}
