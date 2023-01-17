package tema03eje04;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema03eje04 {

    public static void main(String[] args) {
        
        boolean r=true;
        
        while(r){
        
            System.out.println("Eres mayor de edad ?");
            System.out.println("Escribe Y para si");
            System.out.println("Escribe N para no");
            
            char s=new Scanner(System.in).next().charAt(0);
            
            if(s=='Y'){
                
                System.out.println("Eres mayor de edad");
            
                r=false;
            
            }
            else{
            
                if(s=='N'){
                
                    System.out.println("No eres mayor de edad");
            
                    r=false;
            
                }
                else{
                
                    System.out.println("No se a identificado la letra");
                    System.out.println("Recuerda poner N o Y en mayuscula");
                
                }
            }
        
        }
    }

}
