package atividade_avaliativa_lse;

public class LSENode {

    private Pessoa info;
    private LSENode prox;

    public LSENode (Pessoa valor){
        this.info = valor;
    }

    public void setInfo(Pessoa valor){
        this.info = valor;
    }

    public void setProx(LSENode novoProx){
        this.prox = novoProx;
    }

    public Pessoa getInfo(){
        return this.info;
    }

    public LSENode getProx(){
        return this.prox;
    }
    
}
