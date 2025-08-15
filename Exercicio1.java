import java.util.Scanner;

/**
 * 1.Verificar Par ou Ímpar: Escreva um programa em Java que solicite ao usuário que
 * digite um número inteiro. Em seguida, o programa deve verificar se o número é par
 * ou ímpar e exibir a mensagem correspondente na tela.
*/

public class Exercicio1 {

    public static void main(String[] args) {
        
        int num;
        
        System.out.println("Esta programa dirá se o número é par ou ímpar.");
        Scanner scannerNum = new Scanner(System.in);
        System.out.print("Digite um número: ");
        num = scannerNum.nextInt();
        
        if (num % 2 == 0) {
            System.out.printf("%d é par!%n", num);
        } else {
            System.out.printf("%d é ímpar!%n", num);
        }
    }
}
