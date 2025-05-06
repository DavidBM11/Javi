package com.gsd.daw.prog;

public class ListaEnteros {

	private Nodo centinela;

	public ListaEnteros() {
		this.centinela = null;
	}
	
	public void add(int n) {
		Nodo aux = new Nodo(n);
		if(centinela==null) {
			centinela=aux;
		}else {
		Nodo act = centinela;
		while(act.nodo !=null) {
			act= act.nodo;
		}
		
			act.nodo= aux;
		}
	}		
	
	
}
