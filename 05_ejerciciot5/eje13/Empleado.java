package objeto;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Empleado {
    private String nombre;
    private double sueldo;
    private double dinero;
    
    public Empleado(String n,double s){
    
        this.nombre=n;
        this.sueldo=s;
    }
    public double getSueldo(){
    
        return this.sueldo;
    }
    public double getDinero(){
    
        return this.sueldo;
    }
    
    public void cobrar(double cantidad) throws CabreoException {

        if(cantidad<this.sueldo){
            this.dinero+=cantidad;
            throw new CabreoException("el cobro esta por debajo del sueldo por: "+(this.sueldo-cantidad));
        }
        else{
            this.dinero+=cantidad;
        }
    }
}

