package Proyecto7;

import java.util.Scanner;

/*
 * Se ingresa por teclado un número positivo de uno o dos dígitos (1..99) mostrar un mensaje indicando si el número tiene uno o dos dígitos.
 * (Tener en cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
 * */

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero de uno o dos digitos:");
        numero = teclado.nextInt();
        if (numero > 0 && numero <= 9) {
            System.out.println("El numero tiene un digito.");
        } else if (numero >= 10 && numero <= 99) {
            System.out.println("El numero tiene dos digitos.");
        } else {
            System.out.println("El numero tiene mas de dos digitos.");
        }
    }
}
