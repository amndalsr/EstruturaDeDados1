package br.unicap.edi.lde;

public class LDECircular <T extends Comparable<T>>{
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

    public void inserirNoInicio(T valor) {
        LDENode<T> novo = new LDENode(valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd = 0;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        } else {
            novo.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
            this.qtd++;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        }
    }

    public void removerInicio () {
        if (this.isEmpty() == true) {
            System.out.println("vazia");
        } else if (this.qtd == 1) {
            this.primeiro =  null;
            this.ultimo = null;
            this.qtd--;
        } else {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        }
    }   
    
    public void inserirNoFinal (T valor) {
        LDENode<T> novo = new LDENode(valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd = 0;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        } else {
            novo.setAnterior(this.ultimo);
            this.ultimo.setProximo(novo);
            this.ultimo = novo;
            this.qtd++;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        }
    }
    
    public void removerFinal () {
        if (this.isEmpty() == true) {
            System.out.println("vazia");
        } else if (this.qtd == 1) {
            this.primeiro =  null;
            this.ultimo = null;
            this.qtd--;
        } else {
            this.ultimo = this.ultimo.getAnt();
            this.qtd--;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        }
    }

    public void exibirTodos() { 
        LDENode<T> aux;
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

    public LDENode<T> buscar(T valor) {
        LDENode<T> aux = this.primeiro;
        if (this.isEmpty() == true) {
            return null;
        }
        if (valor.compareTo(this.ultimo.getInfo()) == 0) {
            return this.ultimo;
        }
        for (int i = 0; i < this.qtd; i++) {
            if (valor.compareTo(aux.getInfo()) == 0) {
                return aux;
            }
            aux = aux.getProx();
        }
        return null;
    }

    public void ordemInversa() {
        LDENode<T> aux;

        if (this.isEmpty()) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            do {
                System.out.println(aux.getInfo() + "");
                aux = aux.getAnt();
            } while (aux != this.primeiro);
        }
    }

    public void remover (T valor) {
        LDENode<T> retorno = this.buscar(valor);
        LDENode<T> anterior, proximo;

        if (retorno == null) {
            System.out.println("Valor não encontrado.");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
        } else if (retorno == this.primeiro) {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        } else if (retorno == this.ultimo) {
            this.ultimo = this.ultimo.getAnt();
            this.qtd--;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        } else {
            anterior = retorno.getAnt();
            proximo = retorno.getProx();
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            this.qtd--;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        }
    }
}
