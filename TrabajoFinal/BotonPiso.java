public class BotonPiso extends Boton {
    private int piso;
    private boolean subir; 

    public BotonPiso(int piso, boolean subir){
        this.piso = piso;
        this.subir =  subir;
    }
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
