package Proyecto10;

import java.util.Scanner;

/*
 * Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos tienen notas mayores o iguales a 7 y cuántos menores.
 * */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota, cantidad, contador = 1;
        int menores = 0, mayores = 0;
        System.out.println("Ingrese la cantidad de notas que desea agregar:");
        cantidad = teclado.nextInt();
        if (cantidad <= 0){
            System.out.println("Debe ingresar un numero mayor a 0.");
        }
        while (cantidad > 0) {
            System.out.println("Ingrese nota numero " + contador + ".");
            nota = teclado.nextInt();
            if (nota >= 7) {
                mayores++;
            } else {
                menores++;
            }
            cantidad--;
            contador++;
        }
        System.out.println("Cantidad de notas mayores o iguales a 7: " + mayores);
        System.out.println("Cantidad de notas menores a 7: " + menores);
    }
}
