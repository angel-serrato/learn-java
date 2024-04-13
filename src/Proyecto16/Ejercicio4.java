package Proyecto16;

import java.util.Scanner;

/*
 * Cargar un vector de 10 elementos y verificar posteriormente si el mismo está ordenado de menor a mayor.
 * */

public class Ejercicio4 {
    private Scanner teclado = new Scanner(System.in);
    private int[] elementos;
    private int mayor;
    private boolean valor;

    public void cargar() {
        elementos = new int[10];
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("Digite el valor del vector en la posición " + (i + 1));
            elementos[i] = teclado.nextInt();
        }
    }

    public void verificar() {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i + 1] < elementos[i]) {
                valor = false;
            }
        }
        if (valor == true) {
            System.out.println("El vector está ordenado de menor a mayor.");
        } else {
            System.out.println("El vector no está ordenado de menor a mayor.");
        }
    }

    public static void main(String[] args) {
        Ejercicio4 vectores = new Ejercicio4();
        vectores.cargar();
        vectores.verificar();
    }
}
