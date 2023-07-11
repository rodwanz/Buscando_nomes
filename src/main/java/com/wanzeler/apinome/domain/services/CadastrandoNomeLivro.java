package com.wanzeler.apinome.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wanzeler.apinome.domain.exception.AutorNotFound;
import com.wanzeler.apinome.domain.exception.LivroNotFound;
import com.wanzeler.apinome.domain.model.Autor;
import com.wanzeler.apinome.domain.model.Livro;
import com.wanzeler.apinome.domain.repositories.AutorRepository;
import com.wanzeler.apinome.domain.repositories.LivroRepository;

@Service
public class CadastrandoNomeLivro {
	
	@Autowired
	LivroRepository livroRepository;
	
	@Transactional(readOnly = false)
	public Livro saLvo(Livro livro){
		return livroRepository.save(livro); 
	}
	
	@Transactional(readOnly = false)
	public Livro salvandoAutor(Long id) {
		return livroRepository.findById(id)
				.orElseThrow(() -> new LivroNotFound("Livro não encontrado!"));		
	}
	
}
