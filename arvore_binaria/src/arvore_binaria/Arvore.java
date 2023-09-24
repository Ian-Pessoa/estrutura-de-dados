package arvore_binaria;

public class Arvore {
	private Node raiz;
	
	public Arvore() {
		raiz = null;
	}

	public Node getRaiz() {
		return raiz;
	}
	public void setRaiz(Node raiz) {
		this.raiz = raiz;
	}
	
	public void adicionar(int info) {
		Node novoNo = new Node(info);
		
		if(raiz == null) {
			raiz = novoNo;
		}else {
			Node atual = this.raiz;
			
			while(true) {
				if(info < atual.getValor()) {
					if(atual.getEsq() != null) {
						atual = atual.getEsq();
					}else {
						atual.setEsq(novoNo);
						break;
					}
				}else {
					if(atual.getDir() != null) {
						atual = atual.getDir();
					}else {
						atual.setDir(novoNo);
						break;
					}
				}
			}
		}
	}
	
	public void emOrdem(Node atual) {
		if(atual != null) {
			emOrdem(atual.getEsq());
			System.out.println(atual.getValor());
			emOrdem(atual.getDir());
		}
	}
	
	public void preOrdem(Node atual) {
		if(atual != null) {
			System.out.println(atual.getValor());
			preOrdem(atual.getEsq());
			preOrdem(atual.getDir());
		}
	}
	
	public void posOrdem(Node atual) {
		if(atual != null) {
			posOrdem(atual.getEsq());
			posOrdem(atual.getDir());
			System.out.println(atual.getValor());
		}
	}
	
	public boolean remover(int info) {
		Node atual = raiz;
		Node paiAtual = null;
		
		while(atual != null) {
			if(atual.getValor() == info) {
				break;
			}else if(info < atual.getValor()){
				paiAtual = atual;
				atual = atual.getEsq();
			}else {
				paiAtual = atual;
				atual = atual.getDir();
			}
		}
		if(atual!=null) {
			
			if(atual.getDir() != null) {
				Node substituto = atual.getDir();
				Node paiSubstituto = atual;
				while(substituto.getEsq()!=null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsq();
				}
				substituto.setEsq(atual.getEsq());
				if(paiAtual != null) {
					if(atual.getValor() > paiAtual.getValor()) {
						paiAtual.setDir(substituto);
					}else {
						paiAtual.setEsq(substituto);
					}
				}else { // se não tem paiAtual então é a raíz
					this.raiz = substituto;
				}
				//removeu elemento da árvore
				if(substituto.getValor() > paiSubstituto .getValor()) {
					paiSubstituto.setDir(null);
				}else {
					paiSubstituto.setEsq(null);
				}
			}else if(atual.getEsq() != null) {
				Node substituto = atual.getEsq();
				Node paiSubstituto = atual;
				while(substituto.getDir()!=null) {
					paiSubstituto = substituto;
					substituto = substituto.getDir();
				}
				if(paiAtual !=null) {
					if(atual.getValor() > paiAtual.getValor()) {
						paiAtual.setDir(substituto);
					}else {
						paiAtual.setEsq(substituto);
					}
				}else { // se for a raíz
					this.raiz = substituto;
				}
				//removeu elemento da árvore
				if(substituto.getValor() > paiSubstituto .getValor()) {
					paiSubstituto.setDir(null);
				}else {
					paiSubstituto.setEsq(null);
				}
			}else {// não tem filho
				if(paiAtual!=null) {
					if(atual.getValor() > paiAtual.getValor()) {
						paiAtual.setDir(null);
					}else {
						paiAtual.setEsq(null);
					}
				}else { // é a raíz
					this.raiz=null;
				}
			}
			
			return true;
		}else {
			return false;
		}
	}
}
