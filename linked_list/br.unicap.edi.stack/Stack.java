package linked_list.br.unicap.edi.stack;

public class Stack<T> {
    private LSENode<T> topo;

    public boolean isEmpty() {
        if (this.topo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push (T valor) {
        LSENode novo = new LSENode(valor);
        novo.setProx(this.topo);
        this.topo = novo;
    }

    public boolean isFull() {
        return false;
    }

    public T pop() {
        T valor;
        LSENode<T> aux = this.topo; 
        this.topo = this.topo.getProx();
        return aux.getInfo();
    }
}
