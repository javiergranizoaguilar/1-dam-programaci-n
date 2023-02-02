package tema2ejercicio17;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("¿Cuál es su nombre?");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("¿Cuál es tu dominio?");
        String dominio = new Scanner(System.in).nextLine();
        
        boolean permitir = dominio.endsWith(".com");
        
        if (permitir==true){
            System.out.println("Tu correo es: "+nombre+"@"+dominio);
        }else{
            System.out.println("El dominio es incorrecto");
        }
        
    }
    
}
