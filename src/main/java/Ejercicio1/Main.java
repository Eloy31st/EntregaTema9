package Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        catalogo.añadirBici(new Bicicleta("Btwin", "Lapierre", LocalDate.of(2023, 5, 2), 16));
        catalogo.añadirBici(new Bicicleta("Riju", "E-bot SLS", LocalDate.of(2019, 4, 22), 30));
        catalogo.añadirBici(new Segway("Btwin", "Rockrider 33", LocalDate.of(2022, 8, 12), 60));
        catalogo.añadirBici(new Segway("Immotion ", "V3 islis", LocalDate.of(2018, 10, 6), 25));
        catalogo.añadirBici(new Segway("Weebot ", "Echo", LocalDate.of(2023, 2, 1), 30));
        catalogo.añadirBici(new Segway("Btwin", "Rockrider 340", LocalDate.of(2019, 9, 8), 40));
        catalogo.añadirBici(new Bicicleta("Immotion ", "Rockrider 340", LocalDate.of(2022, 3, 8), 12));
        catalogo.añadirBici(new Giroscopio("Segway ", "Nine", LocalDate.of(2019, 1, 12), 45));
        catalogo.añadirBici(new Giroscopio("Segway ", "Lapierre  340", LocalDate.of(2018, 1, 6), 35));
        catalogo.añadirBici(new Bicicleta("Btwin", "Rockrider 340", LocalDate.of(2019, 6, 19), 10));
        catalogo.añadirBici(new Giroscopio("Immotion ", "SuperX", LocalDate.of(2022, 7, 28), 40));
        catalogo.añadirBici(new Bicicleta("Btwin", "Ninebot Two EX", LocalDate.of(2022, 2, 11), 21));
        catalogo.mostrarCatalogo();
    }
}
