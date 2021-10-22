package Atividades;

public class AF03 {
    public static void main(String[] args) throws Exception {
        Fila f = new Fila();
        Boolean vazia, cheia;

        vazia = f.estaVazia();
        System.out.println(vazia);

        cheia = f.estaCheia();
        System.out.println(cheia);

        f.adicionar(10);
        f.adicionar(20);
        f.adicionar(30);
        f.adicionar(40);
        f.adicionar(50);

        f.mostrar();

        f.adicionar(60);
        f.adicionar(70);
        f.adicionar(80);
        f.adicionar(90);
        f.adicionar(99);

        cheia = f.estaCheia();
        System.out.println("");
        System.out.println(cheia);

        f.mostraIndices();

        f.mostrar();

        f.remover();
        f.remover();
        f.remover();
        f.remover();
        f.remover();

        System.out.println("");
        f.mostraIndices();

        f.mostrar();

        f.remover();
        f.remover();
        f.remover();
        f.remover();
        f.remover();

        System.out.println("");
        f.mostraIndices();

        vazia = f.estaVazia();
        System.out.println(vazia);
    }
    
}
