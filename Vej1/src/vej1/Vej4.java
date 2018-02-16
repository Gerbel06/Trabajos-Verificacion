/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vej1;

import java.util.Scanner;
import static vej1.Vej3.x;

/**
 *
 * @author Sandra
 */
public class Vej4 {

    static int x,y;
    
    public static int prod(int x, int y){
        int z=x*y;
        
        return z;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do{
            System.out.print("Ingrese un valor entero para X: ");
            x = scan.nextInt();
        }while(x<0);
        
        do{
            System.out.print("Ingrese un valor entero para Y: ");
            y = scan.nextInt();
        }while(y<0);
        
        System.out.println("EL producto es: "+prod(x,y));
        
    }
    
}
