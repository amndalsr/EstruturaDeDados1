package br.unicap.edi.info;

public class Produto implements Comparable <Produto> {
    private String codigo;
    private String descricao;
    private String fornecedor;
    private double preco;
    private int qtdestoque;

    public Produto (String c) {
        this.codigo = c;
    }

    public Produto (String c, String desc, String f, double p, int qtd) {
        this.codigo = c;
        this.descricao = desc;
        this.fornecedor = f;
        this.preco = p;
        this.qtdestoque = qtd;
    }

    public void setCodigo (String c) {
        this.codigo = c;
    } 

    public void setDescricao (String desc) {
        this.descricao = desc;
    }

    public void setFornecedor (String f) {
        this.fornecedor = f;
    }

    public void setPreco (double p) {
        this.preco = p;
    }

    public void setQtdEstoque (int qtd) {
        this.qtdestoque = qtd;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdestoque;
    }

    @Override
    public int compareTo(Produto pr) {
        int result;
        result = this.getCodigo().compareTo(pr.getCodigo());
        return result;
    }

    @Override
    public String toString() {
        return this.codigo + " " + this.descricao + " " + this.fornecedor + " " + this.preco + " " + this.qtdestoque;
    }
}
