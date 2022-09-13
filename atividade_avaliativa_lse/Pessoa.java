package atividade_avaliativa_lse;

public class Pessoa {
    
    private String nome;
    private int contato;
    private int idade;

    public Pessoa (String n){
        this.nome = n;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setContato(int contato){
        this.contato = contato;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getContato(){
        return contato;
    }

    public int getIdade(){
        return idade;
    }
}
