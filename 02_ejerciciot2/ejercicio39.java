

package tema2ejercicio39;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Información sobre el ordenador:");
        
        System.out.println("Sistema Operativo: "
                +System.getProperty("os.name"));
        
        System.out.println("Versión del Sistema Operativo: "
                +System.getProperty("os.version" ));
        
        System.out.println("Arquitectura del Sistema Operativo: "
                +System.getProperty("os.arch"));
        
        System.out.println("Usuario Actual: "
                +System.getProperty("user.name"));
        
        System.out.println("Carpeta de Archivos Temporales: "
                +System.getenv("TMP"));
        
    }

}
