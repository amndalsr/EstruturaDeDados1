import br.unicap.edi.cadastro.CadastroProduto;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        CadastroProduto loja1 = new CadastroProduto();
        int opcoes;

        do {
            exibiropcoes();
            opcoes = in.nextInt(); in.nextLine();
            
            switch(opcoes){
                case 1: loja1.CadastrarProduto();
                        break;
                case 2: loja1.exibirTodos();
                        break;
                case 3: loja1.buscarProduto();
                        break;
                case 4: loja1.alterarPreco();
                        break;
                case 5: loja1.alterarQtdEstoque();
                        break;
                case 6: loja1.exibirInfoDoProduto();
                        break;
                case 7: loja1.removerProduto();
                        break;
                case 0: System.out.println("Encerrando...");
                        break;
                default: System.out.println("Opção inválida!");
            }

        } while (opcoes != 0);
    }
    
    public static void exibiropcoes() { 
        System.out.println("CADASTRO DE PRODUTOS" + "\n");
        System.out.println("1 - CADASTRAR PRODUTO");
        System.out.println("2 - INFORMAÇÕES DE TODOS OS PRODUTOS");
        System.out.println("3 - BUSCAR PRODUTO");
        System.out.println("4 - ALTERAR PREÇO DE UM PRODUTO");
        System.out.println("5 - ALTERAR QUANTIDADE EM ESTOQUE DE UM PRODUTO");
        System.out.println("6 - EXIBIR INFORMAÇÕES DE UM PRODUTO");
        System.out.println("7 - REMOVER PRODUTO DA LOJA");
        System.out.println("0 - SAIR DO PROGRAMA");

    }
}
