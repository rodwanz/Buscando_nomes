package com.wanzeler.apinome.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanzeler.apinome.entities.Pessoa;
import com.wanzeler.apinome.repositories.PessoaRepository;

@Service
public class BuscarPessoas {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<Pessoa> buscarTodos(){
		List<Pessoa> listaPessoa = pessoaRepository.findAll();
		return listaPessoa;
	}
}
