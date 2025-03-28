/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introducao.ao.java;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author drago
 */
public class Q7_ConsultaTelefones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> agenda = new HashMap<>();

        System.out.print("Quantos contatos você deseja adicionar? ");
        int quantidadeContatos = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < quantidadeContatos; i++) {
            System.out.print("Digite o nome do contato " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite o telefone do contato " + (i + 1) + ": ");
            String telefone = scanner.nextLine();
            agenda.put(nome, telefone);
        }

        System.out.print("Digite o nome do contato que você deseja consultar: ");
        String nomeConsulta = scanner.nextLine();

        if (agenda.containsKey(nomeConsulta)) {
            System.out.println("O telefone de " + nomeConsulta + " é: " + agenda.get(nomeConsulta));
        } else {
            System.out.println("O nome " + nomeConsulta + " não foi encontrado na agenda.");
        }

        scanner.close();
    }
}
