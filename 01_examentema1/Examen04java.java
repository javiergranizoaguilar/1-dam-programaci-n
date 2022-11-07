/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen04java;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Examen04java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("dime la edad 1");
    int ed1=new Scanner(System.in).nextInt();
    System.out.println("dime la edad 2");
    int ed2=new Scanner(System.in).nextInt();
    boolean ed1m = ed1>=10;
    boolean ed2m = ed2>=10;
    boolean ed1ed2= ed1>ed2;
    System.out.println("el primero es mallor de edad? "+ed1m);
    System.out.println("el segundo es mallor de edad? "+ed2m);
    System.out.println("el primero es mallor que el segundo? "+ ed1ed2);
    }
    
}
