package abc.myProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int p_id;
	 private String p_name,p_desc_dialcolor,p_desc_bandcolor,p_desc_momenttype, p_desc_displaytype,p_desc_casematerial, p_desc_waterres, p_desc_warr;
	 private int p_price,p_quant;
	 @ManyToOne
	 private supplier p_sup;
	 @ManyToOne
	 private category p_cat;

	 @Transient
	 private MultipartFile p_image;
	 
	 public MultipartFile getP_image() {
		return p_image;
	}
	public void setP_image(MultipartFile p_image) {
		this.p_image = p_image;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
		public String getP_desc_dialcolor() {
		return p_desc_dialcolor;
	}
	public void setP_desc_dialcolor(String p_desc_dialcolor) {
		this.p_desc_dialcolor = p_desc_dialcolor;
	}
	public String getP_desc_bandcolor() {
		return p_desc_bandcolor;
	}
	public void setP_desc_bandcolor(String p_desc_bandcolor) {
		this.p_desc_bandcolor = p_desc_bandcolor;
	}
	public String getP_desc_momenttype() {
		return p_desc_momenttype;
	}
	public void setP_desc_momenttype(String p_desc_momenttype) {
		this.p_desc_momenttype = p_desc_momenttype;
	}
	public String getP_desc_displaytype() {
		return p_desc_displaytype;
	}
	public void setP_desc_displaytype(String p_desc_displaytype) {
		this.p_desc_displaytype = p_desc_displaytype;
	}
	public String getP_desc_casematerial() {
		return p_desc_casematerial;
	}
	public void setP_desc_casematerial(String p_desc_casematerial) {
		this.p_desc_casematerial = p_desc_casematerial;
	}
	public String getP_desc_waterres() {
		return p_desc_waterres;
	}
	public void setP_desc_waterres(String p_desc_waterres) {
		this.p_desc_waterres = p_desc_waterres;
	}
	public String getP_desc_warr() {
		return p_desc_warr;
	}
	public void setP_desc_warr(String p_desc_warr) {
		this.p_desc_warr = p_desc_warr;
	}
		public int getP_quant() {
		return p_quant;
	}
	public void setP_quant(int p_quant) {
		this.p_quant = p_quant;
	}
	
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public supplier getP_sup() {
		return p_sup;
	}
	public void setP_sup(supplier p_sup) {
		this.p_sup = p_sup;
	}
	public category getP_cat() {
		return p_cat;
	}
	public void setP_cat(category p_cat) {
		this.p_cat = p_cat;
	}
	 

}
