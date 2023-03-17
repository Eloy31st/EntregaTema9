package Ejercicio2;

public class Español implements Traduccion {
    @Override
    public void introducirDistancia() {
        System.out.println("Introduzca la distancia en kilometros:");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Introduzca el tiempo en minutos:");
    }

    @Override
    public void inicioRespuesta() {
        System.out.print("La velocidad es de ");
    }

    @Override
    public void finRespuesta() {
        System.out.print(" km/h");
    }
}

