/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices_hilos;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Matrices_hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner l=new Scanner(System.in);
        System.out.println("ingresar dimancion"); 
        int num=l.nextInt();
        int m[][]=new int[num][num];
        int m2[][]=new int [num][num];
        secundaria ob=new secundaria();
        ob.llenar(m);
        ob.imprimir(m);
        System.out.println( );
        ob.llenar(m2);
        ob.imprimir(m2);
        ob.sumar(m , m2);
        
                
    }
    
}
