package atividade05_lse_ordenada_livraria;

import java.util.Scanner;

public class LSEOrdenada<T extends Comparable<T>> {

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

    public void inserirOrdenado(T valor) { // cadastrar
        LSENode novo = new LSENode(valor);
        LSENode anterior = null, atual;

        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (valor.compareTo(this.primeiro.getInfo()) < 0) {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
        } else if (valor.compareTo(this.ultimo.getInfo()) > 0) {
            this.ultimo.setProx(novo);
            this.ultimo = novo;
            this.qtd++;
        } else {
            atual = this.primeiro;
            while (atual != null) {
                if (atual.getInfo().compareTo(valor) > 0) {
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

    public void remover(T valor) { // remover
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
        } else {
            if (valor.compareTo(this.primeiro.getInfo()) == 0) {
                this.primeiro = this.primeiro.getProx();
                this.qtd--;
            } else if (valor.compareTo(this.primeiro.getInfo()) < 0) {
                System.out.println("Valor não pertence a lista");
            } else if (valor.compareTo(this.ultimo.getInfo()) == 0) {
                aux = this.primeiro;
                while (aux.getProx() != this.ultimo) {
                    aux = aux.getProx();
                }
                aux.setProx(null);
                this.ultimo = aux;
                this.qtd--;
            } else if (valor.compareTo(this.ultimo.getInfo()) > 0) {
                System.out.println("Valor não pertence a lista");
            } else {
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

    public void exibirUm(T valor) { // exibir dados de um livro
        LSENode<T> aux = this.buscaAprimorada(valor);

        if (aux != null) {
            System.out.println(aux.getInfo());
        } else {
            System.out.println("Livro não existente na lista");
        }
    }

    public void exibirTodos() { // exibir todos os livros cadastrados
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

    private LSENode<T> buscaAprimorada(T valor) { //buysca aprimorada
        LSENode<T> aux;

        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(valor) == 0) {
                    return aux;
                }
                if (aux.getInfo().compareTo(valor) > 0) {
                    return null;
                }
                aux = aux.getProx();
            }
        }
        return null;
    }

    private LSENode buscar(Livro l) { // buscar livro pelo cod
        LSENode aux;

        if (this.isEmpty() == true) {
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(l) == 0) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void alteraPreco(String cod) { //alterar preco do livro
        Scanner in = new Scanner(System.in);
        Livro aux = new Livro(cod);
        double novoPreco;
        LSENode result = this.buscar(aux);

        if (aux != null) {
            System.out.println("Livo não encontrado!");
        } else {
            System.out.println("Informe o novo preço do produto: ");
            novoPreco = in.nextDouble();
            result.getInfo().setPreco(novoPreco);

            System.out.println("Preço do livro alterado!");
        }
    }

    public void alteraEstoque(String cod) { // alterar estoque de um livro
        Scanner in = new Scanner(System.in);
        Livro aux = new Livro(cod);
        int novoEstoque;
        LSENode result = this.buscar(aux);

        if (aux != null) {
            System.out.println("Livo não encontrado!");
        } else {
            System.out.println("Informe o novo estoque do produto: ");
            novoEstoque = in.nextInt();
            result.getInfo().setPreco(novoEstoque);

            System.out.println("Estoque do livro atualizado!");
        }
    }
}
