package Proyecto16;

import java.util.Scanner;

/*
 * Desarrollar un programa que permita ingresar un vector de 8 elementos, e informe:
 * El valor acumulado de todos los elementos del vector.
 * El valor acumulado de los elementos del vector que sean mayores a 36.
 * Cantidad de valores mayores a 50.
 * */

public class Ejercicio1 {
    private Scanner teclado = new Scanner(System.in);
    private int[] elementos = new int[8];
    private int mayores = 0, suma;

    public void cargar() {
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Digite el valor del vector en la posicion " + (i + 1));
            elementos[i] = teclado.nextInt();
        }
    }

    public void recorrer() {
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Elemento " + i + ": " + elementos[i]);
            suma = suma + elementos[i];
            if (elementos[i] > 36) {
                mayores++;
            }
        }
    }

    public void imprimir() {
        System.out.println("El acumulado del vector es: " + suma);
        System.out.println("La cantidad de elementos mayores a 36 es: " + mayores);
    }

    public static void main(String[] args) {
        Ejercicio1 vector = new Ejercicio1();
        vector.cargar();
        vector.recorrer();
        vector.imprimir();
    }
}
