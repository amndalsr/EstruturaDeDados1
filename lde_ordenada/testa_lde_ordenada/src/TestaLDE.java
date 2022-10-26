import br.unicap.edi.lde.LDECrescente;
import br.unicap.edi.lde.LDENode;

public class TestaLDE {
    public static void main(String[] args) throws Exception {
        LDECrescente<Integer> lista1 = new LDECrescente();

        lista1.inserir(10);
        lista1.inserir(11);
        lista1.inserir(12);
        lista1.inserir(13);
        System.out.println("Valores da Lista: ");
        lista1.remover(11);
        lista1.exibirTodos();
    }
}
