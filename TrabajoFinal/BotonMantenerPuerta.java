public class BotonMantenerPuerta extends Boton {
    private Puerta puerta;

    public BotonMantenerPuerta(Puerta puerta) {
        super();
        this.puerta = puerta;
    }

    @Override
    public void presionar() {
        super.presionar();
        System.out.println("Botón de mantener puerta presionado");
        puerta.abrir(); // fuerza a que la puerta quede abierta
    }
}
