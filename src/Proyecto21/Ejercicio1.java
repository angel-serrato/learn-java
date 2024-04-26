package Proyecto21;

import java.util.Scanner;

/*
 * Cargar en un vector los nombres de 5 paises y en otro vector paralelo la cantidad de habitantes del mismo.
 * Ordenar alfabéticamente e imprimir los resultados.
 * Por último ordenar con respecto a la cantidad de habitantes (de mayor a menor) e imprimir nuevamente.
 * */

public class Ejercicio1 {
    private Scanner teclado = new Scanner(System.in);
    private String[] paises;
    private int[] habitantes;

    public void cargar() {
        paises = new String[5];
        habitantes = new int[5];
        for (int i = 0; i < paises.length; i++) {
            System.out.println("Ingrese el nombre del pais");
            paises[i] = teclado.next();
            System.out.println("Ingrese la cantidad de habitantes");
            habitantes[i] = teclado.nextInt();
        }
    }

    public void ordenar() {
        for (int i = 0; i < paises.length; i++) {
            for (int j = 0; j < paises.length - 1 - i; j++) {
                if (paises[j].compareTo(paises[j + 1]) > 0) {
                    String auxpais;
                    auxpais = paises[j];
                    paises[j] = paises[j + 1];
                    paises[j + 1] = auxpais;
                    int auxhabitante;
                    auxhabitante = habitantes[j];
                    habitantes[j] = habitantes[j + 1];
                    habitantes[j + 1] = auxhabitante;
                }
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i] + " - " + habitantes[i]);
        }
    }

    public static void main(String[] args) {
        Ejercicio1 vector = new Ejercicio1();
        vector.cargar();
        vector.ordenar();
        vector.imprimir();
    }
}
