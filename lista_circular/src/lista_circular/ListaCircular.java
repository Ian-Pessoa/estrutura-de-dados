package lista_circular;

public class ListaCircular {
	private No ref;
	private No tail;
	private int tamanho;
	
	public ListaCircular() {
		tamanho = 0;
	}

	public No getRef() {
		return ref;
	}
	public void setRef(No ref) {
		this.ref = ref;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(int novoElemento) {
		No novoNo = new No(novoElemento);
		if(tamanho == 0) {
			novoNo.setP(novoNo);
			ref = novoNo;
		}else if (tamanho == 1){
			novoNo.setP(ref);
			ref.setP(novoNo);
			tail = novoNo;
		}else {
			novoNo.setP(tail);
			ref.setP(novoNo);
			tail = novoNo;
		}
		this.tamanho++;
	}
	
	public void remover(int info) {
		if(tamanho == 0) {
			System.out.println("A lista está vazia");
		}else if(tamanho == 1) {
			tail = null;
			ref = null;
		}
		
		No atual = tail;
		No ant = ref;
		
		for(int i=0; i<tamanho;i++) {
			if(atual!= null) {
				if (info == atual.getElemento() && atual == tail){
					ant.setP(atual.getP());
					tail = atual.getP();
					atual.setP(null);
					break;
				}else if(info == atual.getElemento() && atual != ref && atual != tail) {
					ant.setP(atual.getP());
					atual.setP(null);
					break;
				}else if(info == atual.getElemento() && atual == ref) {
					ant.setP(atual.getP());
					atual.setP(null);
					ref = ant;
					break;
				}else {
					ant = atual;
					atual = atual.getP();
				}
			}
		}
		this.tamanho --;
	}
	
	public void percorrer() {
		No atual = tail;
		if (tamanho == 0) {
			System.out.println("A lista está vazia");
		}else {
			while(atual!=ref) {
				System.out.print(atual.getElemento() + " ");
				atual = atual.getP();
			}
			System.out.print(ref.getElemento());
			System.out.println();
		}
	}
}
