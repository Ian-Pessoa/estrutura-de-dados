package merge_sort;

import java.util.Arrays;

public class MergeSort {
	
	public void mergeSort(int[] vetor) {
		if(vetor.length > 1) {
			int low = 0;
			int high = vetor.length;
			mergeSortRecurssao(vetor, low, high);
		}
	}
	
	public void mergeSortRecurssao(int[] vetor, int low, int high) {
		if(high - low > 1) {
			int mid = (high + low)/2;
			mergeSortRecurssao(vetor, low, mid);
			mergeSortRecurssao(vetor, mid, high);
			merge(vetor, low, mid, high);
		}
	}
	
	public void merge(int[] vetor, int low, int mid ,int high) {
		int[] left = Arrays.copyOfRange(vetor, low, mid);
		int[] right = Arrays.copyOfRange(vetor, mid, high);
		int topoEsq = 0, topoDir = 0;
		for(int i = low; i < high; i++) {
			if (topoEsq >= left.length) {
				vetor[i] = right[topoDir];
				topoDir += 1;
			} else if (topoDir >= right.length) {
				vetor[i] = left[topoEsq];
				topoEsq += 1;
			} else if (left[topoEsq] < right[topoDir]) {
				vetor[i] = left[topoEsq];
				topoEsq += 1;
			}else {
				vetor[i] = right[topoDir];
				topoDir += 1;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int[] vetor = {25, 57, 48, 37, 12, 92, 86, 33};
		MergeSort merge = new MergeSort();
		merge.mergeSort(vetor);
		System.out.println(Arrays.toString(vetor));
	}
}
