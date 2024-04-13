package Proyecto17;

import java.util.Scanner;

/*
 * Desarrollar un programa que permita ingresar un vector de n elementos, ingresar n por teclado. Luego imprimir la suma de todos sus elementos
 * */

public class Ejercicio1 {
    private Scanner teclado = new Scanner(System.in);
    private int[] vector;
    private int size;
    private int suma = 0;

    public void cargar() {
        System.out.println("Ingrese el tamaño del vector: ");
        size = teclado.nextInt();
        vector = new int[size];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor: ");
            vector[i] = teclado.nextInt();
            suma = suma + vector[i];
        }
    }

    public void imprimir() {
        System.out.println("La suma de los elementos del vector es: " + suma);
    }

    public static void main(String[] args) {
        Ejercicio1 vector = new Ejercicio1();
        vector.cargar();
        vector.imprimir();
    }
}
