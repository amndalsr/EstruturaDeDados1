package atividade05_lse_ordenada_livraria;

public class LSEOrdenada <T extends Comparable <T>>{
    
    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;

    public boolean isEmpty() {
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirOrdenado(T valor){
        LSENode novo = new LSENode(valor);
        LSENode anterior = null, atual;

        if(this.isEmpty() == true){ 
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if(valor.compareTo(this.primeiro.getInfo()) < 0) {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
        } else if(valor.compareTo(this.ultimo.getInfo()) > 0){ 
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            this.qtd++;
        } else {
            atual = this.primeiro;
            while(atual != null){
                if(atual.getInfo().compareTo(valor) > 0){ 
                    anterior.setProx(novo);
                    novo.setProx(atual);
                    this.qtd++;
                    return;
                } else {
                    anterior = atual;
                    atual = atual.getProx();
                }
            }
        }
    }

    public void exibirTodos(){
        LSENode<T> aux;

        if(this.isEmpty() == true){
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    private LSENode buscar (T valor){
        LSENode<T> aux;
        if(this.isEmpty() == true){
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null){
                if(aux.getInfo().compareTo(valor) == 0){
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void remover(T valor) {
        LSENode<T> aux, anterior, atual;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.qtd == 1) {
            if (valor.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                this.ultimo = null;
                this.qtd = 0;
            } else {
                System.out.println("Não encontrado!");
            }
        } else { // mais de um nó
            if (valor.compareTo(this.primeiro.getInfo()) == 0) { // remoção no inicio
                this.primeiro = this.primeiro.getProx();
                this.qtd--;
            } else if (valor.compareTo(this.primeiro.getInfo()) < 0) {
                System.out.println("Valor não pertence a lista");
            } else if (valor.compareTo(this.ultimo.getInfo()) == 0) { // remoção do ultimo
                aux = this.primeiro;
                while (aux.getProx() != this.ultimo) {
                    aux = aux.getProx();
                }
                aux.setProx(null);
                this.ultimo = aux;
                this.qtd--;
            } else if (valor.compareTo(this.ultimo.getInfo()) > 0) {
                System.out.println("Valor não pertence a lista");
            } else { //remocao no meio da lista
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                    if (valor.compareTo(atual.getInfo()) == 0) {
                        anterior.setProx(atual.getProx());
                        this.qtd--;
                        break;
                    } else if (valor.compareTo(atual.getInfo()) < 0) {
                        System.out.println("Valor não pertence a lista");
                        break;
                    } else {
                        anterior = atual;
                        atual = atual.getProx();
                    }
                }
            }
        }
    }
}

