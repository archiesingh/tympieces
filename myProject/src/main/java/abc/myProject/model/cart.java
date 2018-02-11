package abc.myProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class cart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private	int id;
	@ManyToOne
private	product pro;
	@ManyToOne
private AllUsers user;
private	String status;
private	int quant;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public product getPro() {
	return pro;
}
public void setPro(product pro) {
	this.pro = pro;
}
public AllUsers getUser() {
	return user;
}
public void setUser(AllUsers user) {
	this.user = user;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public int getQuant() {
	return quant;
}
public void setQuant(int quant) {
	this.quant = quant;
}



}

