package com.yazar.takip.demo.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yazar.takip.demo.entity.Kitapbilgi;
import com.yazar.takip.demo.entity.Yazarbilgi;

@Repository
public class yazarDAOimpl implements yazarDAO {

	@Autowired
	SessionFactory _sessionfactory;
	
	@Override
	public List<Yazarbilgi> getyazar() {
		// TODO Auto-generated method stub
		
		Session _session=_sessionfactory.getCurrentSession();
		Query<Yazarbilgi> sorgu=_session.createQuery("from Yazarbilgi",Yazarbilgi.class);
		List<Yazarbilgi> listem=sorgu.getResultList();
		
		return listem;
	}

	@Override
	public Kitapbilgi getyazar(int id) {
		// TODO Auto-generated method stub
		Session _session=_sessionfactory.getCurrentSession();
		Kitapbilgi _kitapbilgi=_session.get(Kitapbilgi.class, id);
		return _kitapbilgi;
	}

	@Override
	public void saveyazar(Yazarbilgi themodel) {
		Session _session=_sessionfactory.getCurrentSession();
		_session.saveOrUpdate(themodel);
	}

	@Override
	public Yazarbilgi getyazarid(int id) {
		// TODO Auto-generated method stub
		Session _session=_sessionfactory.getCurrentSession();
		Yazarbilgi _yazarbilgi=_session.get(Yazarbilgi.class, id);
		return _yazarbilgi;
	}

	@Override
	public void deleteyazar(int theid) {
		Session _session=_sessionfactory.getCurrentSession();
		Yazarbilgi _yazarbilgi=_session.get(Yazarbilgi.class, theid);
		_session.delete(_yazarbilgi);
	}

}
