package Proyecto16;

import java.util.Scanner;

/*
 * Realizar un programa que pida la carga de dos vectores numéricos enteros de 4 elementos.
 * Obtener la suma de los dos vectores, dicho resultado guardarlo en un tercer vector del mismo tamaño.
 * Sumar componente a componente.
 * */

public class Ejercicio2 {
    private Scanner teclado = new Scanner(System.in);
    private int[] vector1 = new int[4];
    private int[] vector2 = new int[4];
    private int[] vector3 = new int[4];
    private int suma;

    public void cargar() {
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Digite el valor para el vector 1 en la posición " + i);
            vector1[i] = teclado.nextInt();
            System.out.println("Digite el valor para el vector 2 en la posición " + i);
            vector2[i] = teclado.nextInt();
            suma = vector1[i] + vector2[i];
            vector3[i] = suma;
        }
    }

    public void imprimir() {
        for (int i = 0; i < vector3.length; i++) {
            System.out.println("La suma de los vectores en la posición: " + i + " es: " + vector3[i]);
        }
    }

    public static void main(String[] args) {
        Ejercicio2 vectores = new Ejercicio2();
        vectores.cargar();
        vectores.imprimir();
    }
}
