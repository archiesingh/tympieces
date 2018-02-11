package abc.myProject.DAO;

import java.util.List;

import abc.myProject.model.category;

public interface categoryDAO {

public void saveOrUpdatecategory(category cat);
 public void deletecategory(category cat);
 public category getcategory(int id);
 public List<category> getallcategory();
}
