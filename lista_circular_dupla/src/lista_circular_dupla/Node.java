package lista_circular_dupla;

public class Node {
	private int valor;
	private Node prox;
	private Node anterior;
	
	public Node(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Node getProx() {
		return prox;
	}
	public void setProx(Node prox) {
		this.prox = prox;
	}
	public Node getAnterior() {
		return anterior;
	}
	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}
}
