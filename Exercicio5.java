import java.util.Scanner;

/**
 * 2.Verificar Mês do Ano: Escreva um programa em Java que peça ao usuário que
 * digite um número de 1 a 12, representando os meses do ano. Utilize a estrutura de
 * decisão switch-case para verificar o número digitado e exibir na tela o mês
 *correspondente.
 */

public class Exercicio5 {
    
    public static void main(String[] args) {
        
        int mes;
        
        System.out.println("Este programa mostra o mês de acordo "
                + "com um número de 1 a 12.");
        Scanner scannerMes = new Scanner(System.in);
        System.out.print("Informe um número de 1 a 12: ");
        mes = scannerMes.nextInt();
        
        switch (mes) {
            case 1:
                System.out.println("O número 1 corresponde à Janeiro.");
                break;
            case 2:
                System.out.println("O número 2 corresponde à Fevereiro");
                break;
            case 3:
                System.out.println("O número 3 corresponde à Março.");
                break;
            case 4:
                System.out.println("O número 5 corresponde à Abril.");
                break;
            case 5:
                System.out.println("O número 5 corresponde à Maio.");
                break;
            case 6:
                System.out.println("O número 6 corresponde à Junho.");
                break;
            case 7:
                System.out.println("O número 7 corresponde à Julho.");
                break;
            case 8:
                System.out.println("O número 8 corresponde à Agosto.");
                break;
            case 9:
                System.out.println("O número 9 corresponde à Setembro.");
                break;
            case 10:
                System.out.println("O número 10 corresponde à Outubro.");
                break;
            case 11:
                System.out.println("O número 11 corresponde à Novembro.");
                break;
            case 12:
                System.out.println("O número 12 corresponde à Dezembro.");
                break;
            default:
                System.out.println("Opção inválida! Digite um "
                        + "número de 1 a 12.");
        }
    }
}
