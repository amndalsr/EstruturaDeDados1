package lse_generica_comdescritor;

public class Produto implements Comparable <Produto>{
    private String codigo;
    private String descricao;
    private int estoque;
    private double preco;

    public Produto (String cod, String desc){
        this.codigo = cod;
        this.descricao = desc;
    }

    public void setCodigo (String codigo){
        this.codigo = codigo;
    }

    public void setDescricao (String desricao){
        this.descricao = descricao;
    }

    public void setEstoque (int estoque){
        this.estoque = estoque;
    }

    public void setPreco (double preco){
        this.preco = preco;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getEstoque(){
        return estoque;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public int compareTo(Produto p){
        return this.codigo.compareTo(p.codigo);
    }

    @Override
    public String toString(){
        return this.codigo + " " + this.descricao + " " + this.preco + " " + this.estoque;
    }
}
