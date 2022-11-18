public class Aluno implements Comparable <Aluno> {
    private String matricula;
    private String nome;
    private double media;
    private int faltas;

    public Aluno (String m) {
        this.matricula = m;
    }

    public Aluno (String m, String n, double md, int f) {
        this.matricula = m;
        this.nome = n;
        this.media = md;
        this.faltas = f;
    }

    public void setMatricula (String matricula) {
        this.matricula = matricula;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setMedia (double media) {
        this.media = media;
    }

    public void setFaltas (int faltas) {
        this.faltas = faltas;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public int getFaltas() {
        return faltas;
    }

    @Override
    public int compareTo(Aluno al) {
        int result;
        result = this.getMatricula().compareTo(al.getMatricula());
        return result;
    }

    @Override
    public String toString () {
        return this.matricula + " " + this.nome + " " + this.media + " " + this.faltas;
    }
}
