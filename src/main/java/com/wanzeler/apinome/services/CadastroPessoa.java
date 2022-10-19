package com.wanzeler.apinome.services;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanzeler.apinome.entities.Pessoa;
import com.wanzeler.apinome.exception.PessoaResourceException;
import com.wanzeler.apinome.repositories.PessoaRepository;
import com.wanzeler.apinome.resources.PessoaResource;

@Service
public class CadastroPessoa {
	
	private static final Logger LOG = Logger.getLogger(CadastroPessoa.class);
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@Autowired 
	PessoaConversor service;
	
	public void cadastro(PessoaResource pessoaResource) {	
		
		try {
			Pessoa pessoa = service.conversor(pessoaResource);
			pessoaRepository.saveAndFlush(pessoa);
		}catch(PessoaResourceException e ) {
			LOG.error("Erro ao salvar pessoa" + e.getMessage(), e);
		}
	}
}
