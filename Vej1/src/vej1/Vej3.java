/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vej1;

import static java.lang.Math.sqrt;
import java.util.Scanner;
import static vej1.Vej1.x;

/**
 *
 * @author Sandra
 */
public class Vej3 {

    static int x;
    
    public static int raiz(int x){
        int y=(int) sqrt(x);
        return y;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Ingrese un valor entero para X: ");
            x = scan.nextInt();
        }while(x<0);
        System.out.println("El valor de X es: "+x+" y el de Y es: "+raiz(x));
        
    }
    
}
