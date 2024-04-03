package Proyecto10;

import java.util.Scanner;

/*
 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500.
 * Realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
 * Además, el programa deberá informar el importe que gasta la empresa en sueldos al personal.
 * */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sueldo, empleados, sueldos = 0, sueldoNormal = 0, sueldoAlto = 0;
        System.out.println("Digite la cantidad de sueldos a cargar: ");
        empleados = teclado.nextInt();
        while (empleados > 0) {
            System.out.println("Digite el sueldo del empleado: ");
            sueldo = teclado.nextInt();
            if (sueldo > 0 && sueldo < 100) {
                sueldos += 1;
            } else if (sueldo >= 100 && sueldo <= 300) {
                sueldoNormal = sueldoNormal + 1;
            } else {
                sueldoAlto += 1;
            }
            empleados--;
        }
        System.out.println("La cantidad de empleados que tienen un sueldo entre 100 y 300 es: " + sueldoNormal);
        System.out.println("La cantidad de empleados que tienen un sueldo mayor a 300 es: " + sueldoAlto);
    }
}
