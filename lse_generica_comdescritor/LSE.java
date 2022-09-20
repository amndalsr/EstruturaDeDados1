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
        System.out.println("Valores Lista 1:");
        lista1.exibirTodos();

        lista2.inserirNoInicio(123.34);
        lista2.inserirNoInicio(345.83);
        lista2.inserirNoInicio(23423.22);
        System.out.println("Valores Lista 2:");
        lista2.exibirTodos();

        Produto produtoAux = new Produto("123", "Casaco");
        lista3.inserirNoInicio(produtoAux);
        Produto produtoAux2 = new Produto("567", "Blusa");
        lista3.inserirNoInicio(produtoAux2);
        Produto produtoAux3 = new Produto("352", "Tênis");
        lista3.inserirNoInicio(produtoAux3);
        System.out.println("Produtos Lista 3:");
        lista3.exibirTodos();
    }
}
