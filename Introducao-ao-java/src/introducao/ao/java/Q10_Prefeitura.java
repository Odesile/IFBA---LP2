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
public class Q10_Prefeitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de entrevistados: ");
        int quantidadeEntrevistados = scanner.nextInt();

        // Criar os vetores para armazenar os dados
        double[] salarios = new double[quantidadeEntrevistados];
        int[] numeroFilhos = new int[quantidadeEntrevistados];

        // Ler os dados dos entrevistados
        System.out.println("Digite os dados dos entrevistados (salário e número de filhos):");
        for (int i = 0; i < quantidadeEntrevistados; i++) {
            System.out.print("Salário do entrevistado " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
            System.out.print("Número de filhos do entrevistado " + (i + 1) + ": ");
            numeroFilhos[i] = scanner.nextInt();
        }

        // Chamar o procedimento para imprimir os resultados
        imprimirResultados(salarios, numeroFilhos, quantidadeEntrevistados);

        scanner.close();
    }

    // Procedimento para imprimir os resultados
    public static void imprimirResultados(double[] salarios, int[] numeroFilhos, int quantidadeEntrevistados) {
        // Calcular a média do salário
        double somaSalarios = 0;
        for (int i = 0; i < quantidadeEntrevistados; i++) {
            somaSalarios += salarios[i];
        }
        double mediaSalarios = somaSalarios / quantidadeEntrevistados;

        // Calcular a média do número de filhos
        int somaFilhos = 0;
        for (int i = 0; i < quantidadeEntrevistados; i++) {
            somaFilhos += numeroFilhos[i];
        }
        double mediaFilhos = (double) somaFilhos / quantidadeEntrevistados;

        // Encontrar o maior salário
        double maiorSalario = salarios[0];
        for (int i = 1; i < quantidadeEntrevistados; i++) {
            if (salarios[i] > maiorSalario) {
                maiorSalario = salarios[i];
            }
        }

        // Calcular o percentual de pessoas com salário até R$550,00
        int contadorSalarioBaixo = 0;
        for (int i = 0; i < quantidadeEntrevistados; i++) {
            if (salarios[i] <= 550) {
                contadorSalarioBaixo++;
            }
        }
        double percentualSalarioBaixo = (double) contadorSalarioBaixo / quantidadeEntrevistados * 100;

        // Imprimir os resultados
        System.out.println("Média do salário: R$" + mediaSalarios);
        System.out.println("Média do número de filhos: " + mediaFilhos);
        System.out.println("Maior salário: R$" + maiorSalario);
        System.out.println("Percentual de pessoas com salário até R$550,00: " + percentualSalarioBaixo + "%");
    }
}
