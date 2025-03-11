package br.com.mod12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Lista {


    private List<String> listaM = new ArrayList<String>();
    private List<String> listaF = new ArrayList<String>();


    public void adicionarListaMasc(String nome){
        listaM.add(nome);
    }

    public void adicionarListaFem(String nome){
        listaF.add(nome);
    }

    public void visualizarListas() {
        System.out.println("=====================" +
                "\nLista Masculina: " + listaM + "\nLista Feminina: " + listaF +
                "\n=====================");
    }

    public void limparListas(){
        listaF.clear();
        listaM.clear();
    }
}
