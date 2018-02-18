package abc.myProject.DAO;

import java.util.List;

import abc.myProject.model.product;

public interface productDAO {

public boolean saveOrUpdateproduct(product pro);
 public boolean deleteproduct(product pro);
 public product getproduct(int id);
 public List<product> getallproduct();
 public List<product> allproductsbycategory(int c_id);
}
