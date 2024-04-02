package Proyecto6;

import java.util.Scanner;

/*
 * Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente. Mostrar lo que debe abonar el comprador.
 * */

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int precio, cantidad, total;
        System.out.println("Ingrese el valor del articulo:");
        precio = teclado.nextInt();
        System.out.println("Ingrese la cantidad:");
        cantidad = teclado.nextInt();
        total = precio * cantidad;
        System.out.println("El valor total es: " + total);
    }
}
