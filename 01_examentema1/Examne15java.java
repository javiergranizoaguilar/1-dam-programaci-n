/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examne.pkg15java;

/**
 *
 * @author javie
 */
public class Examne15java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean x = true ;
        boolean y = false ;
        boolean z = true ;
    System.out.println("solucion a: "+(x || y || x && !z && !y));
    System.out.println("solucion b: "+((x||!y)&&(!x||z)));
    System.out.println("solucion c: "+(!x||!y||z&&x&&!y));

    }
    
}
