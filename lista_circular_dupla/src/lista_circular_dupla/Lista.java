package lista_circular_dupla;

public class Lista {
	private Node inicio;
	private Node fim;
	
	public Lista() {
		inicio = null;
		fim = null;
	}
	
	public Node getFim() {
		return fim;
	}
	public void setFim(Node fim) {
		this.fim = fim;
	}
	public Node getInicio() {
		return inicio;
	}
	public void setInicio(Node inicio) {
		this.inicio = inicio;
	}
	
	public void adicionar(int valor) {
		Node novoNo = new Node(valor);
		if(inicio == null && fim == null) {
			novoNo.setProx(novoNo);
			novoNo.setAnterior(novoNo);
			inicio = novoNo;
			fim = novoNo;
		}else {
			novoNo.setProx(inicio);
			novoNo.setAnterior(fim);
			inicio.setAnterior(novoNo);
			fim.setProx(novoNo);
			fim = novoNo;
			
		}
	}
	
	public void percorrerParaFrente() {
	    if (inicio == null) {
	        System.out.println("A lista está vazia!");
	        return;
	    }

	    Node atual = inicio;
	    do {
	        System.out.print(atual.getValor() + " ");
	        atual = atual.getProx();
	    } while (atual != inicio);
	    System.out.println();
	}

	public void percorrerParaTras() {
	    if (inicio == null) {
	        System.out.println("A lista está vazia!");
	        return;
	    }

	    Node atual = fim;
	    do {
	        System.out.print(atual.getValor() + " ");
	        atual = atual.getAnterior();
	    } while (atual != fim);
	    System.out.println();
	}
	
	public void remover(int info) {
	    if (inicio == null) {
	        System.out.println("A lista está vazia!");
	        return;
	    }

	    Node atual = inicio;
	    do {
	        if (info == atual.getValor()) {
	            if (inicio == fim) {
	                inicio = null;
	                fim = null;
	            } else {
	                atual.getProx().setAnterior(atual.getAnterior());
	                atual.getAnterior().setProx(atual.getProx());

	                if (atual == inicio) {
	                    inicio = atual.getProx();
	                }
	                if (atual == fim) {
	                    fim = atual.getAnterior();
	                }
	            }
	            // Limpar as referências do nó removido
	            atual.setProx(null);
	            atual.setAnterior(null);
	            return;
	        }
	        atual = atual.getProx();
	    } while (atual != inicio);

	    System.out.println("Elemento não encontrado na lista");
	}

} 
