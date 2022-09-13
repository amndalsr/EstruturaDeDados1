package atividade03_lse_copiadalista;

public class Aluno implements Comparable <Aluno> {
    
    private String matr;
    private String nome;
    private double media;
    private int faltas;

    public Aluno(String m){
        this.matr = m;
    }

    public Aluno (String m, String n, double me, int f){
        this.matr = m;
        this.nome = n;
        this.media = me;
        this.faltas = f;
    }

    public Aluno (String m, String n){
        this.matr = m;
        this.nome = n;
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

    public Aluno copiarAluno(){
        Aluno novo = new Aluno(this.matr, this.nome, this.media, this.faltas);
        return novo;
    }

    @Override
    public int compareTo (Aluno al) {
        int result;
        result = this.getMatr().compareTo(al.getMatr());
        return result;
    }
    
    @Override
    public String toString () {
        return this.matr + " " + this.nome + " " + this.media + " " + this.faltas;
    }
    
}
