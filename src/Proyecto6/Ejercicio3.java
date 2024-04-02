package Proyecto6;

import java.util.Scanner;

/*
 * Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio.
 * */

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, num4, suma, promedio;
        System.out.println("Ingrese el numero 1:");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el numero 2:");
        num2 = teclado.nextInt();
        System.out.println("Ingrese el numero 3:");
        num3 = teclado.nextInt();
        System.out.println("Ingrese el numero 4:");
        num4 = teclado.nextInt();
        suma = num1 + num2 + num3 + num4;
        promedio = suma / 4;
        System.out.println("La suma de los numeros es: " + suma + " y su promedio es: " + promedio);
    }
}
