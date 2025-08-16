import java.util.Scanner;

/**
 * 2.Verificar Maior de Idade: Escreva um programa em Java que peça ao usuário que
 * digite sua idade. Em seguida, o programa deve verificar se a idade é maior ou
 * igual a 18 anos e exibir a mensagem "Você é maior de idade" caso a condição seja
 * verdadeira, ou "Você é menor de idade" caso contrário.
*/

public class Exercicio2 {
    
    public static void main(String[] args) {
        
        int idade;
        
        System.out.println("Este programa irá verificar se você é maior de idade!");
        Scanner scannerIdade = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        idade = scannerIdade.nextInt();
        
        if (idade > 17) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
        
    }
}
