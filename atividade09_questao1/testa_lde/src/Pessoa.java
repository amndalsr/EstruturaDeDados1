public class Pessoa implements Comparable <Pessoa>{
    private String nome;
    private String rg;

    public Pessoa (String n, String rg) {
        this.nome = n;
        this.rg = rg;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setRg (String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    } 

    public String fetRg() {
        return rg;
    }

    @Override
    public int compareTo(Pessoa p){
        return this.rg.compareTo(p.rg);
    }

    public String toString() {
        return this.nome + " " + this.rg;
    }
}
