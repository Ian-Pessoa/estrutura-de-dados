package bubble_sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] vetor = {25, 57, 48, 37, 12, 92, 86, 33};
		int tamanho = vetor.length;

		
		for(int i = 0; i < vetor.length; i++) {
			boolean teveTroca = false;
			
			for(int j = 0; j < tamanho-1; j++) {
				int aux = j+1;
				if(vetor[j] > vetor[aux]) {
					int deposito = vetor[aux];
					vetor[aux] = vetor[j];
					vetor[j] = deposito;
					teveTroca = true;
				}
			}
			if (teveTroca == false) break;
			tamanho--;
			System.out.println(Arrays.toString(vetor));
		}
	}
}
