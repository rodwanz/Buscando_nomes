package com.wanzeler.apinome.resources;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PessoaResource implements Serializable{
	private static final long serialVersionUID = 1L;


	@JsonProperty("nome_pessoa")
	private String nome;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("endereco")
	private String endereco;
	
	@JsonProperty("id_Pessoa")
	private String idPessoa; 
}
