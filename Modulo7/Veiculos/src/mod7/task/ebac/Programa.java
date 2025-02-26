package mod7.task.ebac;

/**
 * @author leonammonteiro
 */
public class Programa{

    public static void main(String[] args){
        Carros carros = new Carros();
        carros.setCodigo(1);
        carros.setNome("Gol Copa");
        carros.setCor("Amarelo");
        carros.setMarca("VolksWagen");
        carros.setAnoFab(2006);
        carros.setAnoMod(2006);
        System.out.println("Código: " + carros.getCodigo() + "\nNome: " + carros.getNome() + "\nCor: " + carros.getCor() + "\nMarca: " +  carros.getMarca() + "\nAno/Modelo: " +  carros.getAnoFab() + "/" + carros.getAnoMod());
    }
}
