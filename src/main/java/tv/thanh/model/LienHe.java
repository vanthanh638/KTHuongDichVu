package tv.thanh.model;

import javax.persistence.*;

@Entity
@Table(name = "lienhe")
public class LienHe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String ten;
	
	private String email;
	private String sodienthoai;
	private String noidung;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public LienHe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LienHe(int id, String ten, String email, String sodienthoai, String noidung) {
		super();
		this.id = id;
		this.ten = ten;
		this.email = email;
		this.sodienthoai = sodienthoai;
		this.noidung = noidung;
	}
	

}
