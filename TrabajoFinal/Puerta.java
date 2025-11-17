public class Puerta {
    protected boolean abierta = false;
    protected boolean obstaculo = false;

   public void abrir() {
    if (abierta) {
        System.out.println("La puerta ya está abierta.");
    } else {
        System.out.println("Abriendo puerta...");
        abierta = true;
    }
}

       public void cerrar() {
        if (abierta) {
            System.out.println("La puerta ya está cerrada.");
        } else if (obstaculo) {
            System.out.println("ERROR: No se puede cerrar. Sensor detecta obstáculo.");
        } else {
            System.out.println("Cerrando puerta...");
            abierta = false;
        }
    }
       public void detectarObstaculo(boolean obstaculo) {
        this.obstaculo = obstaculo;
        if (obstaculo) {
            if (abierta) {
                System.out.println("SEGURIDAD: Obstáculo detectado. Puertas forzadas a permanecer abiertas.");
            }
   }
  }
}

    