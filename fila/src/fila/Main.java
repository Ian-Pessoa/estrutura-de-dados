package fila;

public class Main {
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adicionar(1);
		fila.adicionar(2);
		fila.adicionar(3);
		
		fila.imprimir();
		
		fila.remover();
		fila.imprimir();
		
		fila.remover();
		fila.imprimir();
		
		fila.remover();
		fila.imprimir();
		
		fila.adicionar(4);
		fila.adicionar(5);
		fila.adicionar(6);
		
		fila.imprimir();
	}
}	
