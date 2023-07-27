package com.wanzeler.apinome.domain.exception;

public class AutorNaoEncontrado extends AutorException{
	private static final long serialVersionUID = 1L;

	public AutorNaoEncontrado(String mensagem) {
		super(mensagem);
	}
}
