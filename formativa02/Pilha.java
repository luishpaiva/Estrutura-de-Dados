package atividades.formativa02;

public class Pilha {
    public int[] pilha;
    public int posicaoPilha;

    public Pilha() {
        this.pilha = new int[10];
        this.posicaoPilha = -1;
    }
    
    public Boolean pilhaVazia() {
        if (this.posicaoPilha == -1) {
            return true;
        }
        return false;
    }
    
    public void empilhar(int valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.posicaoPilha++;
            this.pilha[this.posicaoPilha] = valor;
        }
    }
    
    public void desempilhar() {
        if (this.posicaoPilha > -1) {
            this.pilha[this.posicaoPilha] = 0;
            this.posicaoPilha--;
        }
    }
    
    public Boolean pilhaCheia() {
        if (this.posicaoPilha == this.pilha.length -1) {
            return true;
        }
        return false;
    }

    public void mostraPilha() {
        for (int i = this.pilha.length - 1; i > -1; i--) {
            if (this.pilha[i] != 0) {
                System.out.println("|" + this.pilha[i] + "|");
            }
        }
    }
}
