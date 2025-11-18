public class Simulador {
    public static void main(String[] args) {
        System.out.println("--- INICIO DE SIMULACIÓN DEL ASCENSOR ---");

        SensorObstaculo sensor = new SensorObstaculo();
        Puerta puerta = new Puerta(sensor);
        BotonPiso botonPiso5Subir = new BotonPiso(5, true);
        Ascensor ascensor = new Ascensor();

        System.out.println("Piso inicial del ascensor: " + ascensor.getPisoActual());
        System.out.println("Estado inicial de la puerta: " + (puerta.isAbierta() ? "Abierta" : "Cerrada"));

        botonPiso5Subir.presionar();
        puerta.abrir();

        sensor.activar();
        puerta.cerrar(); // Obstáculo detectado, no se cierra

        sensor.desactivar();
        System.out.println("No se encontraron obstáculos, cerrando puerta...");
        puerta.cerrar(); // Ahora sí se cierra

        botonPiso5Subir.apagar();

        ascensor.llegarAlPiso(5); // Llega directo al piso 5

        puerta.abrir();
        System.out.println("No se encontraron obstáculos, cerrando puerta...");
        puerta.cerrar(); // Se cierra normalmente

        System.out.println("--- FIN DE SIMULACIÓN ---");
    }
}
