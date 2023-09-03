package lista_circular;

public class Main {
	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		
		lista.adicionar(1);
		lista.adicionar(2);
		lista.adicionar(3);
		lista.adicionar(4);
		lista.adicionar(5);
		lista.adicionar(6);
		
		lista.percorrer();
		
		lista.remover(1);
		lista.percorrer();
		lista.remover(2);
		lista.percorrer();
		lista.remover(3);
		lista.percorrer();
		lista.remover(4);
		lista.percorrer();
		lista.remover(5);
		lista.percorrer();
		lista.remover(6);
		lista.percorrer();
		
		lista.adicionar(1);
		lista.adicionar(2);
		lista.adicionar(3);
		lista.adicionar(4);
		lista.adicionar(5);
		lista.adicionar(6);
		lista.percorrer();
	}
}
