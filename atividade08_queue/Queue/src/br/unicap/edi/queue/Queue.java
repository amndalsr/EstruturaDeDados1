package br.unicap.edi.queue;

public class Queue<T> {
    private LSENode<T> inicio;
    private LSENode<T> fim;

    public boolean isEmpty() {
        if (this.inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return false;
    }

    public void enQueue (T valor){ //inserir no final
        LSENode<T> novo = new LSENode(valor);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        } else {
            this.fim.setProx(novo);
            this.fim = novo;
        }
    }

    public T deQueue() { // desenfilerar
        LSENode<T> aux = this.inicio;
        if (this.inicio == this.fim) {
            this.inicio = null;
            this.fim = null;
        } else {
            this.inicio = this.inicio.getProx();
        }
        return aux.getInfo();
    }

    public T head() {
        return this.inicio.getInfo();
    }
}
