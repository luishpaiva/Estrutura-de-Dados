#include <iostream>
#include <Windows.h>

main () {
    system("cls");
    SetConsoleOutputCP(65001);

    int vetor[] = {1, 5, 2, 3, 1, 3, 1, 3};
    int contador, maiorValor, tamanho = sizeof(vetor)/sizeof(vetor[0]);
    int contagem[tamanho];

    for (int i = 0; i < tamanho; i++) {
        contador = 1;
        if (vetor[i] == -1) {
            contagem[i] = 0;
        } else {
            for (int j = i + 1; j < tamanho; j++) {
                if (vetor[i] == vetor[j]) {
                    contador++;
                    vetor[j] = -1;
                }
            }
            contagem[i] = contador;
        }
    }

    maiorValor = contagem[0];

    for (int i = 0; i < tamanho; i++) {
        if (contagem[i] > maiorValor) {
            maiorValor = contagem[i];
        }
    }

    std::cout << "A(s) moda(s) do conjunto informado é(são):\n";
    for (int i = 0; i < tamanho; i++) {
        if (contagem[i] == maiorValor) {
            std::cout << vetor[i] << "\n";
        }
    }
}

