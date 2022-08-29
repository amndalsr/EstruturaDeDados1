package atividade02_lse_semrepetidos;

public class LSENode {
    
    private Aluno info;
    private LSENode prox;

    public LSENode (Aluno valor){
        this.info = valor;
    }
    
    public void setInfo (Aluno valor){
        this.info = valor;
    }

    public void setProx (LSENode novoProx){
        this.prox = novoProx;
    }

    public Aluno getInfo(){
        return this.info;
    }

    public LSENode getProx(){
        return this.prox;
    }
}
