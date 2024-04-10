package Proyecto14;

import java.util.Scanner;

/*
 * Confeccionar una clase que represente un empleado.
 * Definir como atributos su nombre y su sueldo.
 * Confeccionar los métodos para la carga, otro para imprimir sus datos y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000)
 * */

public class Ejercicio2 {
    private Scanner teclado = new Scanner(System.in);
    int sueldo;
    String nombre;

    public void iniciar() {
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = teclado.next();
        System.out.println("Ingrese el sueldo en dólares del empleado: ");
        sueldo = teclado.nextInt();
    }

    public void imprimir() {
        System.out.println("El empleado " + nombre + " tiene un sueldo de: " + sueldo + " dólares.");
    }

    public void impuestos() {
        if (sueldo > 3000) {
            System.out.println("El empleado debe pagar impuestos.");
        } else {
            System.out.println("El empleado no debe pagar impuestos.");
        }
    }

    public static void main(String[] args) {
        Ejercicio2 ejercicio = new Ejercicio2();
        ejercicio.iniciar();
        ejercicio.imprimir();
        ejercicio.impuestos();
    }
}
