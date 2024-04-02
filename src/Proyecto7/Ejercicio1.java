package Proyecto7;

import java.util.Scanner;

/*
 *
 * */

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int number1, number2, suma, diferencia, producto, division;
        System.out.println("Ingrese el numero uno:");
        number1 = teclado.nextInt();
        System.out.println("Ingrese el numero dos:");
        number2 = teclado.nextInt();
        if (number1 > number2) {
            suma = number1 + number2;
            diferencia = number1 - number2;
            System.out.println("La suma de los numeros es: " + suma + " y la diferencia es: " + diferencia);
        } else {
            producto = number1 * number2;
            division = number1 / number2;
            System.out.println("El producto de los numeros es: " + producto + " y la division es: " + division);
        }
    }
}
