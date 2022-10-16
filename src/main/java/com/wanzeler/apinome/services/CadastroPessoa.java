package com.wanzeler.apinome.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.wanzeler.apinome.entities.Pessoa;
import com.wanzeler.apinome.repositories.PessoaRepository;

public class CadastroPessoa {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	public void cadastro(Pessoa pessoa) {	
		pessoaRepository.saveAndFlush(pessoa);
	}
}
