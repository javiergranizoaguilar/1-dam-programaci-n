/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class Sorteo {

    private double dineroCupon;
    private int pagosRealizados;
    private int pagosPendientes;
    private int totalParticipantes;
    private double dineroRecogido;

    /**
     * Crea un sorteo conel valor de cada cupon y el numero de personas que van
     * a participar
     *
     * @param dineroCupon
     * @param totalPersonas
     */
    public Sorteo(double dineroCupon, int totalPersonas) {

        this.dineroCupon = dineroCupon;
        this.totalParticipantes = totalPersonas;
        this.dineroRecogido = 0;
        this.pagosPendientes = totalPersonas;
        this.pagosRealizados = 0;

    }

    /**
     * regristra un pago lo que provoca que aumenten los pagos realizados y
     * disminullan los pagos pendientes, tambien calcula el dinero que se a
     * recolectado con los pagos realizados
     */
    public void registrarPago() {

        this.pagosRealizados++;
        this.pagosPendientes--;
        this.dineroRecogido = (this.pagosRealizados * this.dineroCupon);
    }

    /**
     * añade un nuevo participante y aumenta el numero de pagos pendientes
     */
    public void apuntarNuevoParticipante() {

        this.totalParticipantes++;
        this.pagosPendientes++;
    }

    /**
     * devuelve el dinero que vala cada cupon
     *
     * @return
     */
    public double getdineroCupon() {

        return this.dineroCupon;
    }

    /**
     * devuelve numero de participantes
     *
     * @return
     */
    public int getTotalPaticipantes() {

        return this.totalParticipantes;
    }

    /**
     * devuelve el numero de pagos realizados
     *
     * @return
     */
    public int getPagosRealizados() {

        return this.pagosRealizados;
    }

    /**
     * devuelve el numero de pagos pendientes
     *
     * @return
     */
    public int getPagosPendientes() {

        return this.pagosPendientes;
    }

    /**
     * devuelve el dinero recaudado en vase a los pagos realizados y el valor de
     * el cupon
     *
     * @return
     */
    public double getDineroRecojido() {

        return this.dineroRecogido;
    }

    /**
     *  
     * @param dineroCupon
     */
    public void setDineroCupon(double dineroCupon) {

        this.dineroCupon = dineroCupon;
    }

    /**
     *
     * @param dineroRecogido
     */
    public void setDineroRecojido(double dineroRecogido) {

        this.dineroRecogido = dineroRecogido;
    }

    /**
     *
     * @param totalParticipantes
     */
    public void setTotalPaticipantes(int totalParticipantes) {

        this.totalParticipantes = totalParticipantes;
    }

    /**
     *
     * @param pagosRealizados
     */
    public void setPagosRealizados(int pagosRealizados) {

        this.pagosRealizados = pagosRealizados;
    }

    /**
     *
     * @param pagosPendientes
     */
    public void setPagosPendientes(int pagosPendientes) {

        this.pagosPendientes = pagosPendientes;
    }
    
    /**
     * devuelve todos los parametros en forma de String
     * @return
     */
    @Override
    public String toString(){
        String aux;
            aux="el precio de el voleto es de "+this.dineroCupon;
            aux+=" el dinero recojido es "+this.dineroRecogido;
            aux+=" el numero de pagos realizados es "+this.pagosRealizados;
            aux+=" el numero de pagos pendientes es "+this.pagosPendientes;
            aux+=" el numero de participantes es "+this.totalParticipantes;
        return aux;
    }
}
