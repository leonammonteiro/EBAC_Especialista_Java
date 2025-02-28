package br.com.mod9;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();
        Integer numeroWrapper = numero;
        System.out.println("Seu número wrapper é:" + numeroWrapper);

    }

}
