import java.util.Scanner;

/**
 * 1.Contagem Crescente: Escreva um programa em Java que solicita ao usuário um
 * número inteiro positivo. Em seguida, utilize uma estrutura de repetição 
 * while para exibir uma contagem crescente a partir de 1 até o número informado
 * pelo usuário.
 */

public class Exercicio7 {
    public static void main(String[] args) {
        
        int num;
        int contador = 1;
        
        System.out.println("Este programa conta de 1 até o numero informado "
                + "em ordem crescente");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro e positivo: ");
        num = scanner.nextInt();
        
        while (contador <= num) {
            System.out.printf("%d%n", contador);
            contador ++;
        }
    }
}
