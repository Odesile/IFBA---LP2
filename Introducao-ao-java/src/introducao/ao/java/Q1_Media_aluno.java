/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introducao.ao.java;

import java.util.Scanner;

/**
 *
 * @author drago
 */
public class Q1_Media_aluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Definição das variáveis
        Scanner s1 = new Scanner(System.in);
        float nota = 0;
        float media;
        float recuperacao;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota: ");
            nota = nota + s1.nextFloat();
        }
        
        media = nota/3;
        
        if (media>= 7) {
            System.out.println("Parabens, aprovado!!");
        }else{
            System.out.println("Digite a nota da recuperação");
            recuperacao = s1.nextFloat();
            if (((recuperacao + nota)/2) >= 5) {
                System.out.println("Após a recuperação, você foi aprovado");
            }else{
                System.out.println("Infelizmente você foi reprovado. Boa sorte ano que vem!!");
            }
        }
        
    }
    
}
