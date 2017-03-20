package br.com.satc.atividades;

import java.text.ChoiceFormat;
import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double val,val2,res,res2,res3,res4;
        char conta;
        Scanner entrada= new Scanner (System.in);
       System.out.println("Digite um valor:");
        val = entrada.nextDouble();
       System.out.println("Digite o valor 2:");
        val2 = entrada.nextDouble();
       System.out.println("Você deseja somar(s),subtrair(n),multiplicar(m) ou dividir(d)?");
        conta = entrada.next().toUpperCase().charAt(0);
       switch (conta){
           case 'S':{
               res = val+val2;
            System.out.println("Voce escolheu somar. A soma dos valores é "+res+".");   
           break;
           } 
           case 'N':{
               res2 = val-val2;
            System.out.println("Voce escolheu subtrair. A subtração dos valores é "+res2+".");
           break;
           }
           case 'M':{
               res3 = val*val2;
            System.out.println("Voce escolheu multiplicar. A subtração dos valores é "+res3+".");
            break;
           }
           case 'D':{
               res4 = val/val2;
            System.out.println("Voce escolheu dividir. A subtração dos valores é "+res4+".");
           break;
           }
           default: {
             System.out.println("Voce nao selecionou nenhuma das operações indicadas.");  
           }
       }
        
    }
    
}
