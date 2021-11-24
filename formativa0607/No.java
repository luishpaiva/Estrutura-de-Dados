package atividades.formativa0607;

public class No {
    private Integer valor;
    private No esquerda;
    private No direita;

    public No(int valor) {
        this.valor = valor;
    }

    public Integer valor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public No esquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No direita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
}