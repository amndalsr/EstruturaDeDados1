package br.unicap.edi.trees;
import br.unicap.edi.queue.Queue;

public class BinaryTree <T extends Comparable<T>>{
    private Node<T> raiz; 
    private int count;
    
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

    public void preOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia!");
        } else {
            percorrerPreOrdem(this.raiz);
        }
    }

    private void percorrerPreOrdem (Node<T> r) {
        if (r != null) {
            System.out.println(r.getInfo());
            percorrerPreOrdem(r.getLeft());
            percorrerPreOrdem(r.getRight());
        }
    }

    public void posOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia!");
        } else {
            percorrerPosOrdem(this.raiz);
        }
    }

    private void percorrerPosOrdem (Node<T> r) {
        if (r != null) {
            percorrerPosOrdem(r.getLeft());
            percorrerPosOrdem(r.getRight());
            System.out.println(r.getInfo());
        }
    }

    public T buscar (T valor) { // não recursivo
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

    public void passeioPorNivel() {
        Queue<Node<T>> fila;
        Node<T> aux;
        if (this.isEmpty() == false) {
            fila = new Queue();
            fila.enQueue (raiz);
            while (fila.isEmpty() == false) {
                aux = fila.deQueue();

                if (aux.getLeft() != null) {
                    fila.enQueue(aux.getLeft());
                }
                if (aux.getRight() != null) {
                    fila.enQueue(aux.getRight());
                }
                System.out.println(aux.getInfo());
            }
        }
    }

    public void inserir (T valor) { // não recursivo 
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

    public void enderecoNoEsquerda() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia!");
        } else {
            encontraEnderecoNoEsquerda(this.raiz);
        }
    }

    private void encontraEnderecoNoEsquerda (Node<T> r) {
        if (r.getRight() == null) {
            r.getInfo();
        }
    }

    public void enderecoNoDireita() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia!");
        } else {
            encontraEnderecoNoDireita(this.raiz);
        }
    }

    private void encontraEnderecoNoDireita (Node<T> r) {
        if (r.getLeft() == null) {
            r.getInfo();
        }
    }

    public void QtdNos() {
        Queue<Node<T>> fila;
        Node<T> aux;
        if (this.isEmpty() == false) {
            fila = new Queue();
            fila.enQueue (raiz);
            while (fila.isEmpty() == false) {
                aux = fila.deQueue();

                if (aux.getLeft() != null) {
                    fila.enQueue(aux.getLeft());
                }
                if (aux.getRight() != null) {
                    fila.enQueue(aux.getRight());
                }
                count++;
            }
        }
    }

    public void QtdFolhas() {
        Queue<Node<T>> fila;
        Node<T> aux;
        if (this.isEmpty() == false) {
            fila = new Queue();
            fila.enQueue (raiz);
            while (fila.isEmpty() == false) {
                aux = fila.deQueue();

                if (aux.getLeft() == null) {
                    fila.enQueue(aux.getLeft());
                    count++;
                }
                if (aux.getRight() == null) {
                    fila.enQueue(aux.getRight());
                    count++;
                }
            }
        }
    }
}
