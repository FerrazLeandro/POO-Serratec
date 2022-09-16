package br.org.serratec.exemplos;

import br.org.serratec.interfaces.Calculo;

public class TesteCalculo {

    public static void main(String[] args) {
        
        Calculo calculo = new Calculo(){

            public int operacao(int a , int b){
                return a + b;
            }
        };

        Calculo calculo2 = (a, b) -> a + b;

        System.out.println("O resultado é: " + calculo.operacao(10,30));
        System.out.println("O resultado é: " + calculo2.operacao(20,100));
    }
    
}


