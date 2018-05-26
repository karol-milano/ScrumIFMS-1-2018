package com.routiners.aqcomunica.repository;

import org.springframework.data.repository.CrudRepository;

import com.routiners.aqcomunica.models.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, String>{

	Categoria findById(long id);
}

