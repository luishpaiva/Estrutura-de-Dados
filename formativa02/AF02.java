package atividades.formativa02;

public class AF02 {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Boolean vazia = null, cheia = null;

        System.out.println("Verificando se a pilha esta vazia...");
        vazia = p.pilhaVazia();
        System.out.println(vazia);

        p.empilhar(10);
        p.empilhar(20);

        System.out.println("Verificando se a pilha esta cheia...");
        cheia = p.pilhaCheia();
        System.out.println(cheia);

        System.out.println("Mostrando a pilha depois de adicionar dois itens");
        p.mostraPilha();

        System.out.println("Verificando se a pilha esta cheia...");
        cheia = p.pilhaCheia();
        System.out.println(cheia);

        System.out.println("Adicionando os itens restantes...");
        p.empilhar(30);
        p.empilhar(40);
        p.empilhar(51);

        System.out.println("Verificando se a pilha esta cheia...");
        cheia = p.pilhaCheia();
        System.out.println(cheia);

        System.out.println("Mostrando a pilha...");
        p.mostraPilha();

        p.desempilhar();
        p.desempilhar();

        System.out.println("Mostrando a pilha depois de remover dois itens");
        p.mostraPilha();

        p.desempilhar();
        p.desempilhar();
        p.desempilhar();

        System.out.println("Verificando se a pilha esta vazia...");
        vazia = p.pilhaVazia();
        System.out.println(vazia);
        
        System.out.println("Mostrando a pilha...");
        p.mostraPilha();
    }
}
