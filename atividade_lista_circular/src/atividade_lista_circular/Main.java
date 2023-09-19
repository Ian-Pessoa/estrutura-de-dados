package atividade_lista_circular;

/*Crie sua própria implementação de Lista Circular, com as seguintes características:
 Uma classe No, cujos atributos e métodos devem ser definidos por você
(0,5)
 Uma classe ListaCircular com:
◦ o atributo ref (referencia para o último no da lista) (0,5)
◦ e com os seguintes métodos:
▪ ao menos um método construtor, cujos parâmetros devem ser livremente
definidos por você (0,5)
▪ listaVazia(), que retorna verdadeiro ou falso (0,5)
▪ insereOrdenado(int info) (inserção na posição correta, considerando
ordenação crescente) (2,0)
▪ imprime(), que deve imprimir a lista do início para o fim (1,5)
▪ remove(int info), que remove o primeiro elemento encontrado da
lista, caso ele exista. Elementos duplicados também devem ser
removidos. (2,0)*/

public class Main {
	public static void main(String[] args) {
		Lista lista = new Lista();
		
		// inserindo ordenado
		
		lista.insereOrdenado(1);
		lista.insereOrdenado(2);
		lista.insereOrdenado(3);
		lista.imprime();
		System.out.println("----------------------------------");
		
		// inserindo desordenado
		
		lista.insereOrdenado(6);
		lista.insereOrdenado(4);
		lista.insereOrdenado(5);
		lista.imprime();
		System.out.println("----------------------------------");
		
		// inserindo repetidos e valores negativos
		
		lista.insereOrdenado(5);
		lista.insereOrdenado(5);
		lista.insereOrdenado(1);
		lista.insereOrdenado(1);
		lista.insereOrdenado(3);
		lista.insereOrdenado(-1);
		lista.imprime();
		System.out.println("----------------------------------");
		
		// removendo primeiro item da lista e itens repetidos
		
		lista.remover();
		lista.imprime();
		System.out.println("----------------------------------");
		
		// removendo todos os itens da lista
		
		lista.remover();
		lista.remover();
		lista.remover();
		lista.remover();
		lista.remover();
		lista.remover();
		lista.imprime();
		System.out.println("----------------------------------");
		
		// tentando remover com lista vazia
		
		lista.remover();
		System.out.println("----------------------------------");
		
		// adicionando novamente
		lista.insereOrdenado(1);
		lista.insereOrdenado(2);
		lista.insereOrdenado(3);
		lista.insereOrdenado(6);
		lista.insereOrdenado(4);
		lista.insereOrdenado(5);
		lista.imprime();
	}
}
