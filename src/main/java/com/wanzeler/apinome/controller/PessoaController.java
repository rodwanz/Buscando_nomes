package com.wanzeler.apinome.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanzeler.apinome.entities.Pessoa;
import com.wanzeler.apinome.exception.PessoaNotFoundException;
import com.wanzeler.apinome.resources.PessoaResource;
import com.wanzeler.apinome.services.BuscarPessoaPorId;
import com.wanzeler.apinome.services.BuscarPessoas;
import com.wanzeler.apinome.services.CadastroPessoa;

@RestController
@RequestMapping(value = "/api")
public class PessoaController {

	@Autowired
	private BuscarPessoas servicePessoa;

	@Autowired
	private CadastroPessoa cadastroPessoa;
	
	@Autowired
	private BuscarPessoaPorId buscarPessoaPorId;
	

	@GetMapping(path = "/pessoa")
	public List<Pessoa> buscarPessoa() {
		return servicePessoa.buscarTodos();
	}

	@GetMapping(path = "/pessoa/id/{id}")
	public Pessoa buscarPessasPorId(
			@PathVariable(name = "id", required = true) Long id)
			throws PessoaNotFoundException {
		return buscarPessoaPorId.buscarPorId(id);
	}

	@PostMapping(path = "/pessoa/save")
	public void salvarPessoa(@RequestBody PessoaResource pessoa) {
		cadastroPessoa.cadastro(pessoa);
	}
}
