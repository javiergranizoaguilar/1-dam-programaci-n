package tema2ejercicio12;
import bpc.daw.objetos.MarcadorBaloncesto;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    MarcadorBaloncesto b =null;
    b = new MarcadorBaloncesto("Estudiante","CB Granada");
    b.anotarCanasta('L', 2);
    b.anotarCanasta('V', 3);
    b.anotarCanasta('L', 2);
    b.anotarCanasta('V', 3);
    b.anotarCanasta('V', 2);
    b.anotarCanasta('L', 1);
    b.anotarCanasta('L', 1);
    b.anotarCanasta('V', 2);
   System.out.println(b);
        System.out.println("El equipo local es : " +b.getNombreLocal());
        System.out.println("El equipo visitante es : " +b.getNombreVisitante());
        System.out.println("Los puntos de estudiantes son: " +b.getPuntosLocal());
        System.out.println("Los puntos de CB Granada son: " +b.getPuntosVisitante());
        System.out.println("El equipo ganador es: " +b.getNombreEquipoGanador());
        System.out.println("El equipo ganador es: " +b.getNombreEquipoPerdedor());

    
    
    
    }
    
}
