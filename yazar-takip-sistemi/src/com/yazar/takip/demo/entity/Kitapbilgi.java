package com.yazar.takip.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="kitapbilgi")
public class Kitapbilgi {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="kitap_sayfa")
	public int kitapsayfa;
	
	@Column(name="kitap_basim_yili")
	public int kitapbasimyili;
	
	@Column(name="kitap_ozeti")
	public String kitapozeti;
	
	public String getKitapozeti() {
		return kitapozeti;
	}
	public void setKitapozeti(String kitapozeti) {
		this.kitapozeti = kitapozeti;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getKitapsayfa() {
		return kitapsayfa;
	}
	public void setKitapsayfa(int kitapsayfa) {
		this.kitapsayfa = kitapsayfa;
	}
	public int getKitapbasimyili() {
		return kitapbasimyili;
	}
	public void setKitapbasimyili(int kitapbasimyili) {
		this.kitapbasimyili = kitapbasimyili;
	}
	@Override
	public String toString() {
		return "Kitapbilgi [id=" + id + ", kitapsayfa=" + kitapsayfa + ", kitapbasimyili=" + kitapbasimyili
				+ ", kitapozeti=" + kitapozeti + "]";
	}
	
	

}
