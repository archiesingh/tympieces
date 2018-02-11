package abc.myProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class orderdetails {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 private int order_id,price,qaunt;
 private String paymentmode;
@ManyToOne
 private product pro;
 @ManyToOne
 private shipaddress ship_address;
 @ManyToOne
 private billaddress bill_addess;
 @ManyToOne
 private AllUsers user;
 public String getPaymentmode() {
	return paymentmode;
}
public void setPaymentmode(String paymentmode) {
	this.paymentmode = paymentmode;
}
public AllUsers getUser() {
	return user;
}
public void setUser(AllUsers user) {
	this.user = user;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQaunt() {
	return qaunt;
}
public void setQaunt(int qaunt) {
	this.qaunt = qaunt;
}
public product getPro() {
	return pro;
}
public void setPro(product pro) {
	this.pro = pro;
}
public shipaddress getShip_address() {
	return ship_address;
}
public void setShip_address(shipaddress ship_address) {
	this.ship_address = ship_address;
}
public billaddress getBill_addess() {
	return bill_addess;
}
public void setBill_addess(billaddress bill_addess) {
	this.bill_addess = bill_addess;
}
 
 
 
 
 
 
}
