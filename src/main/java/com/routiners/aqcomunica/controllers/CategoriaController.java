package com.routiners.aqcomunica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.routiners.aqcomunica.models.Categoria;
import com.routiners.aqcomunica.repository.CategoriaRepository;

@Controller
public class CategoriaController {

	
	@Autowired
	private CategoriaRepository cr;
	
	@RequestMapping(value="/cadastrarCategoria", method=RequestMethod.GET)
	public String cadastrarUsuario() {
		return "cadastrarCategoria";
	}
	
	@RequestMapping(value="/cadastrarCategoria", method=RequestMethod.POST)
	public String cadastrarUsuario(Categoria categoria) {
		cr.save(categoria);
		return "redirect:/cadastrarCategoria";
	}
}
