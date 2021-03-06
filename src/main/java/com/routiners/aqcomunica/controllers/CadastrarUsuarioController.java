package com.routiners.aqcomunica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.routiners.aqcomunica.models.Usuario;
import com.routiners.aqcomunica.repository.UsuariosRepository;

@Controller
public class CadastrarUsuarioController {
	
	@Autowired
	private UsuariosRepository ur;
	
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.GET)
	public String cadastrarUsuario() {
		return "cadastrarUsuario";
	}
	
	@RequestMapping(value="/cadastrarUsuario", method=RequestMethod.POST)
	public String cadastrarUsuario(Usuario usuario) {
		ur.save(usuario);
		return "redirect:/";	//trocar para redirecionar para página de login
	}
}
