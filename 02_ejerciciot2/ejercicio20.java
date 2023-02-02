package tema2ejercicio20;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ruta del archivo: ");
        String f1 = teclado.next();
        File f2=new File (f1);
        
        boolean archivo = f2.canRead();
        boolean directorio = f2.isDirectory();
        if (directorio) {
        System.out.println("La ruta introducida corresponde a un directorio");
        } else { if (archivo) {
        double bytes=f2.length();
        System.out.println("La ruta introducida corresponde a un archivo de " +bytes +" bytes. Desea borrarlo\nSi/No?");
        String r = teclado.next();
        while (r.equals("si") || r.equals("Si") || r.equals("SI") || r.equals("sI")) {
        f2.delete();
        System.out.println("Archivo eliminado con exito");
        System.out.println("Desea continuar:\nSi/No" );
        r = teclado.next();
        }
        } else {
        System.out.println("La ruta seleccionada no existe");
        }
        }
    }
}
