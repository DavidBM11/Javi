package com.gsd.daw.prog;

public class PilaStrings {

	private Nodo c;

	public PilaStrings() {
		this.c = null;
	}
	
	
	public void push(String s) {
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
	
	public String pop() {
		if(c!=null) {
			String dato= c.getDato();
			c=c.getNext();
			return dato;
		}else {
			return null;
		}
		
	}
	
	public void  peek() {
		Nodo aux=c;
		if(aux!=null) {
			System.out.println(aux.getDato()); 
		}
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
