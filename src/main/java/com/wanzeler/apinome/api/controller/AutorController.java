package com.wanzeler.apinome.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wanzeler.apinome.domain.model.Autor;
import com.wanzeler.apinome.domain.services.CadastrandoNomeAutor;

@RestController
@RequestMapping(value = "/api")
public class AutorController {

	@Autowired
	private CadastrandoNomeAutor cadastroAutor;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Autor adicionandoAutor(@RequestBody Autor autor) {
		return cadastroAutor.saLvo(autor);
	}
}
