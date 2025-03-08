package br.com.mod10;
import java.util.List;
import java.util.Scanner;

/**
 * @author leonammonteiro
 */
public class Programa {

    static Scanner s = new Scanner(System.in);
    static CalcularMedia calcMedia = new CalcularMedia();

    public static void main(String[] args) {
        input();
        calcMedia.mediaFinal();
        resultado(calcMedia.getMedia());
        System.out.println(calcMedia.toString());
        s.close();
    }

    public static void input(){
        System.out.println("Olá, por favor insira as notas do aluno");
        System.out.println("Nota 1");
        double nota1 = s.nextDouble();
        calcMedia.setNota1(nota1);
        System.out.println("Nota 2");
        double nota2 = s.nextDouble();
        calcMedia.setNota2(nota2);
        System.out.println("Nota 3");
        double nota3 = s.nextDouble();
        calcMedia.setNota3(nota3);
        System.out.println("Nota 4");
        double nota4 = s.nextDouble();
        calcMedia.setNota4(nota4);
    }


    public static void resultado(double media){
        if(media >= 7){
            System.out.println("Você está aprovado!");
        } else if (media >= 5 && media<7){
            System.out.println("Você está de recuperação!");
        }else{
            System.out.println("Você está reprovado!");
        }
    }
}
