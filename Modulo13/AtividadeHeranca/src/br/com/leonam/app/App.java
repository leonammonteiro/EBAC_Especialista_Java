package br.com.leonam.app;

import br.com.leonam.model.Pessoa;
import br.com.leonam.model.PessoaFisica;
import br.com.leonam.model.PessoaJuridica;

import java.util.Scanner;


public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        view();
        sc.close();
    }

    private static void view(){
        System.out.println("Escolha o tipo de pessoa para cadastrar\n" +
                "1- Pessoa Física (PF)\n" +
                "2- Pessoa Jurídica (PJ)");
        int option = sc.nextInt();
        sc.nextLine();
        switch (option){
            case 1:
                incluirPF();
                break;
            case 2:
                incluirPJ();
                break;
            default:
                System.out.println("Opção inválida! Este programa possui implementações somente das exigências da atividade");
        }

    }

    private static void incluirPJ() {
        PessoaJuridica pj = new PessoaJuridica();
        askNomeAndPessoa(pj);
        System.out.println("Insira o CPF da pessoa:");
        String cnpj = sc.nextLine();
        pj.setCnpj(cnpj);
        System.out.println();
        System.out.println(pj);
    }


    private static void incluirPF(){
        PessoaFisica pf = new PessoaFisica();
        askNomeAndPessoa(pf);
        System.out.println("Insira o CPF da pessoa:");
        String cpf = sc.nextLine();
        pf.setCpf(cpf);
        System.out.println();
        System.out.println(pf);
    }

    private static Pessoa askNomeAndPessoa(Pessoa pessoa){
        System.out.println("Insira o nome da pessoa:");
        String nome = sc.nextLine();
        System.out.println("Insira o endereco da pessoa:");
        String endereco = sc.nextLine();
        pessoa.setNomeAndEndereco(nome, endereco);
        return pessoa;
    }
}
