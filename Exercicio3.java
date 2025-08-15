import java.util.Scanner;

/**
 * 3. Cálculo de Bônus Salarial: Escreva um programa em Java que solicita 
 * ao usuário que digite o valor do salário mensal. O programa deve calcular 
 * o bônus salarial de acordo com a seguinte regra: se o salário 
 * for menor ou igual a R$ 1000, o bônus será de 10% do salário; 
 * caso contrário, o bônus será de 5% do salário. Em seguida, exiba 
 * o valor do bônus na tela.
*/

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        float bonus, salario;
        
        System.out.println("Este programa dira o seu salário + o bônus!");
        Scanner scannerSala = new Scanner(System.in);
        System.out.print("Informe seu salários em R$: ");
        salario = scannerSala.nextFloat();
        
        if (salario > 1000.00) {
            bonus = (float) (salario * 1.05);
        } else {
            bonus = (float) (salario * 1.1);
        }
        
        System.out.printf("O seu salário foi de R$%.2f "
                    + "para R$%.2f%n", salario, bonus);
    }
}
