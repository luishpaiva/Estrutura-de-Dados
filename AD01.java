package Atividades;

public class AD01 {
    public static void main(String[] args) {
        int[] vetor = {1, 5, 2, 3, 1, 3, 1};
        int moda = calculaModa(vetor);
        System.out.println("A moda do conjunto é " + moda + ".");
    }

    public static int calculaModa(int vetor[]) {
        int maiorValor = 0, maiorContador = 0;

        for (int i = 0; i < vetor.length; i++) {
            int contador = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == vetor[i]) {
                    contador++;
                }
            }
            if (contador > maiorContador) {
                maiorContador = contador;
                maiorValor = vetor[i];
            }
        }
        return maiorValor;
    }
}