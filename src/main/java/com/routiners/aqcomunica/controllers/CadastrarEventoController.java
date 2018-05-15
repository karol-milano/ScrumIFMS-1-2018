package com.routiners.aqcomunica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastrarEventoController {

	@RequestMapping("/cadastrarEvento")
	public String evento() {
		return "cadastrarEvento";
	}
}
