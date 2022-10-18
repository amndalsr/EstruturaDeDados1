import br.unicap.edi.queue.Queue;

public class Lanchonete {
    private Queue<Pedido> fila;
    
    public Lanchonete() {
        fila = new Queue();
    }

    public void cadastrarPedido(Pedido p) {
        fila.enQueue(p);
        System.out.println("Pedido cadastrado!");
    }

    public void atenderPedido() {
        if (fila.isEmpty() == true) {
            System.out.println("Não há pedidos em espera!");
        } else {
            fila.deQueue();
            System.out.println("Preparando pedido!");
        }
    }
}
