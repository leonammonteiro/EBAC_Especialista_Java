package br.com.leonam.model;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String toString() {
        return "=== Pessoa Jurídica cadastrada ===" +
                "\nNome: " + this.getNome() +
                "\nEndereco: " + this.getEndereco() +
                "\nCNPJ: " + cnpj;
    }
}
