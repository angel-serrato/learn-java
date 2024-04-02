package Proyecto6;

import java.util.Scanner;

/*
 * Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo (El perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)
 * */

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado, perimetro;
        System.out.println("Ingrese el valor del lado del cuadrado:");
        lado = teclado.nextInt();
        perimetro = lado * 4;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
    }
}
