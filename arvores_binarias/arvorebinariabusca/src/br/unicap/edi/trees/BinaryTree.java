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

    public T find (T valor) {
        if (this.isEmpty() == true) {
            return null;
        } else {
            return raiz.findNode(valor);
        }
    }

    public T buscar (T valor) {
        Node<T> aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.raiz;

            while(aux != null){
                if (valor.compareTo(aux.getInfo()) == 0) {
                    return aux.getInfo(); //valor encontrado
                } else if (valor.compareTo(aux.getInfo()) < 0) {
                    aux = aux.getLeft();
                } else {
                    aux = aux.getRight();
                }
            }
            return null; //valor não encontrado
        }
    }
}
