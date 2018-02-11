package abc.myProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int s_id;
	private String s_name,s_add;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_add() {
		return s_add;
	}
	public void setS_add(String s_add) {
		this.s_add = s_add;
	}
	
}
