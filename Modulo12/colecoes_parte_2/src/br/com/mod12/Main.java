package br.com.mod12;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Lista lista = new Lista();

    public static void main(String[] args) {
        userView();
        scanner.close();

    }

    public static void userView(){

        boolean loop1 = true;
        boolean loop2 = true;
        boolean loop3 = false;
        boolean loop4 = true;

        do {

            while (loop2) {
                System.out.println("Insira uma opção:\n" +
                        "1 - Registrar indivíduo Masculino - M\n" +
                        "2 - Registrar indivíduo Feminino - F\n" +
                        "0 - Encerrar programa");
                int genero = scanner.nextInt();
                scanner.nextLine();
                if (genero == 0){
                    System.out.println("Até a próxima!");
                    loop2 = false;
                    loop3 = false;
                    loop4 = false;
                    loop1 = false;
                }else{
                    System.out.println("Insira o nome da pessoa");
                    String nome = scanner.nextLine();

                    switch (genero) {
                        case 1:
                            lista.adicionarListaMasc(nome);
                            loop2 = false;
                            loop3 = true;
                            break;
                        case 2:
                            lista.adicionarListaFem(nome);
                            loop2 = false;
                            loop3 = true;
                            break;
                        default:
                            System.out.println("Opcao inválida");
                    }
                }


            }

            loop2 = true;

            while (loop3) {
                System.out.println("Deseja registrar outra pessoa?\n" +
                        "1 - Sim\n" +
                        "2 - Não");
                int repetir = scanner.nextInt();
                scanner.nextLine();

                if (repetir == 1) {
                    loop3 = false;
                    loop4 = false;
                } else if (repetir == 2) {
                    loop3 = false;
                    loop4 = true;
                }else{
                    System.out.println("opcao invalida");
                }
            }

            while (loop4){
                System.out.println("Deseja visualizar as listas separadas por gênero?\n" +
                        "1 - Sim\n" +
                        "2 - Não");
                int visualizar = scanner.nextInt();
                scanner.nextLine();

                if (visualizar == 1) {
                    lista.visualizarListas();
                    lista.limparListas();
                    System.out.println("Todos os registros foram limpos, recomece ou encerre o programa!");
                    loop4 = false;
                } else if (visualizar == 2) {
                    lista.limparListas();
                    System.out.println("Todos os registros foram limpos,  recomece ou encerre o programa!");
                    loop4 = false;
                }else{
                    System.out.println("opcao invalida");
                }

            }

            System.out.println();

        }while (loop1);
    }
}
