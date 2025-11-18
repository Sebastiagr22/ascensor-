public class Controlador {
    protected Ascensor ascensor;
    protected Puerta puerta;

    public Controlador(Ascensor ascensor, Puerta puerta) {
        this.ascensor = ascensor;
        this.puerta = puerta;
    }

    public void solicitar(int pisoObjetivo, boolean subir) {
        ascensor.cambiarDireccion(subir);
        ascensor.iniciarMovimiento();

        ascensor.mover();  // mueve un piso

        if (ascensor.getPisoActual() == pisoObjetivo) {
            ascensor.parar();
            puerta.abrir();
        }
    }

    public void cerrarPuerta() {
        puerta.cerrar();
    }
}
