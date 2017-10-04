/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=12; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
    
    

