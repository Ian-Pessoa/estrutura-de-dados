package lista_circular;

public class No {
	private No p;
	private int elemento;
	
	public No(int novoElemento) {
		this.elemento = novoElemento;
	}
	
	public No getP() {
		return p;
	}
	public void setP(No p) {
		this.p = p;
	}
	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
}
