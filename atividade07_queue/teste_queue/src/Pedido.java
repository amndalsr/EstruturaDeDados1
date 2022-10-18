public class Pedido {
    private String descricao;
    private int num;

    public Pedido (String desc, int n) {
        this.descricao = desc;
        this.num = n;
    }

    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public void setNum (int num) {
        this.num = num;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return this.num + " " + this.descricao;
    }
}
