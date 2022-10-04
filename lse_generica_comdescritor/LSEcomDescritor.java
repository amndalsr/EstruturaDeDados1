package lse_generica_comdescritor;

public class LSEcomDescritor<T extends Comparable<T>> {

    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;

    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    // LSE ordenada crescente sem repetidos
    // inserção ordenada em ordem crescente
    public void inserirOrdenado(T valor) {
        LSENode novo = new LSENode(valor);
        LSENode anterior = null, atual;

        if (this.isEmpty() == true) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (valor.compareTo(this.primeiro.getInfo()) < 0) { // inserção no início
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
        } else if (valor.compareTo(this.ultimo.getInfo()) > 0) { // inserção no fnal
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            this.qtd++;
        } else { // inserção no meio da lista - busca
            atual = this.primeiro;
            while (atual != null) {
                if (atual.getInfo().compareTo(valor) > 0) { // inserir
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
    // verifcar se há repetidos (sem usar a função de busca)

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
                System.out.println("Valor não pertence a lista.");
            } else { // remocao no meio da lista
                anterior = null;
                atual = this.primeiro;
                while (atual != null) {
                    if (valor.compareTo(atual.getInfo()) == 0) {
                        anterior.setProx(atual.getProx());
                        this.qtd--;
                        break;
                    } else if (valor.compareTo(atual.getInfo()) < 0) {
                        System.out.println("Valor não pertence a lista.");
                        break;
                    } else {
                        anterior = atual;
                        atual = atual.getProx();
                    }
                }
            }
        }
    }

    public void inserirNoInicio(T valor) {
        LSENode<T> novo = new LSENode(valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd = 1;
        } else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
        }
    }

    public void inseriNoFinal(T valor) {
        LSENode<T> novo = new LSENode(valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else {
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            this.ultimo.setProx(this.primeiro);
            this.qtd++;
        }
    }

    public void exibirTodos() {
        LSENode<T> aux;

        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void removerPrimeiro(){
      if(this.isEmpty() == true){
        System.out.println("Lista vazia!");
      } else if(this.qtd == 1){
        this.primeiro = null;
        this.ultimo = null;
        this.qtd = 0;
      } else {
        primeiro = this.primeiro.getProx();
        System.out.println("Removido");
      }
    }

    public void removerUltimo() {
        LSENode<T> aux;
        if (isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
            System.out.println("Remoção efetuada!");
        } else {
            aux = this.primeiro;
            while (aux.getProx() != this.ultimo) {
                aux = aux.getProx();
            }
            aux.setProx(this.primeiro);
            this.qtd--;
            System.out.println("Remoção efetuada!");

        }
    }

    public void contador(T valor) {
        LSENode<T> aux;
        int cont = 0;
        if (isEmpty() == true) {
            System.out.println("Lista vazia!");
        } else if (qtd == 1) {
            if (this.primeiro.getInfo().compareTo(valor) == 0) {
                System.out.println("O valor aparece apenas uma vez!");
                return;
            } else {
                System.out.println("Valor não encontrado!");
            }
        } else {
            aux = this.primeiro;
            for (int i = 0; i != qtd; i++) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    cont++;

                } else {
                    aux = aux.getProx();
                }
            }
        }
        if (cont == 0) {
            System.out.println("Esse valor não aparece nenhuma vez na lista!");
        } else {
            System.out.println("Contador: " + cont);
        }
    }

    public LSENode<T> buscar (T valor) { 
        LSENode<T> aux = this.primeiro;
		LSENode<T> prox = aux.getProx();
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

}
