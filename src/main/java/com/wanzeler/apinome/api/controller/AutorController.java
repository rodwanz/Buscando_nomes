package com.wanzeler.apinome.api.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wanzeler.apinome.api.domain.model.Autor;
import com.wanzeler.apinome.api.dto.AutorRequest;



@RestController
public class AutorController {
	
	@PersistenceContext
	private EntityManager gerenciando;

	@PostMapping
	public String adicionandoAutor(@RequestBody @Valid AutorRequest solicitando) {
		Autor novoAutor = solicitando.naFormaAutor();
		gerenciando.persist(novoAutor);
		return novoAutor.toString();
	}
}
