/*la clase boton, representa al boton generico
del ascensor, y este tiene dos estados, iluminado y presionado */
public class Boton {

    /* indica si el boton esta iluminado */
    protected boolean iluminado = false;

    /* indica si el boton esta presionado */
    protected boolean presionado = false;

    /* metodo que presiona el boton e ilumina el mismo */
    public void presionar() {
        this.presionado = true;
        this.ilumunar();
    }

    /* prende la luz del boton */
    public void ilumunar() {
        this.iluminado = true;
        System.out.println("Boton iluminado");
    }

    /* apaga la luz del boton */
    public void apagar() {
        this.iluminado = false;
        System.out.println("boton apagado");
    }

    public boolean isPresionado() {
        return presionado;
    }

    public boolean isIluminado() {
        return iluminado;
    }

}