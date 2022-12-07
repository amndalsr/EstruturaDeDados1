package br.unicap.edi.arvore;

public class BinaryTree<T extends Comparable<T>> {
    private TreeNode<T> raiz;

    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir(T valor) {
        TreeNode<T> novo = new TreeNode<T>(valor);
        TreeNode<T> aux;

        if (this.isEmpty() == true) {
            this.raiz = novo;
        } else {
            aux = this.raiz;

            while (true) {
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

    public T buscar(T valor) {
        TreeNode<T> aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.raiz;

            while (aux != null) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    return aux.getInfo();
                } else if (valor.compareTo(aux.getInfo()) < 0) {
                    aux = aux.getLeft();
                } else {
                    aux = aux.getRight();
                }
            }
            return null;
        }
    }

    public void emOrdem() {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia!");
        } else {
            this.percorrerEmOrdem(this.raiz);
        }
    }

    private void percorrerEmOrdem(TreeNode<T> r) {
        if (r != null) {
            percorrerEmOrdem(r.getLeft());
            System.out.println(r.getInfo());
            percorrerEmOrdem(r.getRight());
        }
    }

    public void remove(T valor) {
        if (this.isEmpty() == true) {
            System.out.println("Árvore vazia!");
        } else {
            this.raiz = this.removeNode(this.raiz, valor);
        }
    }

    private TreeNode<T> removeNode(TreeNode<T> r, T valor) {
        if (r != null) {
            if (valor.compareTo(r.getInfo()) == 0) {
                TreeNode<T> pai, filho;
                if (r.getLeft() == null && r.getRight() == null) {
                    r = null;
                } else if (r.getLeft() == null) {
                    r = r.getRight();
                } else if (r.getRight() == null) {
                    r = r.getLeft();
                } else {
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
