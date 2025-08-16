import java.util.Scanner;

/**
 * 3.Soma de Números Pares: Escreva um programa em Java que utiliza 
 * uma estrutura de repetição for para somar todos os números pares de 1 a 100. 
 * Em seguida, exiba o resultado da soma.
 */

public class Exercicio15 {
    public static void main(String[] args) {
        
        int num;
        int soma = 0;
        
        for (num = 2; num <= 100; num += 2) {
            soma += num;
        }
        
        System.out.printf("A soma de todos os números pares "
                + "de 1 a 100 é :%d", soma);
        
    }
}
