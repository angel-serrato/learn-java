package Proyecto14;

import java.util.Scanner;

/*
 * Implementar la clase operaciones. Se deben cargar dos valores enteros, calcular su suma, resta, multiplicación y división, cada una en un método, imprimir dichos resultados.
 * */

public class Ejercicio1 {
    private Scanner teclado;
    int num1, num2, suma, resta, multiplicacion, division;

    public void iniciar() {
        teclado = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        num1 = teclado.nextInt();
        System.out.println("Digite el segundo numero: ");
        num2 = teclado.nextInt();
    }

    public void suma() {
        suma = num1 + num2;
    }

    public void resta() {
        resta = num1 - num2;
    }

    public void multiplicacion() {
        multiplicacion = num1 * num2;
    }

    public void division() {
        division = num1 / num2;
    }

    public void imprimir() {
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La division de los numeros es: " + division);
    }

    public static void main(String[] args) {
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.iniciar();
        ejercicio1.suma();
        ejercicio1.resta();
        ejercicio1.multiplicacion();
        ejercicio1.division();
        ejercicio1.imprimir();
    }
}
