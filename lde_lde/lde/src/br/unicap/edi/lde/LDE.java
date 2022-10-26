package br.unicap.edi.lde;

public class LDE <T extends Comparable<T>> {
    private LDENode<T> primeiro;
    private LDENode<T> ultimo;
    private int qtd;
    /*private int limite;

    public LDE(int tam) {
        this.limite = tam;
    }*/

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoInicio (T valor) {
        LDENode<T> novo = new LDENode(valor);

        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else {
            novo.setProximo(this.primeiro); //indo
            this.primeiro.setAnterior(novo); //voltando
            this.primeiro = novo;
            this.qtd++;
        }
    }

    public void inserirNoFinal (T valor) {
        LDENode<T> novo = new LDENode(valor);

        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else {
            this.ultimo.setProximo(novo);
            novo.setProximo(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        }
    }

    public void exibirTodos() {
        LDENode<T> aux;

        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo() + "");
                aux = aux.getProx();
            }
            System.out.println("");
        }
    }

    public void exibirAoContrario() {
        LDENode<T> aux;

        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.ultimo;
            while (aux != null) {
                System.out.println(aux.getInfo() + "");
                aux = aux.getAnt();
            }
            System.out.println("");
        }
    }

    public void removerNoInicio() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
        } else {
            this.primeiro = this.primeiro.getProx();
            this.primeiro.setAnterior(null);
            this.qtd--;
        }
    }

    public void removerNoFinal() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
        } else {
            this.ultimo = this.ultimo.getAnt();
            this.ultimo.setProximo(null);
            this.qtd--;
        }
    }
}
