package atividade05_lse_ordenada_livraria;

public class Livro implements Comparable <Livro>{
    private String codigo;
    private String titulo;
    private String autor;
    private double preco;
    private int estoque;
    private int quantidade;

    public Livro (String cod, String t) {
        this.codigo = cod;
        this.titulo = t;
    }
    public Livro (String cod) {
        this.codigo = cod;
    }

    public void setCodigo (String codigo) {
        this.codigo = codigo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public void setAutor (String autor) {
        this.autor = autor;
    }

    public void setPreco (double preco) {
        this.preco = preco;
    }

    public void setEstoque (int estoque) {
        this.estoque = estoque;
    }

    public void setQtd (int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Livro l) {
        return this.codigo.compareTo(l.codigo);
    }

    @Override
    public String toString() {
        return this.codigo + " " + this.titulo + " " + this.autor + " " + this.preco + " " + this.estoque + " " + this.quantidade;
    }
    public Livro getInfo() {
        return null;
    }
}
