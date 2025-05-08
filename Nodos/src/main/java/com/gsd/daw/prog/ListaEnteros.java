package com.gsd.daw.prog;

public class ListaEnteros {

	private Nodo c;

	public ListaEnteros() {
		this.c=null;
	}
	

	
	public void add(int n) {
		Nodo aux = new Nodo(n);
		if(c==null) {
			c=aux;
		}
		else {
			Nodo aux2=c;
			while(aux2.getNext()!=null) {
				aux2 = aux2.getNext();
			}
			aux2.setNext(aux);
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
		throw new IndexOutOfBoundsException("No existe");
	}
	
	
}
