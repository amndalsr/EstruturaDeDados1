public class Projeto {
    private String proposta;
    private int num;

    public Projeto (String prop, int n) {
        this.proposta = prop;
        this.num = n;
    }

    public void setProposta (String proposta) {
        this.proposta = proposta;
    }

    public void setNum (int num) {
        this.num = num;
    }

    public String getProposta() {
        return proposta;
    }

    public int getNum() {
        return num;
    }

    public String toString() {
        return this.proposta + " " + this.num;
    }
}
