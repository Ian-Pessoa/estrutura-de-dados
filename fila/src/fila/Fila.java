package fila;

public class Fila {
	private Node inicio;
	private Node fim;
	
	public Fila() {
		inicio = null;
		fim = null;
	}
	
	public Node getInicio() {
		return inicio;
	}
	public void setInicio(Node inicio) {
		this.inicio = inicio;
	}
	public Node getFim() {
		return fim;
	}
	public void setFim(Node fim) {
		this.fim = fim;
	}
	
	public void adicionar(int novoValor) {
		Node novoNo = new Node(novoValor);
		
		if(inicio == null && fim == null) {
			inicio = novoNo;
			fim = novoNo;
		}else {
			fim.setAnterior(novoNo);
			fim = novoNo;
		}
	}
	
	public void imprimir() {
		if(inicio == null && fim == null) {
			System.out.println("A fila está vazia, não é possível imprimir!");
			System.out.println();
			return;
		}
		
		Node atual = inicio;
		while(atual != null) {
			System.out.println(atual.getValor() + " ");
			atual = atual.getAnterior();
		}
		System.out.println();
	}
	
	public void remover() {
		if(inicio == fim) {
			System.out.println("Último elemento já removido!");
			inicio = null;
			fim = null;
		}
		if(inicio == null && fim == null) {
			System.out.println("Não é possível remover, a fila está vazia!");
			return;
		}
		inicio = inicio.getAnterior();
	}
}
