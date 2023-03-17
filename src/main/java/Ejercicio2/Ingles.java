package Ejercicio2;

public class Ingles implements Traduccion {
    @Override
    public void introducirDistancia() {
        System.out.println("Introduce the distance in kilometers:");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Introduce the time in minutes:");
    }

    @Override
    public void inicioRespuesta() {
        System.out.print("The speed is ");
    }

    @Override
    public void finRespuesta() {
        System.out.print(" km/h");
    }
}

