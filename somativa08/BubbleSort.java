package atividades.somativa08;

public class BubbleSort {
	void bubbleSort(int vetor[], int interacoes) {
		for (int i = 0; i < vetor.length - 1; i++) {
			if (vetor[i] > vetor[i + 1]) {
				int auxiliar = vetor[i];
				vetor[i] = vetor[i + 1];
				vetor[i + 1] = auxiliar;
			}
		}
		
		if (interacoes > 1) {
			bubbleSort(vetor, interacoes - 1);
		}
	}
	
	void bubbleSortImprime(int vetor[]) {
		System.out.println("Vetor ordenado de forma crescente (Bubble Sort): ");
    	Principal.imprime(vetor);
	}
}