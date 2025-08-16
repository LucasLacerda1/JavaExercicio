import java.util.Scanner;

/**
 * 1.Tabuada de MultiplicaÃ§Ã£o: Escreva um programa em Java que solicita ao 
 * usuÃ¡rio um nÃºmero inteiro. Utilize uma estrutura de repetiÃ§Ã£o for 
 * para exibir a tabuada de multiplicaÃ§Ã£o desse nÃºmero, de 1 a 10.
 */

public class Exercicio13 {
    public static void main(String[] args) {
        
        int i,tabuada, num;
        
        System.out.println("Este programa irÃ¡ gerar uma tabuada de 1 a 10 "
                + "do nÃºmero informado pelo usuÃ¡rio.");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um nÃºmero: ");
        num = scanner.nextInt();
        
        for (i = 1 ; i <= 10; i++) {
            tabuada = num * i;
            System.out.printf("%d x %d = %d%n", num, i, tabuada);
        }
    }
}
