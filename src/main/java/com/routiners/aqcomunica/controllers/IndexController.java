package com.routiners.aqcomunica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.routiners.aqcomunica.models.Eventos;
import com.routiners.aqcomunica.repository.EventosRepository;

@Controller
public class IndexController {

	@Autowired
	private EventosRepository er;
	
	@RequestMapping("/")
	public ModelAndView listarEventos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Eventos> eventos = er.findAll();
		mv.addObject("eventos", eventos);
		
		return mv;
	}
	
	@RequestMapping("/{id}")
	public ModelAndView detalhesEvento(@PathVariable("id") long id) {
		Eventos evento = er.findById(id);
		ModelAndView mv = new ModelAndView("detalhesEvento");
		mv.addObject("evento", evento);
		return mv;
	}
}
