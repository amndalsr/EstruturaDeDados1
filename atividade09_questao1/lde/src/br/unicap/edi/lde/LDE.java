package br.unicap.edi.lde;

public class LDE <T extends Comparable<T>>{
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

    public void inserirFinal (T valor) {
        LDENode<T> novo = new LDENode(valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else {
            this.ultimo.setProximo(novo);
            novo.setProximo(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        }
    }

    public void removerNoFinal() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
        } else {
            this.ultimo = this.ultimo.getAnt();
            this.ultimo.setProximo(null);
            this.qtd--;
        }
    }

    public void exibirAoContrario() {
        LDENode<T> aux;

        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.ultimo;
            while (aux != null) {
                System.out.println(aux.getInfo() + "");
                aux = aux.getAnt();
            }
            System.out.println("");
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

    public void verificar(T valor){
        LDENode<T> result = this.buscar(valor);
        if(result != null){
            System.out.println("A pessoa informada se encontra no prédio!");
            System.out.println(result.getInfo());
        } else {
            System.out.println("A pessoa informada não se encontra no prédio!");
        }
    }

    public void exibirQtd() {
        int aux = this.qtd;

        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Há " + aux + " pessoas no prédio.");
        }
    }

    public void remover (T valor) {
        LDENode<T> retorno = this.buscar(valor);
        LDENode<T> anterior, proximo;
        if(retorno == null) {
            System.out.println("valor nao encontrado");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
        } else if (retorno == this.primeiro) {
            this.primeiro = this.primeiro.getProx();
            this.primeiro.setAnterior(null);
            this.qtd--;
        } else if (retorno == this.ultimo) {
            this.ultimo = this.ultimo.getAnt();
            this.ultimo.getProx();
            this.qtd--;
        } else {
            anterior = retorno.getAnt();
            proximo = retorno.getProx();
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            this.qtd--;
        }
    }

}
