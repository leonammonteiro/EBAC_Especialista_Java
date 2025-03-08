package br.com.mod11;

import java.util.ArrayList;
import java.util.List;

public class Lista1 {

    private List<String> lista = new ArrayList<String>();


    public void adicionarItemNaLista(String item){
        lista.add(item);
    }

    public void ordenarLista(){
        lista.sort(String.CASE_INSENSITIVE_ORDER);

    }

    public void limparLista(){
        lista.clear();
    }

    public List<String> getLista(){
        return lista;
    }


}


