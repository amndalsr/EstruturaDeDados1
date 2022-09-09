package atividade04_lse;
import java.util.Scanner;

public class LSEProdutos {

    private LSENode primeiro;

    public boolean isEmpty(){
        if(this.primeiro == null){
            return true;
        } else {
            return false;
        }
    }

    public void inserirProdutoInicio (Produto pr){
        LSENode novo;
        LSENode result = this.buscar(pr);

        if(result != null){
            System.out.println("Produto já está na lista!");
        } else {
            novo = new LSENode(pr);
            if(this.isEmpty() == true){
                this.primeiro = novo;
            } else {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
            }
            System.out.println("Inserção realizada!");
        }
    }

    public void inserirProdutoFinal (Produto pr){
        LSENode novo, aux;
        LSENode result = this.buscar(pr);

        if(result != null){
            System.out.println("Produto já está na lista");
        } else {
            novo = new LSENode(pr);
            if(this.isEmpty() == true){
                this.primeiro = novo;
            } else {
                aux = this.primeiro;
                while (aux.getProx() != null){
                    aux = aux.getProx();
                }
                aux.setProx(novo);
            }
            System.out.println("Inserção realiza!");
        }
    }

    private LSENode buscar (Produto pr){
        LSENode aux;
        if(this.isEmpty() == true){
            return null;
        } else {
            aux = this.primeiro;
            while (aux != null){
                if(aux.getInfo().compareTo(pr) == 0){
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void exibir() {
        LSENode aux;
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

    public void exibirUmProduto(String c){
        Produto aux = new Produto(c);
        LSENode result = this.buscar(aux);

        if(result != null){
            System.out.println("Dados do Produto: ");
            System.out.println(result.getInfo());
        } else {
            System.out.println("Produto não existente na lista");
        }
    }

    public void removerPrimeiro(){
        if(this.isEmpty() == true){
            System.out.println("Lista vazia!");
        } else {
            primeiro = this.primeiro.getProx();
            System.out.println("Produto removido!");
        }
    }

    public void removerUltimo(){
        LSENode aux;
        if(this.isEmpty() == true){
            System.out.println("Lista vazia!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                if(aux.getProx() == null){
                    aux = null;
                } else {
                    aux = aux.getProx();
                }
            }
        }
    }

    public void removeUmProduto(String c){
        Produto aux = new Produto (c);
        LSENode atual, anterior;
        if(this.isEmpty() == true){
            System.out.println("Lista vazia!");
        } else if (this.primeiro.getProx() == null){
            if(aux.compareTo(this.primeiro.getInfo()) == 0){
                this.primeiro = null;
                System.out.println("Produto removido!");
            } else {
                System.out.println("Produto nao encontrado!");
            }
        } else {
            if (aux.compareTo(this.primeiro.getInfo()) == 0){
                this.primeiro = this.primeiro.getProx();
                System.out.println("Produto removido!");
            }
             anterior = null;
             atual = this.primeiro;
             while (atual != null){
                if(atual.getInfo().compareTo(aux) != 0){
                    anterior = atual;
                    atual = atual.getProx();
                } else {
                    break;
                }
             } if (atual == null){
                System.out.println("Valor não encontrado!");
             } else {
                anterior.setProx(atual.getProx());
                System.out.println("Produto removido!");
             }
        }
    }

    public void alteraDados(String c){
        Scanner in = new Scanner (System.in);
        Produto aux = new Produto(c);
        int novoEstoque;
        double novoPreço;
        LSENode result = this.buscar(aux);

        if(result == null) {
            System.out.println("Aluno não encontrado!");
        } else {
            System.out.println("Informe o novo preço do produto: ");
            novoPreço = in.nextDouble();
            result.getInfo().setPreco(novoPreço);

            System.out.println("Informe o novo estoque: ");
            novoEstoque = in.nextInt();
            result.getInfo().setEstoque(novoEstoque);
   
            System.out.println("Dados alterados!");
        }
    }

}
