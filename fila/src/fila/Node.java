package fila;

public class Node {
	private int valor;
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
	public Node getAnterior() {
		return anterior;
	}
	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}
}
