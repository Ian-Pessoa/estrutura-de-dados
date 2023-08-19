package lista_duplamente_encadeada;

public class Main {
	public static void main(String[] args) {
		//criando lista vazia e conferindo se está vazia
		ListaDupla lista = new ListaDupla();
		System.out.println(lista.listaVazia());
		
		//adicionando elementos a lista, imprimindo e conferindo se está vazia
		lista.insere(4);
		lista.insere(2);
		lista.insere(5);		
		lista.insere(4);
		lista.insere(1);
		lista.insere(3);
		
		lista.imprime();
		System.out.println(lista.listaVazia());
		
		//a)removendo primeiro nó e imprimindo
		System.out.print("a) ");
		lista.remove(1);
		
		lista.imprime();
		
		//b)removendo último nó e imprimindo
		System.out.print("b) ");
		lista.remove(5);
		
		lista.imprime();
		
		//c)removendo nó do meio e imprimindo
		System.out.print("c) ");
		lista.remove(3);
		
		lista.imprime();
		
		//d)removendo elementos que possuem cópias e imprimindo
		System.out.print("d) ");
		lista.remove(4);
		
		lista.imprime();
		
		//e)removendo elemento inexistente na lista
		System.out.print("e) ");
		lista.remove(100);
		
		//f)removendo último elemento para imprimir lista vazia e conferindo se está vazia
		System.out.print("f) ");
		lista.remove(2);
		
		lista.imprime();
		System.out.println(lista.listaVazia());
		
		//g)lista já vazia, voltaremos a preenchê-la, imprimir e conferir se está vazia
		System.out.print("g) ");
		lista.insere(2);
		lista.insere(3);
		lista.insere(1);
		
		lista.imprime();
		System.out.println(lista.listaVazia());
	}
}
