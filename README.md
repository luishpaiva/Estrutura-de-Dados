# Estrutura-de-Dados
Repositório com as atividades da disciplina de Métodos de Pesquisa e Ordenação em Estrutura de Dados.
<br />
<br />
<p>
<strong>Semana 1 - ATIVIDADE DIAGNÓSTICA: Vetor de números inteiros</strong><br />
A moda de um vetor de números inteiros é o número que é repetido mais vezes. Se há mais de um número com mais repetições do que os outros então não há moda. Escreva um algorítimo que receba o vetor de inteiros abaixo e retorne a moda do vetor. Caso a moda não exista, então informe o usuário. 

    int[] vetor = {1, 5, 2, 3, 1, 3, 1};
</p>
<p>
<strong>Semana 2 - ATIVIDADE FORMATIVA: Estrutura de Dados em Java: Pilha</strong><br />
Agora que você já estudou sobre o tema da semana chegou a hora de praticar. Elabore uma pilha de números inteiros em Java. A pilha deverá ser um vetor de números inteiros e deverá possuir os seguintes métodos: 

    boolean pilhaVazia()
    void empilha(int valor)
    void desempilha()
</p>
<p>
<strong>Semana 3 - ATIVIDADE FORMATIVA: Estrutura de Dados em Java: Fila</strong><br />
Agora que você já estudou sobre o tema da semana chegou a hora de praticar. Elabore uma fila de números inteiros em Java. A fila deverá ser um vetor de números inteiros e deverá possuir os seguintes métodos:

    boolean estaVazia() 
    boolean estaCheia() 
    void adicionar(int valor) 
    void remover() 
    void mostrar()
</p>
<p>
<strong>Semana 4 - ATIVIDADE SOMATIVA 1: Estrutura de Dados em Java: Lista</strong><br />
Uma Lista é uma estrutura de dados dinâmica, onde o número de nós de uma lista pode variar consideravelmente à medida que são inseridos e removidos os elementos. Cada elemento de uma lista encadeada (nó) é constituído de dois campos: valor e próximo elemento. Conforme foi apresentado na semana 4 a estrutura de dados, lista, elabore uma lista dinâmica de números inteiros em Java. A lista deverá possuir um objeto Nó (classe No) e ter os métodos listados abaixo:

    boolean vazia()
    void inserePrimeiro(int info)
    void insereDepois(No no, int info)
    void insereUltimo(int info)
    No removePrimeiro()
    No removeUltimo()
    No remove(No no)
    void mostrar()
</p>
<p>
<strong>Semana 5 - ATIVIDADE FORMATIVA: Estrutura de Dados em Java: Recursividade</strong><br />
A sequência Fibonacci é uma sequência de números inteiros, começando normalmente por 0 e 1, na qual cada número seguinte, corresponde à soma dos dois anteriores, por exemplo:
    
    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946...
    
Para essa atividade você deverá implementar uma nova Classe em java que imprima a sequência Fibonacci recursivamente.
</p>
<strong>Semana 6 - ATIVIDADE FORMATIVA: Estrutura de Dados em Java: Árvore Binária - Inserção e ordenação</strong><br />
Uma árvore binária é um conjunto finito de elementos que está vazio ou é particionado em três subconjuntos distintos, o primeiro é a informação e os demais são ponteiros para os nós filhos, à direita e à esquerda, respectivamente. Construa uma árvore binária em Java com os métodos de inserir um filho e mostrar os valores, tanto em pré-ordem, in-ordem e pós-ordem. Deverá ser inserido os seguintes valores na árvore, na mesma ordem: 20, 25, 10, 15, 30, 23, 24, 35.

    Pré-ordem: 20 10 15 25 23 24 30 35
     In-ordem: 10 15 20 23 24 25 30 35
    Pós-ordem: 15 10 24 23 35 30 25 20

</p>
</p>
<strong>Semana 7 - ATIVIDADE FORMATIVA: Estrutura de Dados em Java: Árvore Binária – Remoção e procura</strong><br />
Uma árvore binária é um conjunto finito de elementos que está vazio ou é particionado em três subconjuntos distintos, o primeiro é a informação e os demais são ponteiros para os nós filhos, à direita e à esquerda respectivamente. Construa uma árvore binária em Java com os métodos de remover um filho e procurar um determinado valor dentro da árvore.
</p>
</p>
<strong>Semana 8 - ATIVIDADE SOMATIVA: Estrutura de Dados em Java: Métodos de ordenação</strong><br />
1 - O Selection Sort segue uma rotina bem simples e direta: encontrar o menor elemento e colocá-lo na primeira posição. Isso é feito com cada um dos elementos do vetor. Com base no que foi estudando na unidade da semana, elabore em grupo, o algorítimo do Selection Sort e faça a ordenação do vetor abaixo. Deverá comprimir a pasta src do projeto em .zip e realizar a entrega no Blackboard.

    int[] vetor = {3,6,8,1,4,9,0};

2- Bubble Sort é um algorítimo de ordenação por flutuação, de forma bem simples. Com base no que foi estudando na unidade da semana 5 e 8, elabore em grupo, o algorítimo do Bubble Sort recursivamente e faça a ordenação do vertor abaixo. Deverá comprimir a pasta src do projeto em .zip e realizar a entrega no Blackboard.

    int[] vetor = {3,6,8,1,4,9,0};
</p>