package atividade05_lse_ordenada;

public class LSEOrdenada  <T extends Comparable <T>>{
    
    private LSENode<T> primeiro;
    private LSENode<T> ultimo;
    private int qtd;

    public boolean isEmpty() {
        if (this.primeiro == null && this.ultimo == null && this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }
}
