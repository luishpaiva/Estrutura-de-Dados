package Atividades;

public class Fila {
    int fila[];
    int inicio, fim;

    Fila() {
        inicio = fim = -1;
        fila = new int[10];
    }

    public Boolean estaVazia() {
        if (inicio == -1 && fim == -1){
            return true;
        } else {
            return false;
        }
    }

    public Boolean estaCheia() {
        if (inicio == 0 && fim == fila.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionar(int valor) {
        if (fim != fila.length - 1) {
            if (inicio == -1) {
                inicio++;
            }
            fim++;
            fila[fim] = valor;
        }
    }

    public void remover() {
        if (!estaVazia()) {
            for  (int i = 0; i < fim; i++) {
                fila[i] = fila[i + 1];
            }
        } else {
            throw new RuntimeException("Pilha está vazia! não é possível remover itens.");
        }
        fim--;
        if (fim == -1) {
            inicio -= 1;
        }
    }

    public void mostrar() {
        for (int i = 0; i <= fim; i++) {
            if (fila[i] != 0) {
                if (i == fim) {
                    System.out.print(fila[i]);
                } else {
                    System.out.print(fila[i] + " <- ");
                }
            }
        }
    }

    public void mostraIndices() {
        System.out.println("Inicio = " + inicio + " | Fim = " + fim);
    }
}
