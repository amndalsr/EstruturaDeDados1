package atividade04_lse;

public class Produto implements Comparable <Produto>{

    private String codigo;
    private String desc;
    private double preco;
    private int estoque;

    public Produto (String c){
        this.codigo = c;
    }

    public void setCodigo (String codigo){
        this.codigo = codigo;
    }

    public void setDesc (String desc){
        this.desc = desc;
    }

    public void setPreco (double preco){
        this.preco = preco;
    }

    public void setEstoque (int estoque){
        this.estoque = estoque;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getDesc(){
        return desc;
    }

    public Double getPreco(){
        return preco;
    }

    public int getEstoque(){
        return estoque;
    }

    @Override
    public int compareTo (Produto pr){
        int result;
        result = this.getCodigo().compareTo(pr.getCodigo());
        return result;
    }

    @Override
    public String toString(){
        return this.codigo + " " + this.desc + " " + this.preco + " " + this.estoque;
    }

}