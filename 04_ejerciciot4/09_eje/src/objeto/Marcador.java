package objeto;

import java.time.LocalDate;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Marcador {
    
    private String nombrelocal;
    private String nombrevisitante;
    private int puntoslocal;
    private int puntosvisitantes;
    private LocalDate fecha;
    
    public Marcador(String v, String l){
        
        nombrelocal=l;
        nombrevisitante=v;
        puntoslocal=0;
        puntosvisitantes=0;
        fecha= LocalDate.now();
    }
    public Marcador(String v, String l,LocalDate d){
        
        nombrelocal=l;
        nombrevisitante=v;
        puntoslocal=0;
        puntosvisitantes=0;
        fecha=d;
    }
    public Marcador(String v, String l,LocalDate d,int pl,int pv){
        
        nombrelocal=l;
        nombrevisitante=v;
        puntoslocal=pl;
        puntosvisitantes=pv;
        fecha= d;
    }
    public String getnamel(){
    
        return nombrelocal;
    }
    public String getnamev(){
    
        return nombrevisitante;
    }
    public int getpuntosl(){
    
        return puntoslocal;
    }
    public int getpuntosv(){
    
        return puntosvisitantes;
    }
    public LocalDate getfecha(){
    
        return fecha;
    }
    public void setnamel(String a){
    
        nombrelocal=a;
    }
    public void setnamev(String a){
    
        nombrevisitante=a;
    }
    public void setpuntosl(int a){
    
        puntoslocal=a;
    }
    public void setpuntosv(int a){
    
        puntosvisitantes=a;
    }
    public void setnamel(LocalDate a){
    
        fecha=a;
    }
    public void añadircanasta(char a,int b){
    
        if(a=='l'){
        
            puntoslocal=puntoslocal+b;
        
        }
        else{
            if(a=='v'){
        
                puntosvisitantes=puntosvisitantes+b;
        
            }
            else{
            
                
            
            }
        
        }
        
    }
    public void reset(){
        puntoslocal=0;
        puntosvisitantes=0;

    }
}

