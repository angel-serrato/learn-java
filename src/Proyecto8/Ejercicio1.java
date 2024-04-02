package Proyecto8;

import java.util.Scanner;

/*
 * Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
 * */

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, mayor;
        System.out.println("Digite el numero uno");
        num1 = teclado.nextInt();
        System.out.println("Digite el numero dos");
        num2 = teclado.nextInt();
        System.out.println("Digite el numero tres");
        num3 = teclado.nextInt();
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
            System.out.println("El numero mayor es " + mayor);
        } else if (num2 > num3) {
            mayor = num2;
            System.out.println("El numero mayor es " + mayor);
        } else {
            mayor = num3;
            System.out.println("EL numero mayor es " + mayor);
        }
    }
}
