package com.wanzeler.apinome.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanzeler.apinome.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
	

}
