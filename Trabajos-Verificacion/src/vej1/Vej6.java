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
public class Vej6 {

    public static int product(int n, int[] b) {
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= b[i];
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] b = {1, 2, 3, 10};

        int n;
        do {
            System.out.print("Ingrese un valor entero para n: ");
            n = scan.nextInt();
        } while (n < 0);

        System.out.println("El producto de los primeros " + n + " elementos es: " + product(n, b));
    }

}
