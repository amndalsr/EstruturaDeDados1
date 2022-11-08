package atividade09_questoes2.testa_lde.src;
import br.unicap.edi.led.LDE;
import br.unicap.edi.led.LDENode;

public class App {
    public static void main(String[] args) throws Exception {
        LDE<Integer> lista1 = new LDE();

        lista1.inserir(5);
        lista1.inserir(2);
        lista1.inserir(13);
        lista1.inserir(7);
        lista1.inserir(7);

        System.out.println("Valores na lista: ");
        lista1.exibirTodos();

        System.out.println("Valores na lista em ordem crescente: ");
        lista1.exibirAoContrario();

        lista1.verificar(9);

        lista1.remover(2);
        lista1.exibirTodos();


    }
}
