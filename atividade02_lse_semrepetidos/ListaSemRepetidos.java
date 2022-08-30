package atividade02_lse_semrepetidos;
import java.util.Scanner;

public class ListaSemRepetidos {
    public static void main(String[] args) {
        try (Scanner in = new Scanner (System.in)) {
            LSEAluno turma = new LSEAluno();
            int op;
            Aluno al;
            String nome, matr;
            do {
                exibeMenu();
                op = in.nextInt(); in.nextLine();
                switch (op) {
                    case 1: System.out.print("Informe a matrícula do aluno: ");
                            matr = in.nextLine();
                            System.out.print("Informe o nome do aluno: ");
                            nome = in.nextLine();
                            al = new Aluno (matr, nome);
                            turma.inserirAluno(al);
                            break;
                    case 2: System.out.print("Informe a matrícula do aluno: ");
                            matr = in.nextLine();
                            System.out.print("Informe o nome do aluno: ");
                            nome = in.nextLine();
                            al = new Aluno (matr, nome);
                            turma.inserirAlunoFinal(al);
                            break;
                    case 3: turma.exibir();
                            break;
                        
                    case 4: System.out.println("Informe o nome do aluno: ");
                            matr = in.nextLine();
                            turma.exibirAluno(matr);
                    case 0: System.out.println("Encerrando...");
                            break;
                    default: System.out.println("Opção inválida");
                }           
            } while (op != 0);
        }
    }
    public static void exibeMenu() {
        System.out.println("Opções");
        System.out.println("1- Cadastrar novo aluno no início da lista");
        System.out.println("2- Cadastrar novo aluno no final da lista");
        System.out.println("3- Exibir todos os alunos da lista");
        System.out.println("4- Exibir os dados de um aluno");
        System.out.println("5- Alterar a média de um aluno");
        System.out.println("6- Alterar a quantidade de faltas de um aluno");
        System.out.println("7- Remover um aluno da lista");
        System.out.println("0- Sair do programa");
        System.out.print("Digite a opção desejada: ");
    }
}
