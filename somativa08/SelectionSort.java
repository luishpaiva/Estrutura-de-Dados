package atividades.somativa08;

public class SelectionSort {
	void selectionSort(int vetor[]) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int indiceMenor = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[indiceMenor]) {
			          indiceMenor = j;
				}
			}
			int auxiliar = vetor[i];
			vetor[i] = vetor[indiceMenor];
			vetor[indiceMenor] = auxiliar;
		}
	}
	
	void selectionSortImprime(int[] vetor) {
		System.out.println("Vetor ordenado de forma crescente (Selection Sort): ");
    	Principal.imprime(vetor);
	}
}