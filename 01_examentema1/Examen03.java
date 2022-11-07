/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg03;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Examen03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("dime las horas");
    int oras=new Scanner(System.in).nextInt();
    System.out.println("dime los mins");
    int min=new Scanner(System.in).nextInt();
    System.out.println("dime los segundos");
    int sec=new Scanner(System.in).nextInt();
    int sect= sec+(min*60)+(oras*60*60);
    System.out.println("estos son tus segundos: "+sect);
    }
    
}
