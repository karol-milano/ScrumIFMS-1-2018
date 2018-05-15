package com.routiners.aqcomunica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastrarUsuarioController {

	@RequestMapping("/cadastrarUsuario")
	public String cadastrarUsuario() {
		return "cadastrarUsuario";
	}
}
