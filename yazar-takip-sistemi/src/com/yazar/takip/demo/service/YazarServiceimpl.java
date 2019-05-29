package com.yazar.takip.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yazar.takip.demo.dao.yazarDAO;
import com.yazar.takip.demo.entity.Kitapbilgi;
import com.yazar.takip.demo.entity.Yazarbilgi;

@Service
public class YazarServiceimpl implements YazarService {

	@Autowired
	yazarDAO _yazarDAO;
	
	@Override
	@Transactional
	public List<Yazarbilgi> getyazar() {
		
		return _yazarDAO.getyazar();
	}

	@Override
	@Transactional
	public Kitapbilgi getkitap(int id) {
		// TODO Auto-generated method stub
		return _yazarDAO.getyazar(id);
	}

	@Override
	@Transactional
	public void saveyazar(Yazarbilgi themodel) {
		_yazarDAO.saveyazar(themodel);
		
	}

	@Override
	@Transactional
	public Yazarbilgi getyazarid(int theid) {
		return _yazarDAO.getyazarid(theid);
	}

	@Override
	@Transactional
	public void deleteyazar(int theid) {
		_yazarDAO.deleteyazar(theid);
		
	}

}
