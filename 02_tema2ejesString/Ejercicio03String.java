package ejercicio03.string;

import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Ejercicio03String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("dame la palabra");
        String a=new Scanner(System.in).nextLine();
            if (a.endsWith("a"))
            {
            String b=a.substring(0, a.length()-1);
            System.out.println(b+"us");
            }
            else {if(a.endsWith("e"))
                {
                String c=a.substring(0, a.length()-1);
                System.out.println(c+"us");
                }
                else{ if(a.endsWith("i"))
                    {
                    String d=a.substring(0, a.length()-1);
                    System.out.println(d+"us");
                    }
                    else {if(a.endsWith("o"))
                    {
                    String e=a.substring(0, a.length()-1);
                    System.out.println(e+"us");
                    }
                        else{if(a.endsWith("u"))
                        {
                        String f=a.substring(0, a.length()-1);
                        System.out.println(f+"us");
                        }
                           else
                            {
                            System.out.println(a+"us");
                            }
                }
                } 
            
            }   
                    
                    
                 }
    }
    
}
