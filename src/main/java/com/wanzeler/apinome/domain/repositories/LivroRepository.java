package com.wanzeler.apinome.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanzeler.apinome.domain.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
