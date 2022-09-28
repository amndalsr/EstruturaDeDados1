package atividade05_lse_ordenada_livraria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LSEOrdenada listaLivros = new LSEOrdenada();
        String codigo, autor, titulo;
        double valor = 0.0;
        int estoque, op;
        Livro l;

        do {
            exibeMenu();
                op = in.nextInt(); in.nextLine();
                switch(op){
                    case 1: System.out.println("Informe o nome do livro: ");
                            titulo = in.nextLine();
                            System.out.println("Informe o código do livro: ");
                            codigo = in.nextLine();
                            l = new Livro(codigo, titulo);
                            listaLivros.inserirOrdenado(l);
                            break;
                    
                    case 0: System.out.println("Encerrando...");
                    break;
                    default: System.out.println("Opção inválida!");
                }
        } while (op != 0);
    }

    public static void exibeMenu(){
        System.out.println("Opções: ");
        System.out.println("1- Inserir livro na lista");
        System.out.println("2- Remover um livro cadastrado");
        System.out.println("3- Exibir os dados de um livro");
        System.out.println("4- Alterar preço de um livro");
        System.out.println("5- Atualizar o estoque de um livro");
        System.out.println("6- Vender um livro");
        System.out.println("7- Exibir todos os livros cadastrados");
        System.out.println("0- Sair do programa");
        System.out.println("Digite a opção desejada: ");
    }
}