/*la clase boton piso se refiere al
bototon que esta ubicado en un piso del edificio.
este solicita al ascensor subir o bajar desde el piso */

public class BotonPiso extends Boton {

    /* numero de pisos donde esta el boton */
    protected int piso;

    /* indica si el boton es para subir o bajar */
    protected boolean subir;

    public BotonPiso(int piso, boolean subir) {
        this.piso = piso;
        this.subir = subir;
    }

    /* Cuando se presiona, además de iluminar el botón,
       muestra la solicitud que hace el usuario.*/
    @Override

    public void presionar() {
        super.presionar();
        String direccion;
        if (subir) {
            direccion = "Subir";
        } else {
            direccion = "Bajar";
        }
        System.out.println("Solicitud en piso " + piso + " dirección: " + direccion);
    }
}
