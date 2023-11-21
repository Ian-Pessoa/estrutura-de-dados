package quick_sort;

import java.util.Arrays;

public class QuickSort {
	public void quickSort(int[] vetor) {
		int inicio = 0;
		int fim = vetor.length - 1;	
		quickSortRecurssao(vetor, inicio, fim);

	}
	
	public void quickSortRecurssao(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int pivo = partition(vetor, inicio, fim);
			quickSortRecurssao(vetor, inicio, pivo-1);
			quickSortRecurssao(vetor, pivo+1, fim);
		}
	}
	
	public int partition(int[] vetor, int inicio, int fim) {
	    int pivo = vetor[inicio];
	    int down = inicio;
	    int up = fim;

	    while (down < up) {
	        while (down <= fim && vetor[down] <= pivo) {
	            down++;
	        }

	        while (up >= inicio && vetor[up] > pivo) {
	            up--;
	        }

	        if (down < up) {
	            int aux = vetor[down];
	            vetor[down] = vetor[up];
	            vetor[up] = aux;
	        }
	    }

	    int aux = vetor[inicio];
	    vetor[inicio] = vetor[up];
	    vetor[up] = aux;

	    return up;
	}
	
	public static void main(String[] args) {
		int[] vetor = {25, 57, 48, 37, 12, 92, 86, 33};
		QuickSort quick = new QuickSort();
		quick.quickSort(vetor);
		System.out.println(Arrays.toString(vetor));
	}
}
