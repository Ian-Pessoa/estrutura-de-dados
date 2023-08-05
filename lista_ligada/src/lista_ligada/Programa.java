package lista_ligada;

public class Programa {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("DF");
		lista.adicionar("CE");
		System.out.println("Tamanho: " + lista.getTamanho());
		System.out.println("Primeiro :" + lista.getPrimeiro().getValor());
		System.out.println("Último: " + lista.getUltimo().getValor());
		
		for(int i=0; i<lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		//remover estado CE
		lista.remover("CE");
		System.out.println("Removeu o estado CE");
		lista.adicionar("PE");
		System.out.println("Adicionou estado PE");
		
		for(int i=0; i<lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println("Removendo todos os elementos");
		lista.remover("AC");
		lista.remover("BA");
		lista.remover("DF");
		lista.remover("PE");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		for(int i=0; i<lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		lista.adicionar("SC");
		System.out.println("Adicionou estado SC");
		
		System.out.println("Tamanho: " + lista.getTamanho());
		for(int i=0; i<lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
	}
}
