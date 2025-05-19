package com.gsd.daw.prog;

public class ListaCircular {
	
	private Nodo c;
	
	public ListaCircular() {
		this.c = null;
	}
	
	public void add(String s) {
		Nodo aux = new Nodo(s);
		if(c==null) {
			c=aux;
			aux.setNext(c);
		}
		else {
			Nodo aux2=c;
			while(aux2.getNext()!=c) {
				aux2 = aux2.getNext();
			}
			aux2.setNext(aux);
			aux.setNext(c);
		}
	}
	
	public void add(String s, int pos) {
		int cont=0;
		Nodo aux = new Nodo(s);
		Nodo aux2 = c;aux.setNext(c);
		if(c.getNext()==c) {
			c.setNext(aux);
		}
		Nodo aux3 = aux2;
		while(aux3.getNext()!=c) {
			aux3=aux2;
			aux2=aux3.getNext();
			cont++;
			if(cont == pos) {
				aux3.setNext(aux);
				aux.setNext(aux2);
			}
		}
		
	}
	
	public String get(int n) {
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
	
	
	public int search(String s) {
		Nodo aux = c;
		int cont =0;
		 do{
			if(aux.getDato()==s) {
				return cont;
			}
			aux=aux.getNext();
			cont++;
		}while(aux!=c);
		throw new IllegalArgumentException();
	}

	
	public int size() {
		Nodo aux = c;
		int cont =1;
		while(aux.getNext()!= c) {
			aux=aux.getNext();
			cont++;
		}
		return cont;
	}
	
	
	public void print() {
		Nodo aux = c;
		 do{
			System.out.println(aux.getDato());
			aux=aux.getNext();
			
		}while(aux!=c);
	}
	
	
//	public void sort() {
//		if(c==null || c.getNext()==null) {
//			return;
//		}
//		boolean ord = false;
//		while(!ord) {
//			ord= true;
//			Nodo aux = c;
//			while(aux.getNext()!=null) {
//				if(aux.getDato()>aux.getNext().getDato()) {
//					String act=aux.getDato();
//					aux.setDato(aux.getNext().getDato());
//					aux.getNext().setDato(act);;
//					ord=false;
//				}
//				aux=aux.getNext();
//			}
//			
//		}
//	}
	
	public boolean isEmpty() {
		if(c!=null) {
			return false;
		}
		return true;
	}
}
