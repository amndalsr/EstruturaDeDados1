package lse_comdescritor;

public class LSENode {
    private Produto info;
    private LSENode prox;

    public LSENode (Produto valor){
        this.info = valor;
    }

    public void setInfo(Produto valor){
        this.info = valor;
    }

    public void setProx(LSENode novoProx){
        this.prox = novoProx;
    }

    public Produto getInfo(){
        return this.info;
    }

    public LSENode getProx(){
        return this.prox;
    }
}
