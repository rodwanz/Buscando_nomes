package com.wanzeler.apinome.domain.exception;

public class AutorException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public AutorException(String mensagem) {
		super(mensagem);
	}
	
	public AutorException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
