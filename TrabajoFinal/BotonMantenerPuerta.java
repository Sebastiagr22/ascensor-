/*Clase BotonMantenerPuerta: botón encargado de mantener la puerta abierta.*/
public class BotonMantenerPuerta extends Boton {

    /*Se refiere a la puerta del ascensor */
    private Puerta puerta;

    public BotonMantenerPuerta(Puerta puerta) {
        super();
        this.puerta = puerta;
    }

    /*Esto se encarga de mantener la puerta abierta al presionar el boton*/
    @Override
    public void presionar() {
        super.presionar();
        System.out.println("Botón de mantener puerta presionado");
        puerta.abrir(); /* fuerza a que la puerta quede abierta */
    }
}
