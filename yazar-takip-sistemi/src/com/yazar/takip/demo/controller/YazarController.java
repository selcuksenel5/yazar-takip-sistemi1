package com.yazar.takip.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yazar.takip.demo.entity.Kitapbilgi;
import com.yazar.takip.demo.entity.Yazarbilgi;
import com.yazar.takip.demo.service.YazarService;

@Controller
@RequestMapping("/yazar")
public class YazarController {
	
	@Autowired
	YazarService _yazarservices;

	@GetMapping("/list")
	public String yazargetir(Model themodel)
	{
		List<Yazarbilgi> liste=_yazarservices.getyazar();
		themodel.addAttribute("yazarlar", liste);
		return "yazar-show";
	}
	
	@GetMapping("/kitapbilgi")
	public String kitapbilgi(@RequestParam("kitapid")int id,Model themodel)
	{
		Kitapbilgi _kitapbilgi=_yazarservices.getkitap(id);
		themodel.addAttribute("kitapbilgi", _kitapbilgi);
		return "kitap-show";
	}
	
	@GetMapping("/yazarekle")
	public String yazarekleme(Model themodel)
	{
		Yazarbilgi _yazarbilgi=new Yazarbilgi();
		themodel.addAttribute("yazarbilgi", _yazarbilgi);
		
		return "yazar-ekle";
	}
	@PostMapping("/yazarkaydetaction")
	public String yazarkaydetme(@ModelAttribute("yazarbilgi")Yazarbilgi themodel)
	{
		_yazarservices.saveyazar(themodel);
		return "redirect:/yazar/list";
	}
	@GetMapping("/showFormForUpdate")
	public String yazarkitapguncelleme(@ModelAttribute("yazarid")int theid,Model themodel)
	{
		Yazarbilgi _yazarbilgi=_yazarservices.getyazarid(theid);
		themodel.addAttribute("yazarbilgi", _yazarbilgi);
		return "yazar-ekle";
	}
	@GetMapping("/delete")
	public String yazarsil(@RequestParam("yazarid")int theid)
	{
		_yazarservices.deleteyazar(theid);
		return "redirect:/yazar/list";
	}
}
