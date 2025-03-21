package br.com.leonam.model;

public class PessoaFisica extends Pessoa{

    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "=== Pessoa Física Cadastrada ===" +
                "\nNome: " + this.getNome() +
                "\nEndereco: " + this.getEndereco() +
                "\nCPF: " + cpf;
    }
}
