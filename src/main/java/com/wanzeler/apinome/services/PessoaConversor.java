package com.wanzeler.apinome.services;

import org.springframework.stereotype.Component;

import com.wanzeler.apinome.entities.Pessoa;
import com.wanzeler.apinome.exception.PessoaResourceException;
import com.wanzeler.apinome.resources.PessoaResource;

@Component
public class PessoaConversor {
	
	public Pessoa conversor(PessoaResource pessoaResource) 
			throws PessoaResourceException {
		
		try {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(pessoaResource.getNome());
			pessoa.setEmail(pessoaResource.getEmail());
			pessoa.setEndereco(pessoaResource.getEndereco());
			return pessoa;
			
		}catch (Exception e) {
			throw new PessoaResourceException(
					"Falha ao converter o resource para entidade, resource: " + 
			pessoaResource);
		}
		
	}
}
