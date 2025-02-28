package br.com.mod10;
import java.util.Scanner;

/**
 * @author leonammonteiro
 */
public class Programa {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CalcularMedia calcMedia = new CalcularMedia();

        System.out.println("Olá, por favor insira as notas do aluno");
        System.out.println("Nota 1");
        double nota1 = s.nextInt();
        calcMedia.setNota1(nota1);
        System.out.println("Nota 2");
        double nota2 = s.nextInt();
        calcMedia.setNota2(nota2);
        System.out.println("Nota 3");
        double nota3 = s.nextInt();
        calcMedia.setNota3(nota3);
        System.out.println("Nota 4");
        double nota4 = s.nextInt();
        calcMedia.setNota4(nota4);

        calcMedia.mediaFinal();
        resultado(calcMedia.getMedia());

        s.close();
    }

    public static void resultado(double media){
        if(media >= 7){
            System.out.println("Você está aprovado!");
        } else if (media >= 5 && media <7){
            System.out.println("Você está de recuperação!");
        }else{
            System.out.println("Você está reprovado!");
        }
    }
}
