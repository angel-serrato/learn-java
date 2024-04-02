package Proyecto6;

import java.util.Scanner;

/*
 * Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma de los dos primeros y el producto del tercero y el cuarto.
 * */

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, num4, suma, producto;
        System.out.println("Ingrese el primer numero:");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero:");
        num3 = teclado.nextInt();
        System.out.println("Ingrese el cuarto numero:");
        num4 = teclado.nextInt();
        suma = num1 + num2;
        producto = num3 * num4;
        System.out.println("La suma es: " + suma);
        System.out.println("El producto es: " + producto);
    }
}
