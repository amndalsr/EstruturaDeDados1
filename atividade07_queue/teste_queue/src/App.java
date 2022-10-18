import br.unicap.edi.queue.Queue;
import br.unicap.edi.queue.LSENode;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        Lanchonete lanche = new Lanchonete();
        int op, num = 0;
        String descricao;
        Pedido p;

        do {
            exibirOpcoes();
            op = in.nextInt(); in.nextLine();
            
            switch(op){
                case 1: num++;
                        System.out.println("Informe seu pedido: ");
                        descricao = in.nextLine();
                        p = new Pedido(descricao, num);
                        lanche.cadastrarPedido(p);
                        break;
                case 2: lanche.atenderPedido();
                        break;
                default: System.out.println("Opção inválida!");
            }

        } while (op != 0);
    }
    
    public static void exibirOpcoes() { 
        System.out.println("Controle da Lanchonete!" + "/n");
        System.out.println("Digite 1 para fazer o pedido: ");
        System.out.println("Digite 2 para atender o pedido: ");
        System.out.println("Digite 0 para encerrar os atendimentos: ");
    }
}
