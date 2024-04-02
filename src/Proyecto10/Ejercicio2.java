package Proyecto10;

import java.util.Scanner;

/*
 * Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura promedio de las personas.
 * */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidadAlturas, contador = 1, copia;
        float altura, suma = 0, promedio = 0;
        System.out.println("Ingrese la cantidad de alturas a registrar.");
        cantidadAlturas = teclado.nextInt();
        copia = cantidadAlturas;
        while (cantidadAlturas > 0) {
            System.out.println("Ingrese la altura para la persona numero " + contador);
            altura = teclado.nextFloat();
            suma = suma + altura;
            cantidadAlturas--;
            contador++;
        }
        promedio = suma / copia;
        System.out.println("La altura promedio es: " + promedio);
    }
}
