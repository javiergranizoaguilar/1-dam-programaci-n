package objeto;
import objeto.Persona;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Persona {
    
    private String nombre;
    private DNI dni;
    private double sueldo;
    private LocalDate fechadenacimiento;

    
    
    public Persona(String n,DNI d,double s,LocalDate l){
    
        nombre=n;
        dni=d;
        sueldo=s;
        fechadenacimiento=l;
    
    }
    public Persona(String n,DNI d){
    
        sueldo=1000;
        fechadenacimiento=LocalDate.of(20, Month.MARCH, 20);
        nombre=n;
        dni=d;
    }
    public Persona(String n,double s,LocalDate l,int nu,char le){
    
        nombre=n;
        sueldo=s;
        fechadenacimiento=l;
        dni=new DNI(nu,le);
        
    }
    public Persona(String n,int nu,char le){
    
        sueldo=1000;
        fechadenacimiento=LocalDate.of(20, Month.MARCH, 20);
        nombre=n;
        dni=new DNI(nu,le);
    }
    public char getdniletra(){
    
        return dni.getletra();
    }
    public int getdninum(){
    
        return dni.getnum();
    }
    public String getnombre(){
    
        return nombre;
    }
    public double getsueldo(){
    
        return sueldo;
    }
    public LocalDate getdate(){
    
        return fechadenacimiento;
    }
    public void setdni(DNI a){
    
        dni=a;
    }
    public void setdnombre(String a){
    
        nombre=a;
    }
    public void setsueldo(double a){
    
        sueldo=a;
    }
    public void setfecha(LocalDate a){
    
        fechadenacimiento=a;
    }
}
