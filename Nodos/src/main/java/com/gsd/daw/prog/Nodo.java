package com.gsd.daw.prog;

public class Nodo {
	
	private int dato;
	private Nodo next;
	
	public Nodo(int dato) {
		this.dato = dato;
		this.next = null;
	}
	
	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getNext() {
		return next;
	}

	public void setNext(Nodo next) {
		this.next = next;
	}

	
	@Override
	public String toString() {
		return "Nodo [dato=" + dato + ", next=" + next + "]";
	}
	
	

}
