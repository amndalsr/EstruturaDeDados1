import br.unicap.edi.lde.LDE;
import br.unicap.edi.lde.LDENode;;

public class App {
    public static void main(String[] args) throws Exception {
        LDE<Integer> lista1 = new LDE();
        LDE<Integer> lista2 = new LDE();

        lista1.inserirOrdemCrescente(12);
        lista1.inserirOrdemCrescente(12);
        lista1.inserirOrdemCrescente(8);
        lista1.inserirOrdemCrescente(16);
        lista1.inserirOrdemCrescente(6);

        lista1.inserirOrdemDecrescente(12);
        lista1.inserirOrdemDecrescente(12);
        lista1.inserirOrdemDecrescente(8);
        lista1.inserirOrdemDecrescente(16);
        lista1.inserirOrdemDecrescente(6);

    }
}
