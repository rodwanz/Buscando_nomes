package com.wanzeler.apinome.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wanzeler.apinome.entities.Pessoa;
import com.wanzeler.apinome.repositories.PessoaRepository;

@Configuration
@Profile("test")
public class TesteNome implements CommandLineRunner{
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pessoa p1 = new Pessoa(null, "Miguel Wanzeler", "javali@gmail.com", "Av. Brasil, 33.000");
		Pessoa p2 = new Pessoa(null, "Susane Alves", "susemig@gmail.com", "Av. Brasil, 33.000");
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2));
		
	}
}
