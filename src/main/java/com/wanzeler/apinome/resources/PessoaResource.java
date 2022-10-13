package com.wanzeler.apinome.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wanzeler.apinome.entities.Pessoa;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {
	
	@GetMapping
	public ResponseEntity<Pessoa> findAll(){
		Pessoa ps = new Pessoa(1l, "Migel", "migel@gmail.con", "Av. Brasil 33.000");
		return ResponseEntity.ok().body(ps);
	}

}
