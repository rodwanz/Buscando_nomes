package com.wanzeler.apinome.domain.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	@Size(max = 100)
	@Column(name = "titulo")
	private String titulo;
	
	@Size(max = 12)
	@Column(name = "isbn")
	private String isbn;
	
	@Size(min = 100)
	@Column(name = "número_de_páginas")
	private String numeroPaginas;
	
	@Size(max = 500)
	@Column(name = "resumo")
	private String resumo;
	
	@Column(name = "sumário")
	private String sumario;
	
	@Column(name = "data_da_publicação")
	private LocalDate dataPublicacao;
	
	@ManyToOne
	@JoinColumn(name = "autor_id")
	private Autor autor;

}
