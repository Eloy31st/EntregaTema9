package Ejercicio2;

public class Ruso implements Traduccion {
    @Override
    public void introducirDistancia() {
        System.out.println("Введите расстояние в километры:");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Введите время в минутах:");
    }

    @Override
    public void inicioRespuesta() {
        System.out.print("Скорость ");
    }

    @Override
    public void finRespuesta() {
        System.out.print(" km/h");
    }
}

