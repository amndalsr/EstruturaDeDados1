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

}
