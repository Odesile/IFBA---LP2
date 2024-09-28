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
public class Atividade2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int tam;
        
        
        System.out.println("Quantos nomes gostaria de cadastrar?");
        tam = s1.nextInt();
        
        String nomes[] = new String[tam];
        String nome_escolhido;
        int flag = 0;
        int telefones[] = new int[tam];
        
        if (tam > 0) {
            //Cadastrando nomes
            System.out.println("Insira o nome e logo em seguida o telefone desta mesma pessoa(somente número)");
            for (int i = 0; i < tam; i++) {
                nomes[i] = s1.next().toLowerCase();
                telefones[i] = s1.nextInt();
            }
            
            //Consultando os telefones
            System.out.println("Escolha um nome para consultar: ");
            nome_escolhido = s1.next();
            for (int i = 0; i < tam; i++) {
                if (nome_escolhido.equals(nomes[i])) {
                    System.out.println("O nome escolhido foi "+nome_escolhido+" e tem o número "+telefones[i]);
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println("Infelizmente não achamos cadastro de número vinculado a este nome!");
                flag = 0;
            }
            
        }else{
            System.out.println("Insira um valor válido");
        }
        
    }
}
