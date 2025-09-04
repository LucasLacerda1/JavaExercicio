import java.util.Scanner;

public class Informacoes {
    
    public static void perguntarNomeEIdade(int[] idade, String[] nome){
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++){
            System.out.print("Informe o seu nome: ");
            nome[i] = scanner.nextLine();
            
            System.out.print("Informe sua idade: ");
            idade[i]  = scanner.nextInt();
            scanner.nextLine();
            }
        }
    
    public static float calcularMedia(int[] idade){
        int soma = 0;
        
        for (int contador : idade) {
            soma += contador;
        }
        
        return (float) soma / idade.length;
    }
    
    public static int idadeMaior(int[] idade){
        
        int maior = idade[0];
        
        for(int i = 1; i < idade.length; i++){
            if(idade[i] > maior){
                maior = idade[i];
            }
        }
        
        return maior;
    }
    
    public static int idadeMenor(int[] idade){
        
        int menor = idade[0];
        
        for(int i = 1; i < idade.length; i++){
            if(idade[i] < menor){
                menor = idade[i];
            }
        }
        
        return menor;
    }
    
    public static int maiorIdade(int[] idade){
        
        int maiorIdade = 0;
        
        for(int i = 0; i < idade.length; i++){
            if(idade[i] >= 18){
                maiorIdade ++;
            }
        }
        
        return maiorIdade;
    }
}


package com.mycompany.kihkugosthoso;

public class Pessoa {

    public static void main(String[] args){
        
        int[] idades = new int[5];
        int indice = 0;
        String[] nomes = new String[5];
        
        Informacoes.perguntarNomeEIdade(idades, nomes);
        float mediaIdade = Informacoes.calcularMedia(idades);
        int idadeMaior = Informacoes.idadeMaior(idades);
        int idadeMenor = Informacoes.idadeMenor(idades);
        int maiorIdade = Informacoes.maiorIdade(idades);
        
        for(int i = 0; i < idades.length; i++){
            if(idades[i] == idadeMaior){
                indice = i;
                break;
            }
        }
        
        System.out.println("**** Lista de nome ****");
        for(String nome : nomes){
            System.out.println(nome);
        }
        
        System.out.println("**** Lista de Idades ****");
        for(int idade : idades){
            System.out.println(idade);}
        
        System.out.println("Idade média: " + mediaIdade);
        System.out.println("Menor Idade: " + idadeMenor);
        System.out.println("Quantidades de maiores de idadde: " + maiorIdade);
        System.out.println("A pessoa com a maior idade é: " 
                + nomes[indice] + ", com " 
                + idadeMaior + " anos.");
        }
    }
