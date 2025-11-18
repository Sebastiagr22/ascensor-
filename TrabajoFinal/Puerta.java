public class Puerta {
    protected boolean abierta = false;
    protected SensorObstaculo sensor;

    public Puerta(SensorObstaculo sensor) {
        this.sensor = sensor;
    }

    public void abrir() {
        if (abierta) {
            System.out.println("La puerta ya está abierta.");
        } else {
            System.out.println("Abriendo puerta...");
            abierta = true;
        }
    }

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
