package Ejercicio2;

import java.util.Scanner;
public class Main {
    private static double distancia, tiempo, velocidad;
    public static double calculo(){
        tiempo = tiempo / 60;
        return velocidad = distancia / tiempo;
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        int idioma;
        System.out.println("Introduzca el idioma: \n1. Español \n2. Ingles \n3. Ruso \n4. Portugues");
        idioma = sc.nextInt();
        Traduccion traduccion;
        switch (idioma) {
            case 1:
                traduccion = new Español();
                traduccion.introducirDistancia();
                distancia = sc.nextDouble();
                traduccion.introducirTiempo();
                tiempo = sc.nextDouble();
                traduccion.inicioRespuesta();
                System.out.print(calculo());
                traduccion.finRespuesta();
                break;
            case 2:
                traduccion = new Ingles();
                traduccion.introducirDistancia();
                distancia = sc.nextDouble();
                traduccion.introducirTiempo();
                tiempo = sc.nextDouble();
                traduccion.inicioRespuesta();
                System.out.print(calculo());
                traduccion.finRespuesta();
                break;
            case 3:
                traduccion = new Ruso();
                traduccion.introducirDistancia();
                distancia = sc.nextDouble();
                traduccion.introducirTiempo();
                tiempo = sc.nextDouble();
                traduccion.inicioRespuesta();
                System.out.print(calculo());
                traduccion.finRespuesta();
                break;
            case 4:
                traduccion = new Portugues();
                traduccion.introducirDistancia();
                distancia = sc.nextDouble();
                traduccion.introducirTiempo();
                tiempo = sc.nextDouble();
                traduccion.inicioRespuesta();
                System.out.print(calculo());
                traduccion.finRespuesta();
                break;
            default:
                System.out.println("Idioma no soportado");
                break;
        }
    }
    public static void main(String[] args) {
        menu();
    }
}
