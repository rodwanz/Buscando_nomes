package com.wanzeler.apinome.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanzeler.apinome.entities.Pessoa;
import com.wanzeler.apinome.exception.PessoaNotFoundException;
import com.wanzeler.apinome.repositories.PessoaRepository;

@Service
public class BuscarPessoaPorId {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa buscarPorId(Long id) throws PessoaNotFoundException {
		Optional<Pessoa> optionalPessoa = getOptional(id);
		Pessoa pessoa = new Pessoa();
		if(!optionalPessoa.isPresent()) {
			throw new PessoaNotFoundException
			("Pessoa não encontrada pelo ID");
		}else {
			pessoa = optionalPessoa.get();
		}
		return pessoa;
	}
	
	private Optional<Pessoa> getOptional(long id){
		Optional<Pessoa> optionalPessoa = pessoaRepository.findById(id);
		return optionalPessoa;
	}
}
