package lista_circular_dupla;

public class Main {
	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.adicionar(1);
		lista.adicionar(2);
		lista.adicionar(3);
		lista.adicionar(4);
		lista.adicionar(5);
		
		lista.percorrerParaFrente();
		lista.percorrerParaTras();
		
		lista.remover(1);
		lista.remover(2);
		lista.remover(3);
		lista.remover(4);
		lista.remover(5);
		
		lista.percorrerParaFrente();
		lista.percorrerParaTras();
		
		lista.adicionar(1);
		lista.adicionar(2);
		lista.adicionar(3);
		lista.adicionar(4);
		lista.adicionar(5);
		
		lista.percorrerParaFrente();
		lista.percorrerParaTras();
		
		lista.remover(1);
		lista.remover(5);
		
		lista.percorrerParaFrente();
		lista.percorrerParaTras();
	}
}
