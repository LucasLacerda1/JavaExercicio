import java.util.Scanner;

/**
 * 3.Cálculo de Desconto: Escreva um programa em Java que solicita ao usuário 
 * que digite o código de um produto (1, 2 ou 3). Utilize a estrutura de 
 * decisão switch-case para verificar o código digitado e calcular 
 * o desconto correspondente.
 */

public class Exercicio6 {
    public static void main(String[] args) {
        
        float arroz = (float) 6.37;
        
        float feijao = (float) 5.80;
        
        float makita = (float) 748.55;
        
        float desconto;
        
        int opcao;
        
        System.out.println("Menu:");
        System.out.println("1. Arroz.");
        System.out.println("2. Feijão.");
        System.out.println("3. Makita.");
        
        Scanner scannerOpcao = new Scanner(System.in);
        System.out.print("Informe qual produto você quer um desconto: ");
        opcao = scannerOpcao.nextInt();
        
        switch (opcao) {
            case 1:
                desconto = (float) (arroz - (arroz * 0.1));
                System.out.printf("O arroz está com 10%% de desconto, "
                        + "foi de R$%.2f para R$%.2f%n", arroz, desconto);
                break;
            case 2:
                desconto = (float) (feijao - (feijao * 0.15));
                System.out.printf("O feijao está com 15%% de desconto, "
                        + "foi de R$%.2f para R$%.2f%n", feijao, desconto);
                break;
            case 3:
                desconto = (float) (makita - (makita * 0.15));
                System.out.printf("O feijao está com 5%% de desconto, "
                        + "foi de R$%.2f para R$%.2f%n", makita, desconto);
                break;
            default:
                System.out.println("Opção inválida! Escolha apenas "
                        + "uma das 3 opções");
        }
    }
}
