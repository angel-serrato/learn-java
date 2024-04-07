package Proyecto12;

import java.util.Scanner;

/*
 * Realizar un programa que acumule (sume) valores ingresados por teclado hasta ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
 * Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.
 * */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor, suma = 0;
        do {
            System.out.println("Digite el valor a sumar. Para salir digite 9999.");
            valor = teclado.nextInt();
            if (valor != 9999) {
                suma = suma + valor;
            }
        } while (valor != 9999);
        System.out.println("El total de la suma es: " + suma);
    }
}
