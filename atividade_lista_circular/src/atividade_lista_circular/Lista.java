package atividade_lista_circular;

public class Lista {
	private No ref;
	
	public Lista() {
		ref = null;
	}

	public No getRef() {
		return ref;
	}
	public void setRef(No ref) {
		this.ref = ref;
	}
	
	public boolean listaVazia() {
		return ref == null;
	}
	
	public void insereOrdenado(int info) {
	    No novoNo = new No(info);

	    if(listaVazia()) {
	    	novoNo.setProximo(novoNo);
	    	ref = novoNo;
	    }else if (info >= ref.getValor()) {
	    	novoNo.setAnterior(ref);
	    	novoNo.setProximo(ref.getProximo());
	    	ref.setProximo(novoNo);
	    	ref = novoNo;
	    }else if (info <= ref.getProximo().getValor()) {
	    	novoNo.setProximo(ref.getProximo());
	    	ref.getProximo().setAnterior(novoNo);
	    	ref.setProximo(novoNo);
	    }else {
	    	No atual = ref;
	    	
	    	while(info <= atual.getValor()) {
	    		atual = atual.getAnterior();
	    		
	    		if(info > atual.getValor()) {
	    			novoNo.setAnterior(atual);
	    			novoNo.setProximo(atual.getProximo());
	    			atual.getProximo().setAnterior(novoNo);
	    			atual.setProximo(novoNo);
	    		}
	    	}
	    }
	}
	
	public void imprime() {
	    if (listaVazia()) {
	        System.out.println("A lista está vazia!");
	        return;
	    } else {
		    No atual = ref.getProximo();
		    while(atual != ref) {
		    	System.out.println(atual.getValor());
		    	atual = atual.getProximo();
		    }
		    System.out.println(ref.getValor());
	    }
	}
	
	public void remover () {
		if (listaVazia()) {
			System.out.println("Impossível remover, a lista está vazia!");
			return;
		} else if(ref.getProximo() == ref) {
			ref = null;
		}else {
			ref.getProximo().getProximo().setAnterior(ref);
			ref.setProximo(ref.getProximo().getProximo());
			
			No atual = ref.getProximo();
			while(atual != ref) {
				if(atual.getValor() == atual.getProximo().getValor()) {
					atual.setProximo(atual.getProximo().getProximo());
					atual.getProximo().getProximo().setAnterior(atual);
				}else if(atual.getProximo().getProximo() == ref && atual.getProximo().getValor() == ref.getValor()) {
					atual.setProximo(ref);
					ref.setAnterior(atual);
				}else {
					atual = atual.getProximo();
				}
			}
		}
	}
}
