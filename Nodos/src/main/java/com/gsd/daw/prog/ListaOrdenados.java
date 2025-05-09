package com.gsd.daw.prog;

public class ListaOrdenados {
	
	private Nodo c;

	public ListaOrdenados() {
		this.c=null;
	}
	
	public void add(int n) {
		Nodo aux2 = new Nodo(n);
		if(c==null) {
			c=aux2;
		}
		else {
			Nodo aux=c;
			while(aux.getNext()!=null) {
				aux = aux.getNext();
			}
			aux.setNext(aux2);
		}
		if(c==null || c.getNext()==null) {
			return;
		}
		boolean ord = false;
		while(!ord) {
			ord= true;
			Nodo aux=c;
			while(aux.getNext()!=null) {
				if(aux.getDato()>aux.getNext().getDato()) {
					int act=aux.getDato();
					aux.setDato(aux.getNext().getDato());
					aux.getNext().setDato(act);;
					ord=false;
				}
				aux=aux.getNext();
			}
			
		}
	}
	
	public int get(int n) {
		Nodo aux = c;
		int cont =0;
		while(aux!=null) {
			if(cont==n) {
				return aux.getDato();
			}
			aux=aux.getNext();
			cont++;
		}
		throw new IllegalArgumentException("No existe");
	}
	
	public void remove(int n) {
		if(c==null) {
			return;
		}
		if(n==0) {
			c=c.getNext();
			return;
		}
		Nodo aux = c;
		int cont =0;

		while(aux.getNext()!=null) {
			if(cont==n-1) {
				aux.setNext(aux.getNext().getNext());
				return;
			}
			aux=aux.getNext();
			cont++;
		}
		throw new IllegalArgumentException("No existe");
	
	}
	
	public int size() {
		Nodo aux = c;
		int cont=1;
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
