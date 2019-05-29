package com.yazar.takip.demo.service;

import java.util.List;

import com.yazar.takip.demo.entity.Kitapbilgi;
import com.yazar.takip.demo.entity.Yazarbilgi;

public interface YazarService {
	
	public List<Yazarbilgi> getyazar();

	public Kitapbilgi getkitap(int id);

	public void saveyazar(Yazarbilgi themodel);

	public Yazarbilgi getyazarid(int theid);

	public void deleteyazar(int theid);

}
