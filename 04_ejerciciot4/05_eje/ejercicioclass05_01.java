package objeto;
import java.util.ArrayList;
import objeto.DNI;
import objeto.Persona;
import java.time.LocalDate;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Oficina {
    
    private String nombre;
    private ArrayList <Persona> trabajadores;
    
    public Oficina(String a){
    
        nombre=a;
        trabajadores=new ArrayList<Persona>();
    }
    public Oficina(String a,int t){
    LocalDate d=LocalDate.of(2000,2,28);
    DNI c=new DNI("11111111h");           
    Persona b=new Persona("Antonio Pérez Pérez",c,900,d);
    
    LocalDate e=LocalDate.of(1995,9,10);
    DNI f=new DNI("22222222J");
    Persona g=new Persona("Luis López López",f,1000,e);
    
    LocalDate h=LocalDate.of(1985,5,21);
    DNI i=new DNI("33333333P");          
    Persona j=new Persona("Ana Díaz Díaz",i,1200,h);
    trabajadores=new ArrayList<Persona>();
        nombre=a;
        if(t<1){
           
        }
        else{
        
            if(t==1){
                
                
                trabajadores.add(b);
                
            }
            else{
                
                if(t==2){
                    
                
                    trabajadores.add(b);
                
                    trabajadores.add(g);
                }
                else{
                    
                    if(t==3){
          
                
                        trabajadores.add(g);
                        
                
                        trabajadores.add(j);
                    }
                    else{
                        trabajadores=new ArrayList<Persona>();
                    }
                }
            }
        }
    }
    public Oficina(){
        
        trabajadores=new ArrayList<Persona>();
    
        nombre="Industrias DAW";
        LocalDate h=LocalDate.of(1985,5,21);
        DNI i=new DNI("33333333P");          
        Persona j=new Persona("Ana Díaz Díaz",i,1200,h);
                
        trabajadores.add(j);
    
    }
    
    public ArrayList<Persona> getpersonas(){
    
        return trabajadores;
      
    }
    public String getnameoficina(){
    
        return nombre;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        String aux;
        aux="la empresa: "+nombre+"con los trabajadores: "+trabajadores;
        return aux;
    }
}
