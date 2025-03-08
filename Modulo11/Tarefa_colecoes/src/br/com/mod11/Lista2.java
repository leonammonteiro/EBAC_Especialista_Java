package br.com.mod11;

import java.util.ArrayList;
import java.util.List;

public class Lista2 {

    private List<String> lista2 = new ArrayList<>();
    private List<String> listaHomens = new ArrayList<>();
    private List<String> listaMulheres = new ArrayList<>();
    private List<String> listaIndigentes = new ArrayList<>();

    public void adicionarItemLista(String item){
        lista2.add(item);
    }

    public void ordenarLista(){
        lista2.sort(String.CASE_INSENSITIVE_ORDER);

    }

    /**
     * Separa e reagrupa em novas listas de indivíduos de mesmo gênero
     */
    public void separarListas(){
        for(String item : lista2){
            String itemUpper = item.toUpperCase();

            /**
             * Busca os caracteres que definem o genero de cada indivíduo
             */
            boolean contemM = itemUpper.contains("-M");
            boolean contemF = itemUpper.contains("-F");
            int posPont;

            if (contemM){
                posPont = itemUpper.indexOf("-M");
                listaHomens.add(item.substring(0,posPont).trim());
            }else if(contemF){
                posPont = itemUpper.indexOf("-F");
                listaMulheres.add(item.substring(0,posPont).trim());
            }else{
                listaIndigentes.add(item);
            }
        }
    }


    public void mostrarListas(){
        System.out.println("Lista de Homens (-M): " + listaHomens);
        System.out.println("Lista de Mulheres (-F): " +listaMulheres);
        System.out.println("Indíduos não identificados: " + listaIndigentes);
    }

    public void limparListas(){
        lista2.clear();
        listaHomens.clear();
        listaMulheres.clear();
        listaIndigentes.clear();
    }
}
