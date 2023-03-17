package Ejercicio1;

import java.time.LocalDate;

public class Bicicleta extends Bici{
    private int velocidades;



    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int velocidades) {
        super(marca, modelo, fechaCompra);
        this.velocidades = velocidades;
    }

    @Override
    public String toString() {
        return "-Bicicleta " + super.toString() + " " + velocidades + "velocidades\t   4,90€/hora\n";
    }
}
