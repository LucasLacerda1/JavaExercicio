import java.util.Scanner;
import java.util.Random;

/**
 * 3.Adivinhe o Número: Escreva um programa em Java que gera um número aleatório
 * entre 1 e 100 (inclusive) e solicita ao usuário que tente adivinhar o número.
 * Utilize uma estrutura de repetição while para permitir várias tentativas
 * até que o usuário acerte o número. Forneça dicas ao usuário se o número
 * digitado é maior ou menor que o número aleatório.
 */

public class Exercicio9 {
    public static void main(String[] args) {
        
        int num, random;
        
        Scanner scanner = new Scanner(System.in);
        
        Random randomNum = new Random();
        random = randomNum.nextInt(100) + 1;
        
        while (true) {
            System.out.printf("Número: %d%n", random);
            System.out.print("Tente acertar o número de 1 a 100: ");
            num = scanner.nextInt();
            
            if (num == random) {
                System.out.println("Você acertou!!");
                break;
            }
        }
    }
}
