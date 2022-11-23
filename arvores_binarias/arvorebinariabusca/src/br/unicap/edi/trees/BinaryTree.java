package br.unicap.edi.trees;

public class BinaryTree <T extends Comparable<T>>{
    private Node<T> raiz; 
    
    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert (T valor) {
        if (this.isEmpty() == true) {
            this.raiz = new Node<T>(valor);
        } else {
            this.raiz.insertNode(valor);
        }
    }
}
