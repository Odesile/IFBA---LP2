/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao.ao.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
        
/**
 *
 * @author drago
 */
public class Q8_Conjuntos {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Digite a quantidade de números em cada conjunto: ");
       int quantidadeNumeros = scanner.nextInt();

       // Criar os conjuntos
       Set<Integer> conjunto1 = new HashSet<>();
       Set<Integer> conjunto2 = new HashSet<>();

       // Ler os números do primeiro conjunto
       System.out.println("Digite os números do primeiro conjunto:");
       for (int i = 0; i < quantidadeNumeros; i++) {
           conjunto1.add(scanner.nextInt());
       }

       // Ler os números do segundo conjunto
       System.out.println("Digite os números do segundo conjunto:");
       for (int i = 0; i < quantidadeNumeros; i++) {
           conjunto2.add(scanner.nextInt());
       }

       // Encontrar a intersecção
       conjunto1.retainAll(conjunto2);

       // Exibir a intersecção
       System.out.println("A intersecção dos conjuntos é: " + conjunto1);

       scanner.close();
   }
}
