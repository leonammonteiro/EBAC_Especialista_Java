package br.com.mod10;

/**
 * @author leonammonteiro
 */
public class CalcularMedia {

    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;
    private Double media;

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }

    public void mediaFinal(){
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("Sua média foi: " + media);
    }

    public Double getMedia(){
        return media;
    }

    @Override
    public String toString() {
        return "CalcularMedia{" +
                "nota1= \"" + nota1 +
                "\", nota2= \"" + nota2 +
                "\", nota3=\"" + nota3 +
                ", nota4= \"" + nota4 +
                "\", media= \"" + media + "\"" +
                '}'; //é permitido aspas simples, pq é somente um caractere
    }
}
