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

    public void emOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia!");
        } else {
            this.percorrerEmOrdem(this.raiz);
        }
    }

    private void percorrerEmOrdem(Node<T> r) {
        if (r != null) {
            percorrerEmOrdem(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getRight());
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
                }
            } 
        }
    }

    public void remove (T valor) {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia!");
        } else {
            this.raiz = this.removeNode(this.raiz, valor);
        }
    }

    private Node<T> removeNode (Node<T> r, T valor) {
        if (r != null) {
            if (valor.compareTo(r.getInfo()) == 0) {
                Node<T> pai, filho;
                if (r.getLeft() == null && r.getRight() == null) { //não tem filhos
                    r = null;
                } else if (r.getLeft() == null) { //não tem filho a esquerda
                    r = r.getRight();
                } else if (r.getRight() == null) { //não tm filho a direita
                     r = r.getLeft();
                } else { //tem ambos os filhos
                    pai = r;
                    filho = pai.getLeft();
                    while (filho.getRight() != null) {
                        pai = filho;
                        filho = filho.getRight();
                    }
                    pai.setRight(filho.getLeft());
                    r.setInfo(filho.getInfo());
                }
            } else if (valor.compareTo(r.getInfo()) < 0) {
                r.setLeft(removeNode(r.getLeft(), valor));
            } else {
                r.setRight(removeNode(r.getRight(), valor));
            }
        }
        return r;
    }
}
