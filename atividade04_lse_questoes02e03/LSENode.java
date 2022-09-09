package atividade04_lse_questoes02e03;

public class LSENode {
    private Numero info;
    private LSENode prox;

    public LSENode (Numero valor){
        this.info = valor;
    }

    public void setInfo(Numero valor){
        this.info = valor;
    }

    public void setProx(LSENode novoProx){
        this.prox = novoProx;
    }

    public Numero getInfo(){
        return this.info;
    }

    public LSENode getProx(){
        return this.prox;
    }
}
