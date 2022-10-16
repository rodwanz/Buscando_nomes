package com.wanzeler.apinome.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wanzeler.apinome.entities.Pessoa;
import com.wanzeler.apinome.repositories.PessoaRepository;

@RestController
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping(path = "api/pessoa-id/{}")
	public ResponseEntity<Optional<Pessoa>> buscarPessoaPorId(
			@PathVariable(name = "id", required = true) Long idPessoa){
		return ResponseEntity.ok(pessoaRepository.findById(idPessoa));
	}
}
