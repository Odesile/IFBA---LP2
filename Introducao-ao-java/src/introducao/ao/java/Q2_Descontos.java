/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao.ao.java;

import java.util.Scanner;

/**
 *
 * @author drago
 */
public class Q2_Descontos {
    public static void main(String[] args) {
         
        Scanner s1 = new Scanner(System.in);

        float quantidade_livros;
        System.out.println ("Digite aqui sua quantidade de livros: ");
        quantidade_livros = s1.nextFloat();

        float desconto1 = (float) (0.25 * quantidade_livros + 7.50);
        float desconto2 = (float) (0.5 * quantidade_livros + 2.50);

        if (desconto1 > desconto2) {
            System.out.println("O desconto 1 nesse caso é a melhor opção!!");
        }else if (desconto2 > desconto1){
            System.out.println("O desconto 2 nesse caso é a melhor opção!!");
        }else{
            System.out.println("Qualquer um dos desconto irá suprir sua necessidade!!");
        }
        

    }
}
