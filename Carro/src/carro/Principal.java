package carro;

import java.util.HashSet;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int valor = 0;
        
        Carro corsinha = new Carro();
        corsinha.setCor("Bege");
        corsinha.setMarca("Chevrolet");
        corsinha.setModelo("Corsa");
        corsinha.setData("04/05/2024");
        
        
        System.out.println("Insira 1 para acelear e 0 para desacelerar: ");
        corsinha.Acelera(s1.nextInt());
        System.out.println("Insira 1 para acelear e 0 para desacelerar: ");
        corsinha.Acelera(s1.nextInt());
        System.out.println("Insira 1 para acelear e 0 para desacelerar: ");
        corsinha.Acelera(s1.nextInt());
        System.out.println(corsinha.getVelocidade());
        System.out.println("Insira 1 para acelear e 0 para desacelerar: ");
        corsinha.Acelera(s1.nextInt());
        System.out.println("Insira 1 para acelear e 0 para desacelerar: ");
        corsinha.Acelera(s1.nextInt());
        System.out.println("Insira 1 para acelear e 0 para desacelerar: ");
        corsinha.Acelera(s1.nextInt());
        System.out.println(corsinha.getVelocidade());
        corsinha.Freiar();
        System.out.println(corsinha.getVelocidade());
    }
    
}
