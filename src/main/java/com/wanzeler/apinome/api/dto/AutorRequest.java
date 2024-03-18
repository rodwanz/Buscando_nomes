package com.wanzeler.apinome.api.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.URL;

import com.wanzeler.apinome.api.domain.model.Autor;

public class AutorRequest {
	
	
	private @NotBlank String nome;
	private @NotBlank @URL String linkGithub;
	
	@Deprecated
	public AutorRequest() {}
	
	public AutorRequest(@NotBlank String nome, @NotBlank @URL String linkGithub) {
		super();
		this.nome = nome;
		this.linkGithub = linkGithub;
	}
			
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinkGithub() {
		return linkGithub;
	}

	public void setLinkGithub(String linkGithub) {
		this.linkGithub = linkGithub;
	}

	public Autor naFormaAutor() {
		return new Autor(nome, linkGithub);
	}
}
