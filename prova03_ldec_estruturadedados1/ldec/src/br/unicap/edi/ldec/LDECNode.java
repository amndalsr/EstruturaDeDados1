package br.unicap.edi.ldec;

public class LDECNode <T extends Comparable<T>> {
    private LDECNode<T> anterior;
    private T info;
    private LDECNode<T> proximo;

    public LDECNode (T valor) {
        this.info = valor;
    }

    public void setAnterior(LDECNode<T> novoAnterior) {
        this.anterior = novoAnterior;
    }

    public LDECNode<T> getAnt() {
        return this.anterior;
    }

    public void setInfo (T valor) {
        this.info = valor;
    }

    public T getInfo() {
        return this.info;
    }

    public void setProximo (LDECNode<T> novoProximo) {
        this.proximo = novoProximo;
    }

    public LDECNode<T> getProx() {
        return this.proximo;
    }
}
