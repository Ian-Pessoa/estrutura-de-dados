package arvore_binaria;

public class Main {
	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		
		/*
		arvore.adicionar(10);
		arvore.adicionar(8);
		arvore.adicionar(5);
		arvore.adicionar(9);
		arvore.adicionar(7);
		arvore.adicionar(18);
		arvore.adicionar(13);
		arvore.adicionar(20);
		*/
		
		arvore.adicionar(10);
		arvore.adicionar(5);
		arvore.adicionar(15);
		
		System.out.println("Em ordem: ");
		arvore.emOrdem(arvore.getRaiz());
		
		System.out.println("\nPré ordem: ");
		arvore.preOrdem(arvore.getRaiz());
		
		System.out.println("\nPós ordem: ");
		arvore.posOrdem(arvore.getRaiz());
	}
}
