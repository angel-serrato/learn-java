package Proyecto7;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota1, nota2, nota3, promedio;
        System.out.println("Ingres la nota 1:");
        nota1 = teclado.nextInt();
        System.out.println("Ingres la nota 2:");
        nota2 = teclado.nextInt();
        System.out.println("Ingres la nota 3:");
        nota3 = teclado.nextInt();
        promedio = (nota1 + nota2 + nota3) / 3;
        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else {
            System.out.println("No promocionado");
        }
    }
}
