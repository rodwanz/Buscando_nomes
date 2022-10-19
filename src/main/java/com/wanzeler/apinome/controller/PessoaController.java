package com.wanzeler.apinome.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanzeler.apinome.entities.Pessoa;
import com.wanzeler.apinome.repositories.PessoaRepository;

@RestController
@RequestMapping(value = "/api")
public class PessoaController {

	@Autowired
	private PessoaRepository pessoaRepository;

	@GetMapping(path = "/pessoa")
	public List<Pessoa> buscarPessoa() {
		return pessoaRepository.findAll();
	}

    @GetMapping(path = "/pessoa/id/{id}")
    public Optional<Pessoa> buscarNutricionistasPorId(
            @PathVariable(name = "id", required = true) Long id) {
        return pessoaRepository.findById(id);
    }
    
    @PostMapping(path = "pessoa/save")
    public void salvarPessoa(@RequestBody Pessoa pessoa) {
    	pessoaRepository.save(pessoa);
    }

}
