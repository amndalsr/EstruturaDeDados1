import br.unicap.edi.ldec.LDECircular;
import br.unicap.edi.ldec.LDECNode;
import java.util.Scanner;

public class Cadastro {
    private LDECircular<Aluno> cadastro;

    public Cadastro() {
        cadastro = new LDECircular<>();
    }

    public void CadastrarAluno(Aluno al) {
        cadastro.inserir(al);
        System.out.println("Aluno cadastrado!");
    }

    public void ListarCadastro() {
        cadastro.exibir();
    }

    public void ConsultarCadastro(Aluno al) {
        if (cadastro.isEmpty() == true) {
            System.out.println("Aluno não cadastrado!");
        } else {
            cadastro.buscar(al);
            System.out.println("Aluno encontrado: " + al);
        }
    }

    public void alteraMediaFinal(Aluno al) {
        Scanner in = new Scanner(System.in);
        LDECNode<Aluno> result = cadastro.buscar(al);
        double novaMedia;

        if (result == null) {
            System.out.println("Aluno não encontrado!");
        } else {
            System.out.println("Informe a nova média final do aluno: ");
            novaMedia = in.nextDouble();
            result.getInfo().setMedia(novaMedia);

            System.out.println("Média final alterada para: " + novaMedia);
        }
    }

    public void alteraQuantidadeFaltas(Aluno al) {
        Scanner in = new Scanner(System.in);
        LDECNode<Aluno> result = cadastro.buscar(al);
        int novaQuantidadeF;

        if (result == null) {
            System.out.println("Aluno não encontrado!");
        } else {
            System.out.println("Informe a nova média final do aluno: ");
            novaQuantidadeF = in.nextInt();
            result.getInfo().setFaltas(novaQuantidadeF);

            System.out.println("Média final alterada para: " + novaQuantidadeF);
        }
    }

    public void exibirDados(Aluno al) {
        cadastro.buscar(al);
        if (cadastro.isEmpty() == true) {
            System.out.println("Aluno não cadastrado!");
        } else {
            System.out.println("DADOS DO ALUNO: " + "\n");
            System.out.println("Quantidade de faltas: " + al.getFaltas());
            System.out.println("Média Final: " + al.getMedia());
        }
    }

    public void removerAluno(Aluno al) {
        if (cadastro.isEmpty() == true) {
            System.out.println("Aluno não cadastrado!");
        } else {
            cadastro.remover(al);
            System.out.println("Aluno removido do cadastro!");
        }
    }

}
