import java.util.Scanner;

/**
 * 1.Contagem Regressiva: Escreva um programa em Java que solicita ao usuário
 * um número inteiro positivo. Utilize uma estrutura de repetição do-while
 * para exibir uma contagem regressiva a partir do número informado
 * pelo usuário até 1.
 */

public class Exercicio10 {
    public static void main(String[] args) {
        int num;

        System.out.println("Este programa irá fazer uma contagem regressiva "
                + "a partir do número informado");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        num = scanner.nextInt();
        
        do {
            System.out.printf("%d%n", num);
            num--;
        } while (num > 0);
    }
}
