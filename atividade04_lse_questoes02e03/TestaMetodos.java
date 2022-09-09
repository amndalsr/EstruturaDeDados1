package atividade04_lse_questoes02e03;

public class TestaMetodos {
    public static void main(String[] args) {
        LSENumeros lista1 = new LSENumeros();
        LSENode n1 = new LSENode(new Numero(5));
        lista1.primeiro = n1;
        LSENode n2 = new LSENode(new Numero(5));
        n1.setProx(n2);
        LSENode n3 = new LSENode(new Numero(8));
        n2.setProx(n3);

        LSENumeros lista2 = new LSENumeros();
        n1 = new LSENode(new Numero(2));
        lista2.primeiro = n1;
        n2 = new LSENode(new Numero(7));
        n1.setProx(n2);

        LSENumeros listSoma = lista1.somaListas(lista1, lista2);
        lista1.removerDuplicados(5);

        int a = 0;


    }
}
