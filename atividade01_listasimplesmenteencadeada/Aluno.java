package atividade01_listasimplesmenteencadeada;

public class Aluno {
    private String nome;
    private String matr;
    private double media;
    private int faltas;

    public Aluno (String n, String m){
        this.nome = n;
        this.matr = m;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatr(String matr){
        this.matr = matr;
    }

    public void setMedia(double media){
        this.media = media;
    }

    public void setFaltas(int faltas){
        this.faltas = faltas;
    }

    public String getMatr(){
        return matr;
    }

    public String getNome(){
        return nome;
    }

    public double getMedia(){
        return media;
    }

    public int getFaltas(){
        return faltas;
    }

    public String toString() {
        return "Aluno [faltas=" + faltas + ", matr=" + matr + ", media=" + media + ", nome=" + nome + "]";
    }
}
