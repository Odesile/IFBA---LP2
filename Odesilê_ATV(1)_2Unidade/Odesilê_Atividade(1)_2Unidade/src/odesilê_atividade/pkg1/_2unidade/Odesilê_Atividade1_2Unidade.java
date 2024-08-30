/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odesilê_atividade.pkg1._2unidade;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Odesilê_Atividade1_2Unidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaração de variáveis
        Scanner s1 = new Scanner(System.in);
        int tam;
        
        //Gravando o nome dos alunos
        System.out.println("Quantos alunos tem? ");
        tam = s1.nextInt();
        String alunos[] = new String[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("\nInsira o nome do aluno: ");
            alunos[i] = s1.next();
        }
        
        //Gravando a nota dos alunos
        float notas[] = new float[tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("\nInsira a nota do aluno: ");
            notas[i] = s1.nextFloat();
        }
        
        //Lendo as notas e fazendo a média
        float notas_acumuladas = 0;
        float media = 0;
        for (int i = 0; i < tam; i++) {
            notas_acumuladas += notas[i];
            
        }
        media = notas_acumuladas/tam;
        //Imprimindo a média dos alunos
        System.out.println("A média das notas dos alunos é: " + media+"\n");
        
        for (int i = 0; i < tam; i++) {
            if (notas[i] < media) {
                System.out.println("O aluno "+ alunos[i]+ " ficou abaixo da média, com a nota: "+notas[i]);
            }
        }
        
    }
    
}
