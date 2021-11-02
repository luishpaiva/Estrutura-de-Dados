package atividades;

public class Lista {
    private No primeiro;

    public Lista() {
        primeiro = null;
    }

    public boolean vazia() {
        return primeiro == null;
    }

    public No pesquisar(int valor) {
        No auxiliar = this.primeiro;
        
        if (vazia()) {
            System.out.println("Lista vazia! Não há nós para serem pesquisados.");
        } else {
            while (auxiliar != null && auxiliar.getValor() != valor) {
                auxiliar = auxiliar.getProximo();
            }
        }

        return auxiliar;
    }

    public void inserePrimeiro(int valor) {
        No auxiliar = new No();
        auxiliar.setValor(valor);
        auxiliar.setProximo(primeiro);
        primeiro = auxiliar;
    }

    public void insereDepois(No no, int valor) {
        No auxiliar = no;
        No novo = new No();

        if (auxiliar == null) {
            System.out.println("O nó pesquisado não existe! Não é possível inserir um novo nó.");
        } else {
            novo.setValor(valor);
            novo.setProximo(auxiliar.getProximo());
            auxiliar.setProximo(novo);
            System.out.println("Inserido o nó com o valor " + novo.getValor() + " após o nó com valor "+ auxiliar.getValor() + ".");
        }
    }

    public void insereUltimo(int valor) {
        if (vazia()) {
            inserePrimeiro(valor);
        } else {
            No auxiliar = primeiro;
            
            while ((auxiliar != null) && (auxiliar.getProximo() != null)) {
                auxiliar = auxiliar.getProximo();
            }

            if (auxiliar.getProximo() == null) {
                No novo = new No();
                novo.setValor(valor);
                auxiliar.setProximo(novo);
            }
        }
    }

    public No removePrimeiro() {
        if (vazia()) {
            System.out.println("A lista está vazia! Não é possível remover.");
            return null;
        } else {
            No removido;
            System.out.println("Primeiro nó, com o valor " +  primeiro.getValor() + ", removido!");
            removido = primeiro;
            primeiro = primeiro.getProximo();
            return removido;
        }
    }

    public No remove(No no) {
        No removido = no;

        if (removido == null) {
            System.out.println("O nó pesquisado não existe! Não é possível remover o nó.");
            return null;
        } else if (removido == primeiro) {
            removePrimeiro();
            return null;
        } else {
            removido = primeiro;
            while (removido.getProximo() != no) {
                removido = removido.getProximo();
            }

            removido.setProximo(no.getProximo());
            System.out.println("Nó com o valor " + no.getValor() + " removido!");
            return removido;
        }
    }

    public No removeUltimo() {
        if (vazia()) {
            System.out.println("A lista está vazia! Não é possível remover.");
            return null;
        } else {
            No removido = primeiro;
            
            while (removido.getProximo().getProximo() != null) {
                removido = removido.getProximo();
            }

            System.out.println("Último nó, com o valor " +  removido.getProximo().getValor() + ", removido!");
            removido.setProximo(null);
            return removido;
        }
    }

    public void mostrar() {
        No auxiliar = primeiro;

        System.out.print("Lista encadeada: ");
        while (auxiliar != null) {
            if (auxiliar.getProximo() != null) {
                System.out.print(auxiliar.getValor() + ", ");
            } else {
                System.out.println(auxiliar.getValor() + ".");
            }
            auxiliar = auxiliar.getProximo();
        }
    }
}