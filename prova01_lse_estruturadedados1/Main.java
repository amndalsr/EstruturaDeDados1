package prova01_lse_estruturadedados1;

public class Main {
    public static void main(String[] args) {
        LSEInteiros lista1 = new LSEInteiros();
        int l1 = 0;

        LSENode n1 = new LSENode(new Inteiro(10));
        lista1.primeiro = n1;
        LSENode n2 = new LSENode(new Inteiro(5));
        n1.setProx(n2);
        LSENode n3 = new LSENode(new Inteiro(11));
        n2.setProx(n3);
        LSENode n4 = new LSENode(new Inteiro(17));
        n3.setProx(n4);



        LSEInteiros lista2 = new LSEInteiros();
        n1 = new LSENode(new Inteiro(3));
        lista2.primeiro = n1;
        n2 = new LSENode(new Inteiro(3));
        n1.setProx(n2);
        n3 = new LSENode(new Inteiro(2));
        n2.setProx(n3);
        n4 = new LSENode(new Inteiro(1));
        n3.setProx(n4);

        LSEInteiros listDiv = lista1.divideListas(lista1, lista2);
    }
}
