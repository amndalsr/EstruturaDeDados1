import br.unicap.edi.queue.Queue;

public class Empresa {
    private Queue<Projeto> fila;

    public Empresa() {
        fila = new Queue();
    }

    public void cadastrarProjeto(Projeto pj) {
        fila.enQueue(pj);
        System.out.println("Projeto cadastrado!");
    }

    public void aprovarProjeto() {
        if (fila.isEmpty() == true) {
            System.out.println("Não há Projetos em espera!");
        } else {
            fila.deQueue();
            System.out.println("Projeto aprovado!");
        }
    }
}
