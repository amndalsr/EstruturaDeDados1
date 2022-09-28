package prova_lse_estruturadedados1;

public class LSEInteiros {

    LSENode primeiro;

    public LSEInteiros divideListas (LSEInteiros l1, LSEInteiros l2) {
        LSEInteiros l3 = new LSEInteiros();
        LSEInteiros l4 = new LSEInteiros();
        LSENode aux1 = l1.primeiro;
        LSENode aux2 = l2.primeiro;
        LSENode aux3 = null;
        LSENode aux4 = null;

        do {
            int valorL1 = 0;
            int valorL2 = 0;

            if (aux1 != null) {
                valorL1 = aux1.getInfo().getNumero();
            }

            if (aux2 != null) {
                valorL2 = aux2.getInfo().getNumero();
            }

            Inteiro divisao = new Inteiro(valorL1 / valorL2);
            LSENode nodeL3 = new LSENode(divisao);

            Inteiro resto = new Inteiro (valorL1 % valorL2);
            LSENode nL4 = new LSENode(resto);

            if (l3.primeiro == null) {
                l3.primeiro = nodeL3;
                aux3 = nodeL3;
            } else {
                aux3.setProx(nodeL3);
                aux3 = nodeL3;
            }

            if (l4.primeiro == null) {
                l4.primeiro = nL4;
                aux4 = nL4;
            } else {
                aux4.setProx(nL4);
                aux4 = nL4;
            }

            aux1 = aux1 != null ? aux1.getProx() : null;
            aux2 = aux2 != null ? aux2.getProx() : null;

        } while (aux1 != null || aux2 != null);

        return l3;
    }
}
