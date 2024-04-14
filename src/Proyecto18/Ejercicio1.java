package Proyecto18;

import java.util.Scanner;

/*
 * Desarrollar un programa que permita cargar 5 nombres de personas y sus edades respectivas.
 * Luego de realizar la carga por teclado de todos los datos imprimir los nombres de las personas mayores de edad (mayores o iguales a 18 años).
 * */

public class Ejercicio1 {
    private Scanner teclado = new Scanner(System.in);
    private String[] nombre;
    private int[] edad;

    public void cargar() {
        nombre = new String[5];
        edad = new int[5];
        for (int i = 0; i < nombre.length; i++) {
            System.out.print("Ingrese el nombre: ");
            nombre[i] = teclado.next();
            System.out.print("Ingrese el edad: ");
            edad[i] = teclado.nextInt();
        }
    }

    public void imprimir() {
        for (int i = 0; i < nombre.length; i++) {
            if (edad[i] >= 18) {
                System.out.println(nombre[i] + "\t" + edad[i]);
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio1 vector = new Ejercicio1();
        vector.cargar();
    }
}
