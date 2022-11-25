package br.unicap.edi.trees;

public class Node <T extends Comparable<T>>{
    private Node<T> left;
    private T info;
    private Node<T> right;

    public Node (T valor) {
        this.info = valor;
    }

    public T getInfo() {
        return this.info;
    }

    public void setInfo(T valor) {
        this.info = valor;
    }

    public Node<T> getLeft() {
        return this.left;
    }

    public void setLeft(Node<T> newLeft) {
        this.left = newLeft;
    }

    public Node<T> getRight() {
        return this.right;
    }

    public void setRight(Node<T> newRight) {
        this.right = newRight;
    }

    void insertNode (T valor) {
        if (valor.compareTo(this.getInfo()) == 0) {
            System.out.println("Valor repetido!");
        } else if (valor.compareTo(this.getInfo()) < 0) {
            if (this.left == null) {
                this.left = new Node<T>(valor);
            } else {
                this.left.insertNode(valor);
            }
        } else {
            if (this.right == null) {
                this.right = new Node<T>(valor);
            } else {
                this.right.insertNode(valor);
            }
        }
    }

    T findNode (T valor) {
        if (valor.compareTo(this.getInfo()) == 0) {
            return this.getInfo();
        } else if (valor.compareTo(this.getInfo()) < 0) {
            if (this.left == null) {
                return null;
            } else {
                return this.left.findNode(valor);
            }
        } else {
            if (this.right == null) {
                return null;
            } else {
                return this.right.findNode(valor);
            }
        }
    }
}
