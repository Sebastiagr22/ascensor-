public class Boton {
    protected boolean iluminado = false;
    protected boolean presionado = false;

    public void presionar (){
        this.presionado = true;
        this.ilumunar ();
    }
    public void ilumunar(){
        this.iluminado = true;
        System.out.println("Boton iluminado");
    }
    public void apagar(){
        this.iluminado = false;
        System.out.println("boton apagado");
    }
    public boolean isPresionado (){
        return presionado;
    }
     public boolean isIluminado (){
        return iluminado;
    }

}