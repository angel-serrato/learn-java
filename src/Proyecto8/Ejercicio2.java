package Proyecto8;

import java.util.Scanner;

/*
 * Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número es positivo, nulo o negativo
 * */

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un valor entero:");
        numero = teclado.nextInt();
        if (numero < 0) {
            System.out.println("El numero es negativo");
        } else if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es nulo");
        }
    }
}
