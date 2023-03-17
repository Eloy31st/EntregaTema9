package Ejercicio1;

import java.time.LocalDate;

public abstract class Bici {
    protected String marca, modelo;
    protected LocalDate fechaCompra;

    public Bici(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }
    public int añosCompra(){
        int años = LocalDate.now().getYear() - fechaCompra.getYear();
        return años;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + "("+añosCompra()+" años)";

    }
}
