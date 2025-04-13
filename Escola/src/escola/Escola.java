package escola;

import java.util.HashSet;
import java.util.Scanner;

public class Escola {
        
    //for(int i = 0; i < 10; i++)
    
    public static void aplica_media(Aluno aluno){
        float[] nota = aluno.getNotas();
        float media =0;
        for (int i = 0; i < nota.length; i++) {
            media = media + nota[i];
        }
        media = (media + aluno.getNota_trabalho())/3;
        aluno.setMedia(media);
    }
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        float[] notas = new float[2];
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Digite a matrícula do aluno: ");
        aluno1.setMatricula(s1.nextInt());
        
        
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite as duas notas do aluno: ");
            notas[i] = s1.nextFloat();
        }
        aluno1.setNotas(notas);
        
        System.out.println("Digite a nota do trabalho do aluno: ");
        aluno1.setNota_trabalho(s1.nextFloat());
        
        aplica_media(aluno1);
        
        aluno1.mostra_media();
        aluno1.mostra_aprovacao();
    }
    
}
