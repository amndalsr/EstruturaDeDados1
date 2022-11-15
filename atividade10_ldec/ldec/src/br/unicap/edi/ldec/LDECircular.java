package br.unicap.edi.ldec;

public class LDECircular <T extends Comparable<T>>{
    private LDECNode<T> primeiro;
    private LDECNode<T> ultimo;
    private int qtd;
    
    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirOrdemDecrescente (T valor) {
        LDECNode<T> novo = new LDECNode(valor);
        LDECNode<T> aux, anterior;

        if (this.isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        } else if (valor.compareTo(this.primeiro.getInfo()) > 0) {
            novo.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
            this.qtd++;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        } else if (valor.compareTo(this.primeiro.getInfo()) == 0) {
            System.out.println("Valor repetido, inserção não realizada!");
        } else if (valor.compareTo(this.ultimo.getInfo()) < 0) {
            this.ultimo.setProximo(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        } else if (valor.compareTo(this.ultimo.getInfo()) == 0) {
            System.out.println("Valor repetido, inserção não realizada!");
        } else {
            aux = this.primeiro.getProx();
            while (true) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido, inserção não realizada!");
                    break;
                } else if (valor.compareTo(aux.getInfo()) > 0) {
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

    public LDECircular<T> concatenar (LDECircular<T> l1, LDECircular<T> l2) {
        if (l1.isEmpty() == false && l2.isEmpty() == false) {
            
           l1.primeiro.setAnterior(l2.ultimo);
           l1.ultimo.setProximo(l2.primeiro);
           l1.ultimo.getProx().setAnterior(l1.ultimo);

           l1.qtd += l2.qtd;
        }
        return l1; 
    }

    public LDECircular<T> dividir (LDECircular<Integer> lista) {
        int tamanho = lista.qtd;
        LDECircular<Integer> l1 = new LDECircular<>();
        LDECircular<Integer> l2 = new LDECircular<>();

        for (int i = 0; i < tamanho / 2; i++){
            l1.inserirOrdemDecrescente(i);
        }

        for (int i = tamanho / 2; i < tamanho; i++) {
            l2.inserirOrdemDecrescente(i);
        }

        return new LDECircular<>();
    }

    
    public void exibirTodos() { 
        LDECNode<T> aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista Vazia");
        } else {
            aux = this.primeiro;
            for (int i = 0; i < this.qtd; i++) {
                System.out.print(aux.getInfo() + " ");
                aux = aux.getProx();
            }
            System.out.println();
        }
    }
}
