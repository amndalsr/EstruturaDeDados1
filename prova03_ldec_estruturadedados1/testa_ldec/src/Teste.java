import java.util.Scanner;
import br.unicap.edi.ldec.LDECircular;

public class Teste {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner (System.in);
        Cadastro estudante = new Cadastro();
        Aluno al;
        int op, faltas;
        double media;
        String matricula, nome;

        do {
            exibirOpcoes();
            op = in.nextInt(); in.nextLine();
            
            switch(op){
                case 1: System.out.println("Informe o nome do aluno: ");
                        nome = in.nextLine();
                        System.out.println("Informe a mátricula do aluno: ");
                        matricula = in.nextLine();
                        System.out.println("Informe a média do aluno: ");
                        media = in.nextDouble();
                        System.out.println("Informe a quantidade de faltas do aluno: ");
                        faltas = in.nextInt();
                        al = new Aluno(matricula, nome, media, faltas);
                        estudante.CadastrarAluno(al);
                        break;
                case 2: estudante.ListarCadastro();
                        break;
                case 3: System.out.println("Informe a mátricula do aluno: ");
                        matricula = in.nextLine();
                        estudante.ConsultarCadastro(al);
                        break;
                case 4: System.out.println("Informe a mátricula do aluno: ");
                        matricula = in.nextLine();
                        estudante.alteraMediaFinal(al);
                        break;
                case 5: System.out.println("Informe a mátricula do aluno: ");
                        matricula = in.nextLine();
                        estudante.alteraQuantidadeFaltas(al);
                        break;
                case 6: System.out.println("Informe a mátricula do aluno: ");
                        matricula = in.nextLine();
                        estudante.exibirDados(al);
                        break;
                case 7: System.out.println("Informe a mátricula do aluno: ");
                        matricula = in.nextLine();
                        estudante.removerAluno(al);
                        break;
                case 0: System.out.println("Encerrando.");
                        break;
                default: System.out.println("Opção inválida!");
            }

        } while (op != 0);
    }
    
    public static void exibirOpcoes() { 
        System.out.println("CADASTRO DE ESTUDANTES" + "\n");
        System.out.println("1 - CADASTRAR NOVO ALUNO");
        System.out.println("2 - LISTAR CADASTRO");
        System.out.println("3 - CONSULTAR ALUNO");
        System.out.println("4 - ALTERAR MÉDIA FINAL DE UM ALUNO");
        System.out.println("5 - ALTERAR QUANTIDADE DE FALTAS DE UM ALUNO");
        System.out.println("6 - EXIBIR DADOS DE UM ALUNO");
        System.out.println("7 - REMOVER ALUNO DO CADASTRO");
        System.out.println("0 - SAIR DO PROGRAMA");

    }
    
}
