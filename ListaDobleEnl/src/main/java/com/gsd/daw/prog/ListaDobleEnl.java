package com.gsd.daw.prog;

public class ListaDobleEnl {
	
	private Nodo c;
	
	
	public void add(String s) {
		Nodo aux = new Nodo(s);
		if(c==null) {
			c=aux;
		}
		else {
			Nodo aux2=c;
			while(aux2.getNext()!=null) {
				aux2 = aux2.getNext();
			}
			aux2.setNext(aux);
			aux2.setPrev(aux2);
		}
	}
	
	public void add(String s, int pos) {
		Nodo aux = new Nodo(s);
		if(pos ==0) {
			aux.setNext(c);
			if(c!=null) 
				c.setPrev(aux);
			c=aux;
			return;
		}
		Nodo aux2 = c;
		for(int i=0;i<pos-1;i++) {
			aux2 = aux2.getNext();
		}
		aux.setNext(aux2.getNext());
		if(aux2.getNext()!= null) {
			aux2.getNext().setPrev(aux);
		}
		aux2.setNext(aux);
		aux.setPrev(aux2);

	}
	
	public String get(int n) {
		int pos =0;
		Nodo aux = c;
		Nodo aux2 = aux;
		while(aux.getNext()!=c) {
			aux2=aux;
			aux=aux2.getNext();
			pos++;
			if(pos==n) {
				return aux.getDato();
			}
		}
		throw new IllegalArgumentException();
	}

	
	public void remove(int n) {
		int pos=0;
		Nodo aux = c;
		Nodo aux2 = aux;
		if(c.getNext()==c) {
			return;
		}
		while(aux.getNext()!=c) {
			aux2=aux;
			aux=aux2.getNext();
			pos++;
			if(pos==n) {
				aux2.setNext(aux.getNext());
				aux.getNext().setPrev(aux2);
				return;
			}
		}
		
	}
	
	public int search(String s) {
		Nodo aux=c;
		int cont =0;
		while(aux!=null) {
			if(aux.getDato().equals(s)) {
				return cont;
			}
			aux=aux.getNext();
			cont++;
		}
		throw new IllegalArgumentException();
	}
	
	public int size() {
		int cont=0;
		Nodo aux =c;
		while(aux!=null) {
			cont++;
			aux=aux.getNext();
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
	
	public void sort() {
		boolean ord=false;
		while(ord) {
			Nodo aux=c;
			while(aux.getNext()!=null) {
				if(aux.getDato().compareTo(aux.getNext().getDato())>0){
					String tmp=aux.getDato();
					aux.setDato(aux.getNext().getDato());
					aux.getNext().setDato(tmp);
					ord=true;
				}
				aux=aux.getNext();
			}
		}
	}
	
	public boolean isEmpty() {
		if(c!=null) {
			return false;
		}
		return true;
	}
}
