/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen09java;

import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Examen09java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("dime un numero entre el 10 y el 56");
    int ed1=new Scanner(System.in).nextInt();
    if (ed1<10){
        System.out.println("mal echo");}
        else {if(ed1>56){
            System.out.println("mal echo");}
        else {System.out.println("bien echo");}
        }
    
    }
    
}
