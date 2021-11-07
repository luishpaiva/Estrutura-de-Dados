package atividades.somativa04;

public class No {
    private Integer valor;
    private No proximo;

    public No() {
        valor = null;
        proximo = null;
    }

    public Integer getValor() {
        return this.valor;
    }
    
    public No getProximo() {
        return this.proximo;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}