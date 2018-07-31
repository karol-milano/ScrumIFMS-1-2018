package com.routiners.aqcomunica.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.routiners.aqcomunica.models.Eventos;
import com.routiners.aqcomunica.repository.EventosRepository;
import java.util.Date;

@Controller
public class EnviarRelatório {
	
	@Autowired
	private EventosRepository ev;
	private Eventos dataLimiteEvento;
	private Date dataAtual;
	
}
