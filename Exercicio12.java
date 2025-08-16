import java.util.Scanner;
import java.util.Random;

/**
 * 3.Jogo da Adivinhação: Escreva um programa em Java que gera um número
 * aleatório entre 1 e 100 (inclusive) e solicita ao usuário que tente 
 * adivinhar o número. Utilize uma estrutura de repetição do-while para permitir 
 * várias tentativas até que o usuário acerte o número. Forneça dicas 
 * ao usuário se o número digitado é maior ou menor que o número aleatório.
 */

public class Exercicio12 {
    public static void main(String[] args) {
        
        int num, random;
        
        Scanner scanner = new Scanner(System.in);
        
        Random randomNum = new Random();
        random = randomNum.nextInt(100) + 1;
        
        System.out.println("Você vai ter que acertar um número "
                + "aleatório que este programa gerar.");
        
        System.out.printf("Número: %d%n", random);
        
        do {
            System.out.print("Informe um número: ");
            num = scanner.nextInt();
            
            if (num < random) {
                System.out.printf("%d é menor que o número gerado%n", num);
            } else if (num > random) {
                System.out.printf("%d é maior que o número gerado%n", num);
            }
        } while(num != random);
        
        System.out.printf("Você acertou! O número é: %d%n", random);
    }
}
