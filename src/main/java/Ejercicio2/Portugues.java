package Ejercicio2;

public class Portugues implements Traduccion {
    @Override
    public void introducirDistancia() {
        System.out.println("Introduza a distância em quilômetros:");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Introduza o tempo em minutos:");
    }

    @Override
    public void inicioRespuesta() {
        System.out.print("A velocidade é ");
    }

    @Override
    public void finRespuesta() {
        System.out.print(" km/h");
    }
}

