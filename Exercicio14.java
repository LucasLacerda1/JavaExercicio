import java.util.Scanner;

/**
 * 2.Contagem Regressiva de Ano Novo: Escreva um programa em Java que exibe
 * uma contagem regressiva de 10 segundos para o Ano Novo. Utilize uma estrutura
 * de repetição for para fazer a contagem e inclua um pequeno atraso entre cada
 * segundo para que a contagem seja visível.
 */

public class Exercicio14 {
    public static void main(String[] args) {
        
        int i;
        
        for (i = 10; i >= 0; i--) {
            System.out.println(i);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Feliz ano novo!");
    }
}
