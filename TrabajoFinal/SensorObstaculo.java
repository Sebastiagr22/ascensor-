/*Clase SensorObstaculo: Detecta si hay obstáculos en la puerta.*/
public class SensorObstaculo {

    /** Indica si el sensor está activado (obstáculo detectado). */
    protected boolean activado = false;

    /** Activa el sensor (detecta obstáculo). */
    public void activar() {
        activado = true;
    }

    /** Desactiva el sensor (libre de obstáculos). */
    public void desactivar() {
        activado = false;
    }

    public boolean isActivado() {
        return activado;
    }
}
