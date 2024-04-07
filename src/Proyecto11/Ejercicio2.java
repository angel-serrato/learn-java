package Proyecto11;

import java.util.Scanner;

/*
 * Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los últimos 5 valores ingresados.
 * */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0, numero;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite el número " + i);
            numero = teclado.nextInt();
            if (i >= 5) {
                suma = suma + numero;
            }
        }
        System.out.println("La suma de los últimos 5 dígitos es: " + suma);
    }
}
