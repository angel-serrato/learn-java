package Proyecto9;

import java.util.Scanner;

/*
 * Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha fecha corresponde a Navidad
 * */

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, year;
        System.out.print("Ingrese numero de día:");
        dia = teclado.nextInt();
        System.out.print("Ingrese numero de mes:");
        mes = teclado.nextInt();
        System.out.print("Ingrese numero de año:");
        year = teclado.nextInt();
        if (mes == 12 && dia == 25) {
            System.out.print("La fecha ingresada corresponde a navidad.");
        }
    }
}
