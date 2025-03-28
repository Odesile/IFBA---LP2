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
public class Q5_SalariosVetor {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        float[] salarios = new float[5];
        float reajuste=0;
        float[] salarios_sr = new float[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o salário "+i+": ");
            salarios[i] = s1.nextFloat();
        }
        
        System.out.println("Digite o reajuste salarial (Sem porcentagem): ");
        reajuste = s1.nextFloat() / 100;
        
        for (int i = 0; i < 5; i++) {
            salarios_sr[i] = salarios[i];
            salarios[i] = salarios[i] + salarios[i]*reajuste;
        }
        
        System.out.println("Salários antes do reajuste:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(salarios_sr[i]);
        }
        
        System.out.println("Salários depois do reajuste:\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(salarios[i]);
        }
        
    }
}
