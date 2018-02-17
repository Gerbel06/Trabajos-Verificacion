/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vej1;

import java.util.Scanner;

/**
 *
 * @author Sala_14
 */
public class Vej7 {

    static int q, r;

    public static void divide(int a, int b) {
        double division;
        division = a / b;
        q = (int) division;
        r = a % b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        do {
            System.out.print("Ingrese un valor entero para a: ");
            a = scan.nextInt();
        } while (a < 0);

        do {
            System.out.print("Ingrese un valor entero para b: ");
            b = scan.nextInt();
        } while (b < 0);
        divide(a, b);
        System.out.println("La division entera es: " + q + "\nEl residuo de la divion es: " + r);

    }

}
