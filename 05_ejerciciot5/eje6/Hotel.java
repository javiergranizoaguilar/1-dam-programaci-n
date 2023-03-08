package objetos;

import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Hotel extends Edificio {

    private List<String> clientes;
    private int maximo;

    /**
     *
     * @param d direcion de el hotel
     * @param np numero de plantas de el hotel
     * @param m numero maximo de clientes
     */
    public Hotel(String d, int np, int m) throws IllegalArgumentException {
        super(d, np);
        if(m<0){
        
            throw new IllegalArgumentException("El numero de clientes no puede ser negativo"); 
        }
        
        this.maximo = m;
    }

    /**
     *
     * @param c nombre de el cliente a añadir
     */
    public void añadirCliente(String c) throws IllegalStateException{
        
        if(this.clientes.size()>this.maximo){
        
            throw new IllegalStateException("Te has pasado del numero de clientes maximos"); 
        }

        this.clientes.add(c);
    }

    /**
     *
     * @param c nombre del cliente a quitar
     */
    public void retirarCliente(String c) throws NoSuchElementException{
        
        if(this.clientes.contains(c)){

        this.clientes.remove(c);
        }
        else{
        
            throw new NoSuchElementException("No existe ningun cliente con ese nombre");
        }
    }

}
