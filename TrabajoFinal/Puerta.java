/* Clase Puerta: controla la apertura y cierre de la puerta del ascensor usando un sensor de obstáculos.*/
public class Puerta {

    /* Indica si la puerta está abierta. */
    protected boolean abierta = false;

    /* Sensor usado para detectar obstáculos. */
    protected SensorObstaculo sensor;

    public Puerta(SensorObstaculo sensor) {
        this.sensor = sensor;
    }

    /* Abre la puerta si no está ya abierta. */
    public void abrir() {
        if (abierta) {
            System.out.println("La puerta ya está abierta.");
        } else {
            System.out.println("Abriendo puerta...");
            abierta = true;
        }
    }

    /*
     * Intenta cerrar la puerta. Si el sensor detecta un obstáculo, se cancela el
     * cierre.
     */
    public void cerrar() {
        if (sensor.isActivado()) {
            System.out.println("ERROR: No se puede cerrar. Sensor detecta obstáculo.");
            return;
        }

        if (!abierta) {
            System.out.println("La puerta ya está cerrada.");
        } else {
            System.out.println("Cerrando puerta...");
            abierta = false;
        }
    }

    public boolean isAbierta() {
        return abierta;
    }
}
