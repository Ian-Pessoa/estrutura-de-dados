package pilha;

public class Pilha {
	private Node topo;
	
	public Pilha() {
		topo = null;
	}

	public Node getTopo() {
		return topo;
	}

	public void setTopo(Node topo) {
		this.topo = topo;
	}
	
	public void adicionar(int valor) {
		Node novoNo = new Node(valor);
		if(topo == null) {
			novoNo.setAnterior(null);
			topo = novoNo;
		}else {
			novoNo.setAnterior(topo);
			topo = novoNo;
		}
	}
	
	public void imprimir() {
		if(topo == null) {
			System.out.println("A pilha está vazia!");
			System.out.println();
			return;
		}
		
		Node atual = topo;
		do {
			System.out.println(atual.getValor() + " ");
			atual = atual.getAnterior();
		}
		while (atual != null);
		System.out.println();
	}
	
	public void remover() {
		if(topo == null) {
			System.out.println("Impossível remover, a lista está vazia!");
			return;
		}
		topo = topo.getAnterior();
	}
}
