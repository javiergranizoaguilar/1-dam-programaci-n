

package tema2ejercicio48;
import bpc.daw.objetos.MarcadorMejorado;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Tema2ejercicio48 {
public static int CANASTA_LOCAL;
public static int CANASTA_VIVITANTE;
public static int NORMAL;
public static int TIRO_LIBRE;
public static int TRIPLE;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MarcadorMejorado a=new MarcadorMejorado("Estudiantes","CB Granada");
        
        a.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL,MarcadorMejorado.NORMAL );
        
        a.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE,MarcadorMejorado.TRIPLE );
        
        a.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.NORMAL);
        
        a.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.NORMAL);
        
        a.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.TRIPLE);
        
        a.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.TIRO_LIBRE);
        
        a.anotarCanasta(MarcadorMejorado.CANASTA_LOCAL, MarcadorMejorado.TIRO_LIBRE);
        
        a.anotarCanasta(MarcadorMejorado.CANASTA_VISITANTE, MarcadorMejorado.NORMAL);
        
        System.out.println("El equipo local es : " +a.getNombreLocal());
        
        System.out.println("El equipo visitante es : " +a.getNombreVisitante());
        
        System.out.println("Los puntos de estudiantes son: " +a.getPuntosLocal());
        
        System.out.println("Los puntos de CB Granada son: " +a.getPuntosVisitante());
        
        System.out.println("El equipo ganador es: " +a.getNombreEquipoGanador());
        
        System.out.println("El equipo ganador es: " +a.getNombreEquipoPerdedor());
        
    }

}
