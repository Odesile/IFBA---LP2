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
public class Q9_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar um vetor para armazenar as idades
        int[] idades = new int[10];

        // Ler as idades das 10 pessoas
        System.out.println("Digite as idades das 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            idades[i] = scanner.nextInt();
        }

        // Encontrar a maior idade
        int maiorIdade = idades[0];
        for (int i = 1; i < 10; i++) {
            if (idades[i] > maiorIdade) {
                maiorIdade = idades[i];
            }
        }

        // Calcular a média das idades
        int somaIdades = 0;
        for (int i = 0; i < 10; i++) {
            somaIdades += idades[i];
        }
        double mediaIdades = (double) somaIdades / 10;

        // Encontrar a menor idade
        int menorIdade = idades[0];
        for (int i = 1; i < 10; i++) {
            if (idades[i] < menorIdade) {
                menorIdade = idades[i];
            }
        }

        // Exibir os resultados
        System.out.println("A maior idade é: " + maiorIdade);
        System.out.println("A média das idades é: " + mediaIdades);
        System.out.println("A menor idade é: " + menorIdade);

        scanner.close();
    }
}
