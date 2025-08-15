import java.util.Scanner;

/**
 * 1.Verificar Dia da Semana: Escreva um programa em Java que solicite ao usuário
 * que digite um número de 1 a 7, representando os dias da semana. O programa
 * deve utilizar a estrutura de decisão switch-case para verificar o número
 * digitado e exibir na tela o dia da semana correspondente.
*/

public class Exercicio4 {
    
    public static void main(String[] args) {
        
        int dia;
        
        System.out.println("Este programa irá indicar o dia da semana "
                + "de acordo com o número de 1 a 7.");
        Scanner scannerDia = new Scanner(System.in);
        System.out.print("Informe um número de 1 a 7: ");
        dia = scannerDia.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("O número 1 correponde ao Domingo.");
                break;
            case 2:
                System.out.println("O número 2 correponde à Segunda-feira.");
                break;
            case 3:
                System.out.println("O número 3 corresponde à Terça-feira.");
                break;
            case 4:
                System.out.println("O número 4 correponde à Quarta-feira.");
                break;
            case 5:
                System.out.println("O número 5 corresponde à Quinta-feira.");
                break;
            case 6:
                System.out.println("O número 6 corresponde à Sexta-feira.");
                break;
            case 7:
                System.out.println("O número 7 corresponde ao Sábado.");
                break;
            default:
                System.out.println("Opção inválida! Digite um número de 1 a 7!");
        }
    }
}
