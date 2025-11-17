public class Ascensor {
    protected int pisoActual = 1;
    protected boolean subiendo = true;

    protected int inactivo = 0;  
    protected int moviendose = 1;
    protected int detenido = 2;  

    protected int estado = inactivo;

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

    public void iniciarMovimiento() {
        estado = moviendose;
    }

    public void parar() {
        estado = detenido;
        System.out.println("Ascensor detenido en el piso: " + pisoActual);
    }

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
}

