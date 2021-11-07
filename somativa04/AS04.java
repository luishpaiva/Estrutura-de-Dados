package atividades.somativa04;

public class AS04 {
    public static void main(String[] args) throws Exception{
        Lista l = new Lista();
        No no;

        System.out.println(l.vazia());

        no = l.pesquisar(1);
        l.insereDepois(no, 100);

        l.inserePrimeiro(10);
        l.insereUltimo(20);
        l.insereUltimo(30);
        l.inserePrimeiro(11);
        l.insereUltimo(99);
        l.inserePrimeiro(85);
        l.insereUltimo(42);
        l.inserePrimeiro(129);
        l.insereUltimo(7);

        l.mostrar();

        System.out.println(l.vazia());

        no = l.pesquisar(20);
        l.insereDepois(no, 999);
        l.mostrar();

        l.removePrimeiro();
        l.removeUltimo();
        l.removePrimeiro();
        l.removeUltimo();

        l.mostrar();

        no = l.pesquisar(10);
        l.remove(no);
        l.mostrar();

        no = l.pesquisar(777);
        l.remove(no);
        l.mostrar();

        no = l.pesquisar(999);
        l.remove(no);
        l.mostrar();
    }   
}