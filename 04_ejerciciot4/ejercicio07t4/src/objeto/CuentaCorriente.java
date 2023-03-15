package objeto;
/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class CuentaCorriente {
    
    private int numero;
    private double saldo;
    
    
    public CuentaCorriente(){
        
        saldo=0;
        numero=(int)(Math.random()*1001);
    
    }
    public CuentaCorriente(int n){
    
        numero=n;
        saldo=0;
    
    }
    public CuentaCorriente(int n,double m){
    
        numero=n;
        saldo=m;
    }
    
    public void añadirDinero(int a){
    
        saldo=saldo+a;
    
    }
    public void sacarDinero(int a){
    
        saldo=saldo-a;
    
    }
    public void setnumero(int n){
    
        numero=n;
    }
    public void setsaldo(double n){
    
        saldo=n;
    }
    public int getnumero(){
    
        return numero;
    }
    public double getsaldo(){
    
        return saldo;
    }
}
