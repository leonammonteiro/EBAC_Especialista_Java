package br.com.mod11;
import java.util.Scanner;

/**
 * @author leonammonteiro
 */
public class Main {

    static Lista1 lista1 = new Lista1();
    static Lista2 lista2 = new Lista2();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        boolean continuar = true;



        do {
            chamarAtividade1();

            System.out.println();

            chamarAtividade2();

            boolean iVal = true;

            while(iVal) {
               System.out.println("O que você deseja fazer agora?" +
                       "\n1- REINICIAR ATIVIDADE" +
                       "\n0- ENCERRAR ATIVIDADE");


               if(scanner.hasNextInt()){
                   int escolha = scanner.nextInt();
                   scanner.nextLine();
                   switch (escolha) {
                       case 1:
                           System.out.println("Opção escolhida: \"1- REINICIAR ATIVIDADE\"");
                           iVal = false;
                           break;
                       case 0:
                           System.out.println("Opção escolhida: \"0- ENCERRAR ATIVIDADE\"");
                           iVal = false;
                           continuar = false;
                           break;
                       default:
                           System.out.println("*** \"" + escolha + "\" não é uma opção válida, tente novamente.");
                   }
               }else{
                   System.out.println("*** Ops, você inseriu uma alternativa inválida, tente novamente.");
               }
               System.out.println();

           }
        }while(continuar);

        scanner.close();
    }

    public static void chamarAtividade1(){
        System.out.println("===== ATIVIDADE PARTE 1 =====" +
                "\nInsira os nomes separados por vírgula");
        String input1 = scanner.nextLine();
        manipularInput1(input1);
        lista1.ordenarLista();

        System.out.println();
        System.out.println("Segue abaixo a lista ordenada dos nomes acima" +
                "\n" + lista1.getLista());
        lista1.limparLista();
    }



    public static void manipularInput1(String input1){
        String[] inputSplit = input1.split(",");
        for (String item : inputSplit){
            lista1.adicionarItemNaLista(item.trim());
        }
    }

    public static void chamarAtividade2(){
        System.out.println("===== ATIVIDADE PARTE 2 =====" +
                "\nInsira os nomes, indicando o gênero do indivíduo. Ex: Matheus-M, Aline-F");
        String input2 = scanner.nextLine();
        manipularInput2(input2);
        lista2.ordenarLista();
        System.out.println();
        lista2.separarListas();
        lista2.mostrarListas();
        lista2.limparListas();
        System.out.println();
    }



    public static void manipularInput2(String input2){
        String[] inputSplit = input2.split(",");
        for (String item : inputSplit){
            lista2.adicionarItemLista(item.trim());
        }
    }
}
