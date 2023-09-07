package pilha;

public class Main {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.imprimir();
		
		pilha.adicionar(1);
		pilha.adicionar(2);
		pilha.adicionar(3);
		
		pilha.imprimir();
		
		pilha.remover();
		pilha.imprimir();
		
		pilha.remover();
		pilha.remover();
		pilha.imprimir();
		
		pilha.adicionar(1);
		pilha.adicionar(2);
		pilha.adicionar(3);
		pilha.imprimir();
		
		pilha.remover();
		pilha.remover();
		pilha.adicionar(4);
		pilha.adicionar(5);
		pilha.adicionar(6);
		pilha.imprimir();
	}
}
