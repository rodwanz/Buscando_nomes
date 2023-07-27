package com.wanzeler.apinome.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wanzeler.apinome.domain.model.Autor;
import com.wanzeler.apinome.domain.repositories.AutorRepository;
import com.wanzeler.apinome.domain.services.CadastrandoNomeAutor;

@RestController
@RequestMapping(value = "/autores")
public class AutorController {

	@Autowired
	private CadastrandoNomeAutor cadastroAutor;
	
	@Autowired
	private AutorRepository autorRepository;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Autor adicionandoAutor(@RequestBody @Valid Autor autor) {
			return cadastroAutor.saLvo(autor);
	}
	
	@GetMapping
	public List<Autor> todosOsAutores(){
		    return autorRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Autor buscandoUmAutorPorVez(@PathVariable Long id) {
		    return cadastroAutor.encontraENaoEncontraAutor(id);
	}
}
