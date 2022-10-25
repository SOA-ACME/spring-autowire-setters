package com.trifulcas.springprueba;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("miSaludo")
public class Saludos {
	
	private ISaludo _saludo;
	
	@Autowired
	@Qualifier("formal")
	public void setSaludos(ISaludo miSaludo) {
		_saludo=miSaludo;
	}
	public String hola() {
		return _saludo.hola();
	}
	public String adios() {
		return _saludo.adios();
	}
}
