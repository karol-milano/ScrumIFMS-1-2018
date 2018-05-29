package com.routiners.aqcomunica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.routiners.aqcomunica.models.Categoria;
import com.routiners.aqcomunica.models.Eventos;
import com.routiners.aqcomunica.repository.CategoriaRepository;
import com.routiners.aqcomunica.repository.EventosRepository;

@Controller
public class CadastrarEventoController {

	@Autowired
	private EventosRepository er;
	
	@Autowired
	private CategoriaRepository cr;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public ModelAndView evento() {
		ModelAndView mv = new ModelAndView("cadastrarEvento");
		Iterable<Categoria> categorias = cr.findAll();
		mv.addObject(categorias);
		return mv;
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String evento(Eventos evento) {
		er.save(evento);
		return "redirect:/cadastrarEvento";
	}
	
}
