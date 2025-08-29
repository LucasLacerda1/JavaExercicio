import java.util.Scanner;

public class Informacoes {
    
    public static String[] perguntarNome(){
        
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[5];
        
        for (int i = 0; i < 5; i++){
            System.out.print("Informe o seu nome: ");
            nome[i] = scanner.nextLine();
            }
        
        return nome;
        }
    
    public static int[] perguntarIdade(){
        int[] idade = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++){
            System.out.print("Informe sua idade:");
            idade[i]  = scanner.nextInt();
        }
        return idade;
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
        
        int maiorIdade = idade[0];
        
        for(int i = 1; i < idade.length; i++){
            if(idade[i] > 17){
                maiorIdade ++;
            }
        }
        
        return maiorIdade;
    }
}

package com.mycompany.kihkugosthoso;

public class Pessoa {

    public static void main(String[] args){
        
        String[] nomes = Informacoes.perguntarNome();
        
        int[] idades = Informacoes.perguntarIdade();
        
        float mediaIdade = Informacoes.calcularMedia(idades);
        
        int idadeMaior = Informacoes.idadeMaior(idades);
        
        int idadeMenor = Informacoes.idadeMenor(idades);
        
        int maiorIdade = Informacoes.maiorIdade(idades);
        
        int indice = 0;
        
        for(String nome : nomes){
            System.out.println(nome);
        }
        
        for(int idade : idades){
            System.out.println(idade);}
        
        for(int i = 0; i <idades.length; i++){
            if(idades[i] == maiorIdade){
                indice = i;
                break;
            }
        }
        
        System.out.println("A pessoa com a maior idade é: " 
                + nomes[indice] + ", com" 
                + maiorIdade + "anos.");
        }
    }
