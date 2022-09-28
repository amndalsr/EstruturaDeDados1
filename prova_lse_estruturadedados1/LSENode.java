package prova_lse_estruturadedados1;

public class LSENode {
    private Inteiro info;
    private LSENode prox;

    public LSENode (Inteiro valor){
        this.info = valor;
    }

    public void setInfo(Inteiro valor){
        this.info = valor;
    }

    public void setProx(LSENode novoProx){
        this.prox = novoProx;
    }

    public Inteiro getInfo(){
        return this.info;
    }

    public LSENode getProx(){
        return this.prox;
    }
}