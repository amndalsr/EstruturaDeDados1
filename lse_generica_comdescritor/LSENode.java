package lse_generica_comdescritor;

public class LSENode <T extends Comparable<T>>{
    private T info;
    private LSENode<T> prox;

    public LSENode (T valor){
        this.info = valor;
    }

    public void setInfo(T valor){
        this.info = valor;
    }
    
    public T getInfo(){
        return this.info;
    }

    public void setProx(LSENode<T> novoProx){
        this.prox = novoProx;
    }

    public LSENode<T> getProx(){
        return this.prox;
    }
}
