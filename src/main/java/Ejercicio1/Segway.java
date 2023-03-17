package Ejercicio1;

import java.time.LocalDate;

public class Segway extends Bici{
    private int autonomia;
    private final double AlturaMinima = 1.70;

    public Segway(String marca, String modelo, LocalDate fechaCompra, int autonomia) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "-Segway " + super.toString() + " " + autonomia + " km de autonomía (Altura mínima: " + AlturaMinima + "m)\t   18,90€/hora\n";
    }
}
