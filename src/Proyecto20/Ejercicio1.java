package Proyecto20;

import java.util.Scanner;

/*
 * Cargar un vector de n elementos de tipo entero. Ordenar posteriormente el vector.
 * */

public class Ejercicio1 {
    private Scanner teclado;
    private int[] vector;
    private int cantidad;

    public void cargar() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del vector: ");
        cantidad = teclado.nextInt();
        vector = new int[cantidad];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor del elemento " + (i + 1));
            vector[i] = teclado.nextInt();
        }
    }

    public void imprimir() {
        System.out.println("Elementos del vector ordenados.");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    public void ordenar() {
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - 1 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio1 vector = new Ejercicio1();
        vector.cargar();
        vector.ordenar();
        vector.imprimir();
    }
}
