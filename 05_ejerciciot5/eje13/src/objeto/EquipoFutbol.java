package objeto;

import java.util.List;


/**
 *
 * @author javier granizo <javiercelia123@gmail.com>
 */
public class EquipoFutbol {

    private String nombre;
    private List<Empleado> empleados;
    private double presuspuesto;

    public EquipoFutbol(String n, double p) {

        this.nombre = n;
        this.presuspuesto = p;
    }

    public List<Empleado> getEmpleados() {

        return this.empleados;
    }

    public double getPresuspuesto() {

        return this.presuspuesto;
    }

    public void addEmpledo(Empleado e) throws IllegalArgumentException {

        int num = 0;
        int n = 0;
        while (n < this.empleados.size()) {

            if (this.empleados.get(n) instanceof Entrenador) {

                throw new IllegalArgumentException("ya tienes un entrenador y no puedes tener mas");

            }
            if (this.empleados.get(n) instanceof Futbolista) {

                num++;
                if (num >= 25) {

                    throw new IllegalArgumentException("ya tienes 25 jugadores y no puedes tener mas");
                }
            }
            n++;
        }
        this.empleados.add(e);

    }

    public void pagarSueldoEmpleados() {

        int n = 0;
        while (n < this.empleados.size()) {

            if (this.empleados.get(n) instanceof Entrenador) {

                if (this.empleados.get(n) instanceof EmpleadoPrimable) {

                    try {
                        this.empleados.get(n).cobrar((this.empleados.get(n).getSueldo()) * 1.1);
                        this.presuspuesto -= ((this.empleados.get(n).getSueldo()) * 1.1);
                    } catch (CabreoException e) {

                        System.out.println(e.getMessage());
                    }
                } else {
                    try {
                        this.empleados.get(n).cobrar(this.empleados.get(n).getSueldo());
                        this.presuspuesto -= (this.empleados.get(n).getSueldo());
                    } catch (CabreoException e) {

                        System.out.println(e.getMessage());
                    }
                }
            }
            if (this.empleados.get(n) instanceof Futbolista) {

                if (this.empleados.get(n) instanceof EmpleadoPrimable) {

                    try {
                        this.empleados.get(n).cobrar((this.empleados.get(n).getSueldo()) * 1.1);
                        this.presuspuesto -= ((this.empleados.get(n).getSueldo()) * 1.1);
                    } catch (CabreoException e) {

                        System.out.println(e.getMessage());
                    }
                } else {
                    try {
                        this.empleados.get(n).cobrar(this.empleados.get(n).getSueldo());
                        this.presuspuesto -= (this.empleados.get(n).getSueldo());
                    } catch (CabreoException e) {

                        System.out.println(e.getMessage());
                    }

                }
            }
            if (this.empleados.get(n) instanceof CuerpoTecnico) {

                try {
                    this.empleados.get(n).cobrar(this.empleados.get(n).getSueldo());
                    this.presuspuesto -= (this.empleados.get(n).getSueldo());
                } catch (CabreoException e) {

                    System.out.println(e.getMessage());
                }
            }

        }
    }

}
