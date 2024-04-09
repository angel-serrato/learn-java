package Proyecto11;

import java.util.Scanner;

/*
 * Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la tabla de multiplicar del mismo (los primeros 12 términos)
 * Ejemplo: Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36
 * */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        int numero = teclado.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " * " + i + " = " + numero * i);
        }
    }
}
