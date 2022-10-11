import java.util.Scanner;

import br.unicap.edi.stack.LSENode;
import br.unicap.edi.stack.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int num = 0;
        String frase;

        System.out.println("Digite um número inteiro em decimal: ");
        num = in.nextInt();
        conversaoBinario(num);

        System.out.println("Digite uma frase: ");
        frase = in.nextLine();
        identificaPalindromo(frase);
    }

    public static void conversaoBinario(int num) {
        Stack<Integer> pilha = new Stack<Integer>();
        int aux = num;
        int resto, quociente;

        do {
            quociente = aux / 2;
            resto = aux % 2;
            pilha.push(resto);
            aux = quociente;
        } while (aux != 0);

        while (pilha.isEmpty() == false) {
            resto = pilha.pop();
            System.out.println(resto);
        }
    }

    public static void identificaPalindromo(String frase) {
        Stack<Character> pilha = new Stack<Character>();
        String aux = frase;
        String reverso = "";
        
        for (int i = 0; i < aux.length(); i++) {
            pilha.push(aux.charAt(i));
        }

        while (pilha.isEmpty() == false){
            reverso += pilha.pop();
        }

        if (aux.equals(reverso)){
            System.out.println(reverso + "É um palíndromo!");
        } else {
            System.out.println(reverso + "Não é palíndromo!");
        }
    }
}
