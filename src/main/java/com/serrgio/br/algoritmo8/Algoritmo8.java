package com.serrgio.br.algoritmo8;

/**
 * Propriedade 153
 */
public class Algoritmo8 {
    /**
     * Propriedade 153.
     * 
     * @param n
     * @return 
     */
    public boolean Propriedade153(int n) {
        if(n < 0 || n > 999){
            throw new IllegalArgumentException("o valor de n tem de ser maior ou igual a 0 e menor ou igual a 999");
        }
        
        int i = (n / 100);
        int j = ((n -(100*i)) / 10);        
        int k = (n % 10);
        
        return ((i * i * i) + (j * j * j) + (k * k * k)) == n;           
    }
}
