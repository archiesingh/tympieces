package abc.myProject.DAO;

import java.util.List;

import abc.myProject.model.category;

public interface categoryDAO {

public boolean saveOrUpdatecategory(category cat);
 public boolean deletecategory(category cat);
 public category getcategory(int id);
 public List<category> getallcategory();
}
