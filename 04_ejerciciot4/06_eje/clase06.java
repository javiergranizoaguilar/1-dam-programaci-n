package objeto;
import java.awt.Point;
import java.awt.Toolkit;
import static java.awt.Toolkit.getDefaultToolkit;
import java.awt.Dimension;


/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Punto {
    
    private int x;
    private int y;
    
    public Punto(){
        x=0;
        y=0;
        Point a=new Point(x,y);
    }
    public Punto(int X,int Y){
        Toolkit a= getDefaultToolkit();
        Dimension b=a.getScreenSize();
        
        if(Y<0){
            y=0;
        }
        else{
            if(Y>b.getHeight()){
                y=b.height;
            }
            else{
            y=Y;
            }
            
        }
        if(X<0){
        
            x=0;
        }
        else{
        
            if(X>b.getWidth()){
            
            x=b.width;
            }
            else{
            
            x=X;   
            }
        }
        
        
        Point c=new Point(x,y);
    }
    public Punto(Punto a){
       x=a.getX();
       y=a.getY();
       x=x/2;
       y=y/2;
       Point b=new Point(x,y);
    
    }
    public Punto(double a,double d){
        
        double b=20*(Math.sin(a));
        double c=20*(Math.cos(a));
        
        x=(int)b;
        y=(int)c;
    }
    
    
    
    
    public int getX(){
    
        return x;
    }
    public int getY(){
    
        return y;
    }
    public void setx(int a){
    
        x=a;
    }
    public void sety(int a){
    
        y=a;
    }
}
