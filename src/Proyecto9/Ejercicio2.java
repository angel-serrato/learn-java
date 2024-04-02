package Proyecto9;

import java.util.Scanner;

/*
 * Se ingresan tres valores por teclado, si todos son iguales se imprime la suma del primero con el segundo y a este resultado se lo multiplica por el tercero.
 * */

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int uno, dos, tres, addition, substraction;
        System.out.println("Ingrese el primer numero:");
        uno = teclado.nextInt();
        System.out.println("Ingrese el segundo numero:");
        dos = teclado.nextInt();
        System.out.println("Ingrese el tercer numero:");
        tres = teclado.nextInt();
        if (uno == dos && uno == tres){
            addition = uno + dos;
            substraction = addition * tres;
            System.out.println("Los numeros son iguales. La suma es " + addition + " la multiplicacion " + substraction);
        } else {
            System.out.println("Los numeros no son todos iguales.");
        }
    }
}
