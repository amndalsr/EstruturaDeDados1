package convertetipodedados;
import br.unicap.edi.atv;
import java.util.Scanner;
import java.util.Stack;
//testar com import .jar

public class converteB {
    public static void main(String[] args) {
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
