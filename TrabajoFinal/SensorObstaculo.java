public class SensorObstaculo {
    protected boolean activado = false;

    public void activar() {
        activado = true;
    }

    public void desactivar() {
        activado = false;
    }

    public boolean isActivado() {
        return activado;
    }
}

