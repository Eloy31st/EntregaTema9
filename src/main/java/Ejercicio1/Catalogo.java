package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {
    private ArrayList<Bici> bicis;

    public Catalogo() {
        this.bicis = new ArrayList<Bici>();
    }

    public void mostrarCatalogo(){
        for(int i = 0; i < bicis.size(); i++){
            System.out.println(bicis.get(i));
        }
    }

    public void añadirBici(Bici bici){
        bicis.add(bici);
    }

}
