package atividades.somativa08;

public class Principal {
	public static void main(String[] args) throws Exception {
		int[] vetor = {3,6,8,1,4,9,0};
		
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(vetor);
		ss.selectionSortImprime(vetor);
		
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort(vetor);
		bs.bubbleSortImprime(vetor);
	}
	
	static void imprime(int vetor[]) {
    	System.out.print("[");
	    for (int i = 0; i < vetor.length; i++) {
	    	if (i == vetor.length - 1) {
	    		System.out.print(vetor[i] + "]\n\n");
	    	} else {
	    		System.out.print(vetor[i] + ", ");
	    	}
	    }
	}
}