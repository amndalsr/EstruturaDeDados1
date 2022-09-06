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
                    /*case 1: System.out.println("Informe o nome do aluno: ");
                            nome = in.nextLine();
                            System.out.println("Informe a matrícula do aluno: ");
                            matr = in.nextLine();
                            al = new Aluno(nome, matr);
                            turma.inserirAluno(al);
                            break;
                    case 2: turma.removeInicio();
                            break;
                    case 3: System.out.println("Informe o nome do aluno: ");
                            nome = in.nextLine();
                            System.out.println("Informe a matrícula do aluno: ");
                            matr = in.nextLine();
                            al = new Aluno(nome, matr);
                            turma.inserirNoFim(al);
                            break;
                    case 4: turma.removeFinal();
                            break;
                    case 5: turma.exibir();
                            break;*/
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
