package com.gsd.daw.prog;

public class ColaStrings {
	
	private Nodo c;

	public ColaStrings() {
		this.c = null;
	}
	
	
	public void enqueue(String s) {
		Nodo aux = new Nodo(s);
		if(c==null) {
			c=aux;
		}
		else {
		Nodo aux2 = c;
		c=aux;
		aux.setNext(aux2);
		}
		
	}
	
	public String dequeue() {
		Nodo aux=c;
		if(aux!=null) {
			return aux.getDato();
		}
		throw new IllegalArgumentException("Cola Vacia");
	}
	
	public int size() {
		Nodo aux = c;
		int cont = 1;
		if(aux==null) {
			throw new IllegalArgumentException("Cola Vacia");
		}
		while(aux.getNext()!=null) {
			aux=aux.getNext();
			cont++;
		}
		return cont;
	}
	
	public void print() {
		Nodo aux = c;
		while(aux!=null) {
			System.out.println(aux.getDato());
			aux=aux.getNext();
			
		}
	}

	public boolean isEmpty() {
		if(c!=null) {
			return false;
		}
		return true;
	}

}
