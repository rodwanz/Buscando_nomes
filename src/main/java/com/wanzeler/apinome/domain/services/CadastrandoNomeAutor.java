package com.wanzeler.apinome.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wanzeler.apinome.domain.exception.AutorNaoEncontrado;
import com.wanzeler.apinome.domain.model.Autor;
import com.wanzeler.apinome.domain.repositories.AutorRepository;

@Service
public class CadastrandoNomeAutor {
		
	@Autowired
	private AutorRepository autorRepository;
	
	
	@Transactional(readOnly = false)
	public Autor saLvo(Autor autor){
		return autorRepository.save(autor); 
	}
	
	@Transactional(readOnly = false)
	public Autor encontraENaoEncontraAutor(Long id) {
		return autorRepository.findById(id)
				.orElseThrow(() -> new AutorNaoEncontrado(String.format("Autor não encontrado!")));		
	}
}
