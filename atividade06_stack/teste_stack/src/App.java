import java.util.Scanner;
import br.unicap.edi.stack.Stack;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner (System.in);
        Stack<Integer> pilha = new Stack();
        int num, resto, quociente;

        System.out.println("Digite um número inteiro em decimal: ");
        num = in.nextInt();

        do {
            quociente = num / 2;
            resto = num % 2;
            pilha.push(resto);
            num = quociente;
        } while (num != 0);

        while(pilha.isEmpty() == false) {
            resto = pilha.pop();
            System.out.println(resto);
        }
    }
}
