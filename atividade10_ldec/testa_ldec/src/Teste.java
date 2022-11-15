import br.unicap.edi.ldec.LDECircular;

public class Teste {
    public static void main(String[] args) throws Exception {
        LDECircular<Integer> l1 = new LDECircular();

        LDECircular<Integer> l2 = new LDECircular();

        //Testa método concatenar
        l1.inserirOrdemDecrescente(5);
        l1.inserirOrdemDecrescente(9);
        l1.inserirOrdemDecrescente(3);
        l1.inserirOrdemDecrescente(12);

        l2.inserirOrdemDecrescente(7);
        l2.inserirOrdemDecrescente(8);
        l2.inserirOrdemDecrescente(34);

        l1.concatenar(l1, l2);
        l1.exibirTodos();

        //Testa método dividir
        l2.inserirOrdemDecrescente(5);
        l2.inserirOrdemDecrescente(9);
        l2.inserirOrdemDecrescente(3);
        l2.inserirOrdemDecrescente(12);

        l1.dividir(l2);
    }
}
