import java.util.Scanner;

/**
 * 2.Soma de Números Inteiros: Escreva um programa em Java que solicita 
 * ao usuário que digite uma sequência de números inteiros. Utilize uma 
 * estrutura de repetição while para ler os números até que seja 
 * digitado um número negativo. Em seguida, exiba a soma dos números 
 * inteiros digitados (não incluindo o número negativo).
 */
public class Exercicio8 {
    public static void main(String[] args) {
        
        int num = 0;
        
        int soma = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Este programa irá rodar até o usuário "
                + "digitar um número negativo. No final irá mostrar "
                + "a soma do(s) número(s).");
        
        while (true) {
            System.out.print("Informe um número: ");
            num = scanner.nextInt();
            
            if (num < 0) {
                break;
            }
            soma += num;
        }
        
        System.out.printf("A soma dos número informados é: %d%n", soma);
        
    }
}
