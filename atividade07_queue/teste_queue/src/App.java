import br.unicap.edi.queue.Queue;
import br.unicap.edi.queue.LSENode;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        Lanchonete lanche = new Lanchonete();
        Empresa projt = new Empresa();
        int op, num = 0;
        String descricao, proposta;
        Pedido p;
        Projeto pj;

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
                case 3: num++;
                        System.out.println("Nome do projeto: ");
                        proposta = in.nextLine();
                        pj = new Projeto(proposta, num);
                        projt.cadastrarProjeto(pj);
                        break;
                case 4: projt.aprovarProjeto();
                        break;
                default: System.out.println("Opção inválida!");
            }

        } while (op != 0);
    }
    
    public static void exibirOpcoes() { 
        System.out.println("QUESTÃO 01 - Controle da Lanchonete." + "\n" );
        System.out.println("Digite 1 para fazer o pedido: ");
        System.out.println("Digite 2 para atender o pedido: ");
        System.out.println("Digite 0 para encerrar os atendimentos: " + "\n" );
        System.out.println("QUESTÃO 02 - Avaliação de Projetos." + "\n" );
        System.out.println("Digite 3 para receber um projeto: ");
        System.out.println("Digite 4 para avaliar o projeto: ");
        System.out.println("Digite 0 para encerrar os atendimentos: " + "\n" );

    }
}
