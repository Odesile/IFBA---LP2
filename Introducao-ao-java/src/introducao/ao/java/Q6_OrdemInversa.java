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
public class Q6_OrdemInversa {
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        int[] sequencia = new int[10];
        
        System.out.println("Insira 10 valores inteiros ao vetor: ");
        for (int i = 0; i < 10; i++) {
            sequencia[i] = s1.nextInt();
        }
        
        System.out.println("Ordem decrescente:\n");
        for (int i = 9; i > 0; i--) {
            System.out.println(sequencia[i]);
        }
    }
}
