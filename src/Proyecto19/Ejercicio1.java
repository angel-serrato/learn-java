package Proyecto19;

import java.util.Scanner;

/*
 * Cargar un vector de n elementos. Imprimir el menor y un mensaje si se repite dentro del vector.
 * */

public class Ejercicio1 {
    private Scanner teclado = new Scanner(System.in);
    private int cantidad, menor, contador;
    private int[] arreglo;

    public void cargar() {
        System.out.println("Ingrese la cantidad de elementos: ");
        cantidad = teclado.nextInt();
        arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el valor numero: " + i);
            arreglo[i] = teclado.nextInt();
        }
    }

    public void imprimir() {
        menor = arreglo[0];
        for (int i = 0; i < cantidad; i++) {
            if (arreglo[i] < menor) {
                if (arreglo[i] == menor) {
                    contador++;
                }
                menor = arreglo[i];
            }
        }
        System.out.println("El menor de todos los números es: " + menor);
        if (contador > 1) {
            System.out.println("El menor se repite dentro del vector.");
        } else {
            System.out.println("El menor no se repite dentro del vector.");
        }
    }

    public static void main(String[] args) {
        Ejercicio1 vector = new Ejercicio1();
        vector.cargar();
        vector.imprimir();
    }
}
