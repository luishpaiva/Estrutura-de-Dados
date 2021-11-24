package atividades.formativa0607;

public class AF0607 {
    public static void main(String[] args) {
        Arvore a = new Arvore();

        a.insere(20);
        a.insere(25);
        a.insere(10);
        a.insere(15);
        a.insere(30);
        a.insere(23);
        a.insere(24);
        a.insere(35);

        System.out.print("Pré-ordem: ");
        a.preOrdem();
        System.out.print(" In-ordem: ");
        a.inOrdem();
        System.out.print("Pós-ordem: ");
        a.posOrdem();

        a.remove(a, 15);
        a.remove(a, 24);
        System.out.print("Pré-ordem: ");
        a.preOrdem();
        System.out.print(" In-ordem: ");
        a.inOrdem();
        System.out.print("Pós-ordem: ");
        a.posOrdem();
    }
}
