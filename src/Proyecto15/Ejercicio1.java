package Proyecto15;

import java.util.Scanner;

/*
 * Confeccionar una clase que permita ingresar valores enteros por teclado y nos muestre la tabla de multiplicar de dicho valor.
 * Finalizar el programa al ingresar el valor -1.
 * */

public class Ejercicio1 {
    private Scanner teclado = new Scanner(System.in);
    int valor;

    public void cargar() {
        do {
            System.out.println("Digite el valor a multiplicar: ");
            valor = teclado.nextInt();
            if (valor != -1) {
                calcular(valor);
            }
        } while (valor != -1);
    }

    public void calcular(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    public static void main(String[] args) {
        Ejercicio1 tabla = new Ejercicio1();
        tabla.cargar();
    }
}
