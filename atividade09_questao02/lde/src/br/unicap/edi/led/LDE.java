package br.unicap.edi.led;

public class LDE <T extends Comparable<T>> {
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

        if (this.isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (valor.compareTo(this.primeiro.getInfo()) > 0 ) {
            novo.setProximo(this.primeiro); 
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (valor.compareTo(this.primeiro.getInfo()) == 0) {
            System.out.println("Valor repetido, inserção não realizada!");
        } else if (valor.compareTo(this.ultimo.getInfo()) < 0) {
            this.ultimo.setProximo(novo);
            novo.setAnterior(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else if (valor.compareTo(this.ultimo.getInfo()) == 0) {
            System.out.println("Valor repetido, inserção não realizada!");
        } else {
            aux = this.primeiro.getProx();

            while (aux != null) {
                if (valor.compareTo(aux.getInfo()) == 0) {
                    System.out.println("Valor repetido, inserção não realizada!");
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

    public LDENode<T> buscar(T valor) {
        LDENode<T> aux;
        if(this.isEmpty() == true) {
            return null;
        } else if (valor.compareTo(this.ultimo.getInfo()) < 0) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux!= null) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    return aux;
                } else if ( valor.compareTo(aux.getInfo()) < 0) {
                    aux = aux.getProx();
                } else {
                    return null;
                }
            }
        }
        return aux;
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

    public void verificar(T valor){
        LDENode<T> result = this.buscar(valor);
        if(result != null){
            System.out.println("Valor encontrado: ");
            System.out.println(result.getInfo());
        } else {
            System.out.println("Valor não se encontra na lista!");
        }
    }
}
