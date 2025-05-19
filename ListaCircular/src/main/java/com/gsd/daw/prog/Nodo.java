package com.gsd.daw.prog;

public class Nodo {
	
	private String dato;
	private Nodo next;
	
	public Nodo(String dato) {
		this.dato = dato;
		this.next = null;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}
	
	

	
}
