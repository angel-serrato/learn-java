package Proyecto11;

import java.util.Scanner;

/*
 * Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un triángulo. El programa deberá informar:
 * a) De cada triángulo la medida de su base, su altura y su superficie.
 * b) La cantidad de triángulos cuya superficie es mayor a 12.
 * */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad, mayores = 0;
        System.out.println("Ingrese la cantidad de triángulos: ");
        cantidad = teclado.nextInt();
        for (int i = 1; i <= cantidad; i++) {
            int altura, base, superficie;
            System.out.println("Ingrese la base del triángulo " + i + ": ");
            base = teclado.nextInt();
            System.out.println("Ingrese la altura del triángulo " + i + ": ");
            altura = teclado.nextInt();
            superficie = (base * altura) / 2;
            if (superficie > 12) {
                mayores++;
            }
            System.out.println("La base del triángulo es " + base + ", y su altura es " + altura + ", superficie= " + superficie);
        }
        System.out.println("La cantidad de triángulos cuya superficie es mayor a 12 son " + mayores);
    }
}
