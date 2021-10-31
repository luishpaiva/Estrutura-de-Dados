package atividades;

public class AD01 {
    public static void main(String[] args) {
        int[] vetor = {1, 5, 2, 3, 1, 3, 1}, contagem = new int[vetor.length];
        int contador, maiorValor;

        for (int i = 0; i < vetor.length; i++) {
            contador = 1;
            if (vetor[i] == -1) {
                contagem[i] = 0;
            } else {
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        contador++;
                        vetor[j] = -1;
                    }
                }
                contagem[i] = contador;
            }
        }
        
        maiorValor = contagem[0];
        
        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] > maiorValor) {
                maiorValor = contagem[i];
            }
        }
        
        System.out.println("A(s) moda(s) do conjunto informado é(são):");
        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] == maiorValor) {
                System.out.println(vetor[i]);
            }
        }
    }
}