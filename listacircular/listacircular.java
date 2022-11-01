//criar biblioteca 

//CLASSE LDENODE
public class LDENode <T extends Comparable<T>> {
    private LDENode<T> anterior;
    private T info;
    private LDENode<T> proximo;

    public LDENode (T valor) {
        this.info = valor;
    }

    public void setAnterior(LDENode<T> novoAnterior) {
        this.anterior = novoAnterior;
    }

    public LDENode<T> getAnt() {
        return this.anterior;
    }

    public void setInfo (T valor) {
        this.info = valor;
    }

    public T getInfo() {
        return this.info;
    }

    public void setProximo (LDENode<T> novoProximo) {
        this.proximo = novoProximo;
    }

    public LDENode<T> getProx() {
        return this.proximo;
    }
}




//CLASSE LDECIRCULAR

public class LDECircular <T extends Comparable<T>> {
    private LDENode<T> primeiro;
    private LDENode<T> ultimo;
    private int qtd;
    
    public boolean isEmpty() {
        if (this.qtd == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void inserir(T valor) {
        LDENode<T> novo = new LDENode(valor);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd = 0;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        } else {
            novo.setProximo(this.primeiro);
            this.primeiro.setAnterior(novo);
            this.primeiro = novo;
            this.qtd++;
            this.primeiro.setAnterior(this.ultimo);
            this.ultimo.setProximo(this.primeiro);
        }
    }
}

//criar metodo exibir