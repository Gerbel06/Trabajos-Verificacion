/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vej1;

import java.util.Scanner;
import static vej1.Vej4.x;

/**
 *
 * @author Sala_14
 */
public class Vej5 {

    public static int suma(int n) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un valor entero: ");
            suma += scan.nextInt();

        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese un valor entero para n: ");
            n = scan.nextInt();
        } while (n < 0);

        System.out.println("La suma es " + suma(n));
    }

}
