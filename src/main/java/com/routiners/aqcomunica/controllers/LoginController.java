package com.routiners.aqcomunica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.routiners.aqcomunica.models.Usuario;
import com.routiners.aqcomunica.repository.UsuariosRepository;

@Controller
public class LoginController {

	@Autowired
	private UsuariosRepository ur;
	
	@RequestMapping(value="/entrar", method=RequestMethod.GET)
	public String cadastrarUsuario() {
		return "entrar";
	}
	
	@RequestMapping(value="/entrar", method=RequestMethod.POST)
	public String cadastrarUsuario(Usuario usuario) {
		ur.getClass();						//COMPARAR SE OS DADOS INSERIDOS EXISTEM NO BANCO DE DADOS
		return "redirect:/";
	}
}
