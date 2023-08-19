package lista_duplamente_encadeada;

public class ListaDupla {
    private No ref;
    private No ultimo;
    private int tamanho;

    public ListaDupla() {
        this.tamanho = 0;
    }

    public No getRef() {
        return ref;
    }

    public void setRef(No ref) {
        this.ref = ref;
    }

    public No getUltimo() {
        return ultimo;
    }

    public void setUltimo(No ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

	public void insere(int info) {
		No novoNo = new No(info);
		No atual = this.ref;
		No anterior = null;
		if (this.ref == null && this.ultimo == null) {
			this.ref = novoNo;
			this.ultimo = novoNo;
		}else {
			while (atual != null && atual.getValor() < info) {
				anterior = atual;
				atual = atual.getProximo();
			}
			
			if (anterior == null) {
				novoNo.setProximo(this.ref);
				this.ref = novoNo;
			}else if (atual == null) {
				anterior.setProximo(novoNo);
				this.ultimo = novoNo;
			}else {
				anterior.setProximo(novoNo);
				novoNo.setProximo(atual);
			}
		}
		this.tamanho++;
	}

	public void imprime() {
		System.out.println("Imprimir NÓS da lista do primeiro ao último: ");
		System.out.print("[ ");
		for(int i=0; i<this.tamanho;i++) {
			System.out.print(get(i).getValor()+" ");
		}
		System.out.print("]\n");
		System.out.println("Imprimir NÓS da lista do último ao primeiro: ");
		System.out.print("[ ");
		for(int i=this.tamanho-1; i >= 0;i--) {
			System.out.print(get(i).getValor()+" ");
		}
		System.out.print("]\n");
	}
	
	public boolean listaVazia() {
		if (this.tamanho == 0) {
			return true;
		}else {
			return false;
		}
	}
		
	public void remove(int valorProcurado) {
	    No anterior = null;
	    No atual = this.ref;
	    boolean valorEncontrado = false;

	    while (atual != null && atual.getValor() <= valorProcurado) {
	        if (atual.getValor() == valorProcurado) {
	            valorEncontrado = true;

	            if (atual == this.ref) {
	                this.ref = atual.getProximo();
	            } else {
	                anterior.setProximo(atual.getProximo());
	            }
	            
	            if (atual == this.ultimo) {
	                this.ultimo = anterior;
	            }
	            
	            this.tamanho--;
	            atual = atual.getProximo();
	        } else {
	            anterior = atual;
	            atual = atual.getProximo();
	        }
	    }

	    if (!valorEncontrado) {
	        System.out.println("valor não encontrado na lista !");
	    }
	}
	
	public No get(int posicao) {
		No atual = this.ref;
		for(int i=0; i < posicao; i++) {
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}
}
