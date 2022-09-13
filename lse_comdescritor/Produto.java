package lse_comdescritor;

public class Produto implements Comparable <Produto>{
    private String codigo;
    private String descricao;
    private int estoque;
    private double preco;

    public Produto (String cod){
        this.codigo = cod;
    }

    @Override
    public int compareTo(Produto p){
        return this.codigo.compareTo(p.codigo);
    }

    // construtor
    //get e set
    // compare to
}
