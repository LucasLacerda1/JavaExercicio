import java.util.Scanner;

/**
 * 2.Validação de Senha: Escreva um programa em Java que solicita ao usuário que
 * digite uma senha. Utilize uma estrutura de repetição do-while para repetir a
 * solicitação até que o usuário digite a senha correta 
 * (por exemplo, "senha123"). Se a senha estiver incorreta, o programa deve 
 * exibir uma mensagem de erro e solicitar novamente a senha.
 */

public class Exercicio11 {
    public static void main(String[] args) {
        
        String senha, senhaRep;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Crie uma senha: ");
        senha = scanner.nextLine();
        do {
            System.out.print("Informe sua senha: ");
            senhaRep = scanner.nextLine();
            
            if (!senhaRep.equals(senha)) {
                System.out.println("Senha incorreta! Tente novamente");
            }
        } while (!senhaRep.equals(senha));
        
        System.out.println("Senha correta!");
        
    }
}
