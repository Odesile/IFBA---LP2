/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe_matriz.odesilê;

import java.util.Scanner;

/**
 *
 * @author drago
 */
public class Atividade1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int num_consulta;

        System.out.println("Quantos nomes deseja cadastrar? ");
        num_consulta = s1.nextInt();
        
        String nomes[] = new String[num_consulta];
        int escolha = -1;

        
        if (num_consulta > 0) {
            
            //Gravando os nomes no array
            System.out.println("Digite os nomes que deseja cadastrar respectivamente");
            for (int i = 0; i < num_consulta; i++) {
                nomes[i] = s1.next();
            }
            
            System.out.println("Qual número você gostaria de consultar? [1 - "+num_consulta+"]: ");
            escolha = s1.nextInt();
            if (escolha < 0 || escolha > num_consulta) {
                System.out.println("O valor inserido é inválido!");
            }else{
                System.out.println("O nome consultado é "+nomes[escolha-1]+" de posição "+escolha);
            }
            
        }else{
            System.out.println("Se não deseja cadastrar ninguém, desejo-lhe um ótimo dia!!");
        }
    }
}
