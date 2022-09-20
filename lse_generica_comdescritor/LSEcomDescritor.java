package lse_generica_comdescritor;

public class LSEcomDescritor<T> {

    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;

    public boolean isEmpty(){
        if(this.qtd == 0){
            return true;
        } else {
            return false;
        }
    }

    public void inserirNoInicio(T valor){
        LSENode<T> novo = new LSENode(valor);
        if(this.isEmpty() == true){
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd = 1;
        } else {
            novo.setProx(this.primeiro);
            this.primeiro = novo;
            this.qtd++;
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

}
