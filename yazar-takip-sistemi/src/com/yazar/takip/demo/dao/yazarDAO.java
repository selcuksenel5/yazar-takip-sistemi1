package com.yazar.takip.demo.dao;

import java.util.List;

import com.yazar.takip.demo.entity.Kitapbilgi;
import com.yazar.takip.demo.entity.Yazarbilgi;

public interface yazarDAO {
	
	public List<Yazarbilgi> getyazar();

	public Kitapbilgi getyazar(int id);

	public void saveyazar(Yazarbilgi themodel);
	
	public Yazarbilgi getyazarid(int id);

	public void deleteyazar(int theid);

}
