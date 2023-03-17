package Ejercicio1;

import java.time.LocalDate;

public class Giroscopio extends Bici{
    private int autonomia;

    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, int autonomia) {
        super(marca, modelo, fechaCompra);
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "-Giroscopio " + super.toString() + " " + autonomia + " km de autonomía\t   9,90€/hora\n";
    }
}
