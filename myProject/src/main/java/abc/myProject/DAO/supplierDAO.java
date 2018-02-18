package abc.myProject.DAO;

import java.util.List;

import abc.myProject.model.supplier;

public interface supplierDAO {

public boolean saveOrUpdateSupplier(supplier sup);
 public boolean deletesupplier(supplier sup);
 public supplier getsupplier(int id);
 public List<supplier> getallsupplier();
}
