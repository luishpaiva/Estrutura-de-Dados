package atividades.formativa0607;

public class Arvore {
    private No raiz;

    private No maiorEsquerda(No no) {
        if (no.esquerda() != null) {
            no = no.esquerda();
            while (no.direita() != null) {
                no = no.direita();
            }
        }
        return no;
    }

    public No busca(No no, Integer valor) {
        if (no != null) {
            if (no.valor() == valor) {
                System.out.println("Nó encontrado!");
                return no;
            } else if (valor >= no.valor()) {
                return busca(no.direita(), valor);
            } else {
                return busca(no.esquerda(), valor);
            }
        } else {
            System.out.println("Nó não encontrado!");
            return null;
        }
    }

    public void insere(Integer valor) {
        insere(raiz, valor);
    }

    public void insere(No no, Integer valor) {
        if (no == null) {
            raiz = new No(valor);
        } else if (valor >= no.valor()) {
            if (no.direita() == null) {
                no.setDireita(new No(valor));
            } else {
                insere(no.direita(), valor);
            }
        } else if (no.esquerda() == null) {
            no.setEsquerda(new No(valor));
        } else {
            insere(no.esquerda(), valor);
        }
    }

    public No remove(Arvore arvore, Integer valor) {
        No balancear = remove(arvore, raiz, valor, null);
        return balancear;
    }

    public No remove(Arvore arvore, No no, Integer valor, No pai) {
        if (no != null) {
            if (no.valor() == valor) {
                if (no.esquerda() == null && no.direita() == null) {
                    if (pai == null) {
                        arvore.raiz = null;
                    } else if (no.valor() >= pai.valor()) {
                        pai.setDireita(null);
                    } else {
                        pai.setEsquerda(null);
                    }
                } else if (no.esquerda() == null) {
                    if (no.valor() >= pai.valor()) {
                        pai.setDireita(no.direita());
                    } else {
                        pai.setEsquerda(no.direita());
                    }
                    no.setEsquerda(null);
                } else if (no.direita() == null) {
                    if (no.valor() >= pai.valor()) {
                        pai.setDireita(no.esquerda());
                    } else {
                        pai.setEsquerda(no.esquerda());
                    }
                    no.setEsquerda(null);
                } else {
                    int maior = maiorEsquerda(no).valor();
                    remove(arvore, maior);
                    int noRemover = remove(arvore, maior).valor();
                    no.setValor(noRemover);
                    return no;
                }
            }
            if (valor >= no.valor()) {
                return remove(arvore, no.direita(), valor, no);
            } else {
                return remove(arvore, no.esquerda(), valor, no);
            }
        }
        return null;
    }

    public void preOrdem() {
        preOrdem(raiz);
        System.out.println("");
    }

    public void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor() + " ");
            preOrdem(no.esquerda());
            preOrdem(no.direita());
        }
    }

    public void inOrdem() {
        inOrdem(raiz);
        System.out.println("");
    }

    public void inOrdem(No no) {
        if (no != null) {
            inOrdem(no.esquerda());
            System.out.print(no.valor() + " ");
            inOrdem(no.direita());
        }
    }

    public void posOrdem() {
        posOrdem(raiz);
        System.out.println("");
    }

    public void posOrdem(No no) {
        if (no != null) {
            posOrdem(no.esquerda());
            posOrdem(no.direita());
            System.out.print(no.valor() + " ");
        }
    }
}
