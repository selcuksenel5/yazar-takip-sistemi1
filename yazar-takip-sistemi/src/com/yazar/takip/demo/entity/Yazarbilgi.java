package com.yazar.takip.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="yazarbilgi")
public class Yazarbilgi {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="yazar_adi")
	public String yazarAdi;
	
	@Column(name="yazar_soyadi")
	public String yazarSoyadi;
	
	@Column(name="kitap_adi")
	public String kitapAdi;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="kitap_id")
	private Kitapbilgi kitapbilgi;
	
	public Yazarbilgi()
	{
		
	}
	
	public Yazarbilgi(String yazarAdi, String yazarSoyadi, String kitapAdi) {
		super();
		this.yazarAdi = yazarAdi;
		this.yazarSoyadi = yazarSoyadi;
		this.kitapAdi = kitapAdi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public String getYazarSoyadi() {
		return yazarSoyadi;
	}

	public void setYazarSoyadi(String yazarSoyadi) {
		this.yazarSoyadi = yazarSoyadi;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public Kitapbilgi getKitapbilgi() {
		return kitapbilgi;
	}

	public void setKitapbilgi(Kitapbilgi kitapbilgi) {
		this.kitapbilgi = kitapbilgi;
	}

	@Override
	public String toString() {
		return "Yazarbilgi [id=" + id + ", yazarAdi=" + yazarAdi + ", yazarSoyadi=" + yazarSoyadi + ", kitapAdi="
				+ kitapAdi + ", kitapbilgi=" + "]";
	}

	

}
