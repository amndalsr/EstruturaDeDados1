import br.unicap.edi.lde.LDE;
import br.unicap.edi.lde.LDENode;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        LDE pred = new LDE();
        int op, rg;
        Pessoa pessoa;
        String nome;

        do {
            exibeMenu();
            op = in.nextInt(); in.nextLine();

            switch(op){
                case 1: System.out.println("Informe seu nome: ");
                        nome = in.nextLine();
                        System.out.println("Informe o número do seu RG: ");
                        rg = in.nextInt();
                        pessoa = new Pessoa(nome, rg);
                        pred.inserirFinal(pessoa);
                        break;
                case 2: pred.removerNoFinal();
                        break;
                case 3: pred.exibirAoContrario();
                        break;
                case 4: System.out.println("Informe o RG para virificação: ");
                        rg = in.nextInt();
                        pred.verificar(rg);
                        break;
                case 5: pred.exibirQtd();
                        break;
                case 6: System.out.println("Informe o seu RG: ");
                        rg = in.nextInt();
                        pred.remover(rg);
                        break;
                case 0: System.out.println("Encerrando...");
                break;
                default: System.out.println("Opção inválida!");
            }

        } while (op != 0);
    }

    public static void exibeMenu(){
        System.out.println("Opções: ");
        System.out.println("1- Cadastrar-se para entrar no prédio");
        System.out.println("2- Cancelar registro");
        System.out.println("3- Exibir dados das pessoas que estão no prédio");
        System.out.println("4- Verificar se a pessoa se encontra no prédio");
        System.out.println("5- Quantidade de pessoas presentes no prédio");
        System.out.println("6- Sair do prédio, remover registro");
        System.out.println("0- Sair do programa");
        System.out.println("Digite a opção desejada: ");
    }
}
