public class Produto {
    
    private double precos;
    private int quantidades;
    public String nomes;
        
    public Produto(double precos, int quantidades, String nomes){
        this.precos = precos;
        this.quantidades = quantidades;
        this.nomes = nomes;
    }
    
    public double getPrecos() {
        return this.precos;
    }
    
    public int getQuantidades() {
        return this.quantidades;
    }
    
    public String getNomes() {
        return nomes;
    }
    
    public void exibirProduto() {
        System.out.printf("Nome: %s%nPreço: %.2f%nQuantidade: %d%n", 
                getNomes(), getPrecos(), getQuantidades());
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class BichinBichin {
    ArrayList<Produto> produtos = new ArrayList<>();
        
    public void menuProdutos(String nome, double preco, int quantidade) {
        Produto produto = new Produto(preco, quantidade, nome);
        produtos.add(produto);
    }
    
    public void exibirProdutos() {
        double total = 0;
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            System.out.println("Lista de produtos");
            for (Produto produto : produtos) {
                produto.exibirProduto();
            }
            for (Produto produto : produtos) {
                total += produto.getPrecos() * produto.getQuantidades();
            }
            System.out.printf("Valor total do estoque: %.2f", total);
        }
    }
}

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BichinBichin app = new BichinBichin();
        Scanner scanner = new Scanner(System.in);
        
        String nome;
        double preco;
        int quantidade;
        
        while(true) {
            System.out.println("1. Adicione um produto.");
            System.out.println("2. Exibir produtos.");
            System.out.println("3. Sair");
            System.out.print("Digite uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    nome = scanner.nextLine();
                    
                    System.out.println("Digite o preço do produto: ");
                    preco = scanner.nextDouble();
                    
                    System.out.println("Digite a quantidade do produto: ");
                    quantidade = scanner.nextInt();
                    scanner.nextLine();
                    
                    app.menuProdutos(nome, preco, quantidade);
                    break;
                case 2:
                    app.exibirProdutos();
                    break;
                case 3:
                    System.out.println("Saindo.");
                    return;
                default:
                    System.out.println("opção inválida!");
            }
        }
    }
}
