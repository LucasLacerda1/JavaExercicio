package com.mycompany.bahrratha;

import java.util.Random;

public class Bahrratha {

    private int populacao;
    
    public Bahrratha() {
        
        Random random = new Random();
        
        this.populacao = random.nextInt(200);
    }
    
    public int aumentaBarata() {
        
        float crescer = (float) (this.populacao * 0.10);
        
        this.populacao += (int) crescer;
        
        return this.populacao;
    }
    
    public int spray() {
        
        float pulverizar = (float) (this.populacao * 0.10);
        
       this.populacao -= (int) pulverizar;
       
       return this.populacao;
    }
    
    public int getNumeroBarata() {
        return this.populacao;
    }
}


package com.mycompany.bahrratha;

public class Cozinha {
    
    private Bahrratha bahrratha;
    
    public Cozinha() {
        this.bahrratha = new Bahrratha();
    }
    
    public int aumentaBarataCozinha() {
        this.bahrratha.aumentaBarata();
        
        return this.bahrratha.aumentaBarata();
    }
    
    public int sprayCozinha() {
        this.bahrratha.spray();
        
        return this.bahrratha.spray();
    }
    
    public int getNumeroBarataCozinha() {
        return this.bahrratha.getNumeroBarata();
    }
}


package com.mycompany.bahrratha;

public class Main {
    
    public static void main(String[] args) {
        
        Cozinha minhaCozinha = new Cozinha();
        
        int aumento = minhaCozinha.aumentaBarataCozinha();
        
        System.out.println("Ouve um aumento na população de baratas. "
                + "População atual: " + aumento + " baratas.");
        
        int spray = minhaCozinha.sprayCozinha();
        
        System.out.println("Foi utilizado um spray para diminuir a população. "
                + "População atual: " + spray + " baratas.");
        
        int populacaoAtual = minhaCozinha.getNumeroBarataCozinha();
        
        System.out.println("População atual: " + populacaoAtual + " baratas.");
    }
}
