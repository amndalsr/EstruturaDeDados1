package atividade04_lse;
import java.util.Scanner;

public class TestaLSE {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            LSEProdutos prod = new LSEProdutos();
            int op;
            Produto pr;
            String codigo, desc;

            do{
                exibeMenu();
                op = in.nextInt(); in.nextLine();
                switch(op){
                    case 1: System.out.println("Informe o nome do produto: ");
                            desc = in.nextLine();
                            System.out.println("Informe o código do produto: ");
                            codigo = in.nextLine();
                            pr = new Produto(codigo, desc);
                            prod.inserirProdutoInicio(pr);
                            break;
                    case 2: System.out.println("Informe o nome do produto: ");
                            desc = in.nextLine();
                            System.out.println("Informe o código do produto: ");
                            codigo = in.nextLine();
                            pr = new Produto(codigo, desc);
                            prod.inserirProdutoFinal(pr);
                            break;
                    case 3: prod.removerPrimeiro();
                            prod.exibir();
                            break;
                    case 4: prod.removerUltimo();
                            prod.exibir();
                            break;
                    case 5: prod.exibir();
                            break;
                    case 6: System.out.println("Informe o código do produto: ");
                            codigo = in.nextLine();
                            prod.exibirUmProduto(codigo);
                            break;
                    case 7: System.out.println("Informe o nome do produto: ");
                            desc = in.nextLine();
                            prod.alteraDados(desc);
                            prod.exibir();
                            break;
                    case 8: System.out.println("Informe o nome do produto: ");
                            desc = in.nextLine();
                            prod.removeUmProduto(desc);
                            prod.exibir();
                            break;
                    case 0: System.out.println("Encerrando...");
                    break;
                    default: System.out.println("Opção inválida!");
                }

            } while (op != 0);
        }
    }

    public static void exibeMenu(){
        System.out.println("Opções: ");
        System.out.println("1- Inserir novo produto no início da lista");
        System.out.println("2- Inserir novo produto no final da lista");
        System.out.println("3- Remover o primeiro produto da lista");
        System.out.println("4- Remover o último produto da lista");
        System.out.println("5- Exibir todos os produtos da lista");
        System.out.println("6- Exibir os dados de um produto da lista");
        System.out.println("7- Alterar os dados de um produto da lista");
        System.out.println("8- Remover um dado produto");
        System.out.println("0- Sair do programa");
        System.out.println("Digite a opção desejada: ");
    }
}
