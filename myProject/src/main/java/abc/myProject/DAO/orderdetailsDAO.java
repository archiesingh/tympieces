package abc.myProject.DAO;

import java.util.List;

import abc.myProject.model.billaddress;
import abc.myProject.model.orderdetails;
import abc.myProject.model.shipaddress;

public interface orderdetailsDAO {
	public void insertorderdetails(orderdetails order);
	public List<orderdetails> getallorders(String username);
	public void insertaddress(shipaddress s_add,billaddress b_add);
	}
