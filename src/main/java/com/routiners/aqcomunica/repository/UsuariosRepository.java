package com.routiners.aqcomunica.repository;

import org.springframework.data.repository.CrudRepository;

import com.routiners.aqcomunica.models.Usuario;

public interface UsuariosRepository extends CrudRepository<Usuario, String>{

	Usuario findById(long id);
}

