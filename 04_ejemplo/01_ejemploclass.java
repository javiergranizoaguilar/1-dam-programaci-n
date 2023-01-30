package objeto;

import java.awt.Point;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class cafetera {
    
    //ATRIBUTOS
    
    private double Capacidad_maxima;
    private double Capacidad_actual;
    
    //POR DEFECTO
    public cafetera(){
        Capacidad_maxima=1000;
        Capacidad_actual=0;
    
    };
    //CON PARAMETROS
    public cafetera(double m){
        Capacidad_maxima=m;
        Capacidad_actual=m;
    };
    
    public cafetera(double m,double a){
        Capacidad_maxima=m;
        Capacidad_actual=a;
        if(m<a){
            Capacidad_actual=Capacidad_maxima;
        }
    };
    
    //SETTERS
    
    public double getmax(){
    
        return Capacidad_maxima;
    };
    public double getactual(){
    
        return Capacidad_actual;
    };

    //GETERS

    public void setmax(double n){
    
        Capacidad_maxima=n;
        if(Capacidad_maxima<Capacidad_actual){
            Capacidad_actual=Capacidad_maxima;
        }
    };
    public void setactual(double n){
    
        Capacidad_actual=n;
        
        if(Capacidad_actual>Capacidad_maxima){
        
            Capacidad_actual=Capacidad_maxima;
        }
    };
    public void llenarcafetera(){
    
        Capacidad_maxima=Capacidad_actual;
    };
    
    public void servirtaza(double n){
    
        Capacidad_actual=Capacidad_actual-n;
        if(Capacidad_actual<0){
            Capacidad_actual=0;
        }
    };
    
    public void vaciar(){
        Capacidad_actual=0;
    }
    
    public void agregarcafe(int c){
        Capacidad_actual=Capacidad_actual+c;
        
        if(Capacidad_actual>Capacidad_maxima){
            Capacidad_actual=Capacidad_maxima;
        }
    
    }
    
}
