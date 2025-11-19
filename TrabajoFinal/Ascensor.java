/* Clase Ascensor es la que controla la lógica principal del movimiento del ascensor.*/
public class Ascensor {

    /*Piso actual del ascensor (inicia en 1). */
    protected int pisoActual = 1;

    /*Dirección actual: true = subiendo, false = bajando. */
    protected boolean subiendo = true;

    /*Estados del ascensor */
    protected int inactivo = 0;
    protected int moviendose = 1;
    protected int detenido = 2;

    /*Estado actual del ascensor. */
    protected int estado = inactivo;

    /*Mueve el ascensor un piso según su dirección.*/
    public void mover() {
        if (estado == moviendose) {
            if (subiendo) {
                pisoActual = pisoActual + 1;
            } else {
                pisoActual = pisoActual - 1;
            }
            System.out.println("Ascensor moviéndose. Piso actual: " + pisoActual);
        } else {
            System.out.println("Ascensor está " + obtenerEstado() + ". No se mueve.");
        }
    }

    /*Inicia el movimiento del ascensor. */
    public void iniciarMovimiento() {
        estado = moviendose;
    }

    /*para el ascensor. */
    public void parar() {
        estado = detenido;
        System.out.println("Ascensor detenido en el piso: " + pisoActual);
    }

    /* Cambia la dirección del ascensor. 
    nuevaDireccion true = subir, false = bajar.*/
    public void cambiarDireccion(boolean nuevaDireccion) {
        subiendo = nuevaDireccion;
        if (subiendo) {
            System.out.println("Dirección cambiada a: Subir");
        } else {
            System.out.println("Dirección cambiada a: Bajar");
        }
    }

    public void llegarAlPiso(int pisoObjetivo) {
        pisoActual = pisoObjetivo;
        estado = detenido;
        System.out.println("Llegada al piso " + pisoActual + ". Listo para abrir puertas.");
    }

    public String obtenerEstado() {
        if (estado == inactivo) {
            return "inactivo";
        } else if (estado == moviendose) {
            return "moviendo";
        } else {
            return "detenido";
        }
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public boolean isSubiendo() {
        return subiendo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int nuevoEstado) {
        estado = nuevoEstado;
    }
}
