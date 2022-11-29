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

    public void inserir (T valor) {
        Node<T> novo = new Node<T>(valor);
        Node<T> aux;

        if (this.isEmpty() == true) {
            this.raiz = novo;
        } else {
            aux = this.raiz;

            while(true){
                if (valor.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor já existente!");
                    break;
                } else if (valor.compareTo(aux.getInfo()) < 0) {
                    if (aux.getLeft() == null) {
                        aux.setLeft(novo);
                        break;
                    } else {
                        aux = aux.getLeft();
                    }
                } else if (valor.compareTo(aux.getInfo()) > 0) {
                    if (aux.getRight() == null) {
                        aux.setRight(novo);
                        break;
                    } else {
                        aux = aux.getRight();
                    }
                } else {
                    break;
                }
            } 
        }
    }
}
