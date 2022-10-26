package br.unicap.edi.lde;

public class LDECrescente < T extends Comparable<T>> {
    private LDENode<T> primeiro;
    private LDENode<T> ultimo;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir (T valor) {
        LDENode<T> novo = new LDENode(valor);
        LDENode<T> aux, anterior;

        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (valor.compareTo(this.primeiro.getInfo()) < 0 ) {
            novo.setProximo(this.primeiro); 
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (valor.compareTo(this.primeiro.getInfo()) == 0) {
            System.out.println("Valor repetido, inserção não realizada!");
        } else if (valor.compareTo(this.ultimo.getInfo()) > 0) {
            this.ultimo.setProximo(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else if (valor.compareTo(this.ultimo.getInfo()) == 0) {
            System.out.println("Valor repetido, inserção não realizada!");
        } else {
            aux = this.primeiro.getProx();

            while (true) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido, inserção não realizada!");
                } else if (valor.compareTo(aux.getInfo()) < 0) {
                    anterior = aux.getAnt();
                    anterior.setProximo(novo);
                    aux.setAnterior(novo);
                    novo.setProximo(aux);
                    novo.setAnterior(anterior);
                    this.qtd++;
                    break;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }

    public LDENode<T> buscar (T valor) { 
        LDENode<T> aux = this.primeiro;
        LDENode<T> prox = aux.getProx();
        while (aux != null) {
            if (aux.getInfo().compareTo(valor) == 0) {
                break;
            }
            if(prox.getInfo().compareTo(valor) > 0) {
                aux = null;
                break;
            }
            aux = aux.getProx();
        }
        return aux;
    }

    public void remover (T valor) {
        LDENode<T> aux, anterior, atual;

        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.qtd == 1) {
            if (valor.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                this.ultimo = null;
                this.qtd = 0;
            } else {
                System.out.println("Valor não encontrado!");
            }
        } else {
            if (valor.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = this.primeiro.getProx();
                this.qtd--;
            } else if (valor.compareTo(this.primeiro.getInfo()) < 0) {
                System.out.println("Não está na lista!");
            } else if (valor.compareTo(this.ultimo.getInfo()) == 0) {
                aux = this.primeiro;
                while (aux.getProx() != this.ultimo) {
                    aux = aux.getProx();
                }
                aux.setProximo(null);
                this.ultimo = aux;
                this.qtd--;
            } else if (valor.compareTo(this.ultimo.getInfo()) > 0) {
                System.out.println("Não está na lista!");
            } else {
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                    if (valor.compareTo(atual.getInfo()) == 0) {
                        anterior.setProximo(atual.getProx());
                        this.qtd--;
                        break;
                    } else if (valor.compareTo(atual.getInfo()) < 0) {
                        System.out.println("Não está na lista!");
                    } else {
                        anterior = atual;
                        atual = atual.getProx();
                    }
                }
            }
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
}
