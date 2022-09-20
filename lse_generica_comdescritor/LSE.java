package lse_generica_comdescritor;
import java.util.Scanner;

public class LSE {
    public static void main(String[] args) {
        LSEcomDescritor<Integer> lista1 = new LSEcomDescritor();
        LSEcomDescritor<Double> lista2 = new LSEcomDescritor();
        LSEcomDescritor<Produto> lista3 = new LSEcomDescritor();
        lista1.inserirNoInicio(10);
        lista1.inserirNoInicio(30);
        lista1.inserirNoInicio(5);
    }
}
