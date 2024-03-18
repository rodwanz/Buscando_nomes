package com.wanzeler.apinome.api.domain.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.URL;


@Entity
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private @NotBlank String nome;
	private @NotBlank @URL String linkGithub;
	
	public Autor(@NotBlank String nome, @NotBlank @URL String linkGithub) {
		super();
		this.nome = nome;
		this.linkGithub = linkGithub;
	}
		
	@Override
	public String toString() {
		return "Autor [nome = " + nome + ", linkGithub = " + linkGithub + "]";
	}

	public String getNome() {
		return nome;
	}
}
