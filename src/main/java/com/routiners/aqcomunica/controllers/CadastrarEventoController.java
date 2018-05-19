package com.routiners.aqcomunica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.routiners.aqcomunica.models.Eventos;
import com.routiners.aqcomunica.repository.EventosRepository;

@Controller
public class CadastrarEventoController {

	@Autowired
	private EventosRepository er;
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.GET)
	public String evento() {
		return "cadastrarEvento";
	}
	
	@RequestMapping(value="/cadastrarEvento", method=RequestMethod.POST)
	public String evento(Eventos evento) {
		er.save(evento);
		return "redirect:/cadastrarEvento";
	}
	
}
