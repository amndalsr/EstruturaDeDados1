/*
public class Queue<T>{
    private LSENode<T> inicio;
    private LSENode<T> fim;

    public boolean isEmpty(){
        if (this.primeiro == null){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        return false;
    }

    public void enQueue(T valor){ ---inserir no final
        LSENode<T> novo = new LSENode(valor);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        } else {
            this.fim.setProx(novo);
            this.fim = novo;
        }
    }

    public T deQueue(){ ---desenfilerar
        LSENode<T> aux = this.inicio;
        if (this.inicio == this.fim) {
            this.inicio = null;
            this.fim = null;
        } else {
            this.inicio = this.inicio.getProx();
        }
        return aux.getInfo();
    }

    public T head(){
        return this.inicio.getInfo();
    }
} 

-----------atividae--------------
QUESTAO01- lanchonete

Main(){
    Lanchonete lanche = new Lanchonete();
    int op, num;
    String descricao;

    do{
        exibirOpcoes();
        op = in.netxInt(); // in.nextLine();

        switch(op){
            case 1: num++;
                    sout-- informar pedido;
                    desc = in.nextLine();
                    p = new Pedido(descricao, numro);
                    lanche.cadastrarPedido(p);
                    break;
            case 2: lanche.atenderPedido();
                    break;
            default: sout-- op invalida;
        } while (op != 0);
    }

    public void exibirOpcoes(){
        MENU 
    }
}

Pedido(){ --classe
    private String descrcao;
    private int num;

    public Pedido(String desc, int n){
        this.descricao = desc;
        this.num = n;
    }
    getters e setters;

    public String toString(){
        return this.num + "" + this.descricao;
    }
}

Lanchonete(){ --classe
    private Queue<Pedidos> fila;

    public Lachonete(){
        fila = new Queue();
    }

    public void cadastrarPedido(){
        fila.enQueue(p);
        sout-- pedido cadastrado!!
    }
    public void atenderPedido(){
        if (fila.isEmpty() == true){
            sout-- não há pedidos em espera!!
        } else {
            p.fila.deQueue();
            sout-- "preparando pedido" + p
        }
    }
}
*/