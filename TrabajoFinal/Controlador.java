/*
 Clase Controlador: coordina el ascensor y la puerta.
 Recibe solicitudes y controla el flujo básico.
 */
public class Controlador {

    /* Referencia al ascensor. */
    protected Ascensor ascensor;

    /* Referencia a la puerta. */
    protected Puerta puerta;

    public Controlador(Ascensor ascensor, Puerta puerta) {
        this.ascensor = ascensor;
        this.puerta = puerta;
    }

    /* Solicita movimiento hacia un piso, indicando si debe subir o bajar. */
    public void solicitar(int pisoObjetivo, boolean subir) {
        ascensor.cambiarDireccion(subir);
        ascensor.iniciarMovimiento();

        ascensor.mover(); // mueve un piso

        if (ascensor.getPisoActual() == pisoObjetivo) {
            ascensor.parar();
            puerta.abrir();
        }
    }

    public void cerrarPuerta() {
        puerta.cerrar();
    }
}
