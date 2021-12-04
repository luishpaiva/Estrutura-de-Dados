package atividades.somativa08;

public class BubbleSort {
	void bubbleSort(int vetor[]) {
		for (int i = 0; i < vetor.length - 1; i++) {
			if (vetor[i] > vetor[i + 1]) {
				int auxiliar = vetor[i];
				vetor[i] = vetor[i + 1];
				vetor[i + 1] = auxiliar;
			}
		}
	}
	
	void bubbleSortImprime(int vetor[]) {
		System.out.println("Vetor ordenado de forma crescente (Bubble Sort): ");
    	Principal.imprime(vetor);
	}
}