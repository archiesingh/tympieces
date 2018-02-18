package abc.myProject.DAO;

import java.util.List;

import abc.myProject.model.cart;

public interface cartDAO {

	public List<cart> getcartitems(String username);
	public cart getcartitembyid(int id);
	public boolean insertOrUpdateCart(cart cart_item);
	public cart checkCartItem(String username,int p_id);
	public boolean deleteCartItem(cart cart_item);
}
