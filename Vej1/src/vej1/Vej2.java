package vej1;

import java.util.Scanner;

public class Vej2 {

    static int x,y;
    
    public static void intercambio(int a,int b){
        int aux=a;
        x=b;
        y=a;
        
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Ingrese un valor para X: ");
        x=scan.nextInt();
        System.out.print("Ingrese un valor para Y: ");
        y=scan.nextInt();
        intercambio(x, y);
        System.out.println("Valor de X= "+x+" Valor de Y= "+y);
    }
    
}
