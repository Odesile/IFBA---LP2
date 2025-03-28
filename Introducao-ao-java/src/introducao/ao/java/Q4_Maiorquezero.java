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
public class Q4_Maiorquezero {
    public static void main(String[] args) {
        
        Scanner s1 = new Scanner(System.in);
        int number=0;
        int char_numbers;
        System.out.println("Digite um número inteiro: ");
        number = s1.nextInt();
        String str_number = String.valueOf(number);
        
        if (number >= 0) {
            char_numbers = str_number.length();
            System.out.println("Seu número é : "+number+" e contem "+char_numbers+ " digitos!");
        }else{
            System.out.println("Digite um número positivo, por favor!");
        }
    }
}
