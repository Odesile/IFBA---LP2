/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao.ao.java;


import java.time.LocalDate;
import java.util.Scanner;
/**
 *
 * @author drago
 */
public class Q3_horarios {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados
        System.out.println("Digite as horas, minutos e segundos do primeiro intervalo:");
        int horas1 = scanner.nextInt();
        int minutos1 = scanner.nextInt();
        int segundos1 = scanner.nextInt();

        System.out.println("Digite as horas, minutos e segundos do segundo intervalo:");
        int horas2 = scanner.nextInt();
        int minutos2 = scanner.nextInt();
        int segundos2 = scanner.nextInt();

        // Cálculo da soma
        int segundosSoma = segundos1 + segundos2;
        int minutosSoma = minutos1 + minutos2 + segundosSoma / 60;
        int horasSoma = horas1 + horas2 + minutosSoma / 60;
        segundosSoma %= 60;
        minutosSoma %= 60;

        // Cálculo da diferença
        int segundosDiferenca = segundos1 - segundos2;
        int minutosDiferenca = minutos1 - minutos2 + segundosDiferenca / 60;
        int horasDiferenca = horas1 - horas2 + minutosDiferenca / 60;
        segundosDiferenca %= 60;
        minutosDiferenca %= 60;

        // Saída dos resultados
        System.out.println("Soma dos intervalos:");
        System.out.println(horasSoma + " horas, " + minutosSoma + " minutos, " + segundosSoma + " segundos");

        System.out.println("Diferença dos intervalos:");
        System.out.println(horasDiferenca + " horas, " + minutosDiferenca + " minutos, " + segundosDiferenca + " segundos");

    }
}