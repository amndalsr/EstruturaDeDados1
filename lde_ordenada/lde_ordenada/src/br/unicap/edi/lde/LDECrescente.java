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
}
