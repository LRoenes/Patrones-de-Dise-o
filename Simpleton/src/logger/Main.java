/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logger;

/**
 *
 * @author Luis
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            final int numeroHilo = i;

            // Cada hilo es una tarea independiente que corre en paralelo
            Thread hilo = new Thread(new Runnable() {
                @Override
                public void run() {
                    // Obtenemos la instancia del Logger y escribimos
                    Logger logger = Logger.getInstance();
                    logger.log("Mensaje desde el hilo #" + numeroHilo);

                    // Opcional: Imprimimos la dirección de memoria del objeto para verificar 
                    // que todos los hilos obtuvieron EXACTAMENTE la misma instancia
                    System.out.println("Hilo " + numeroHilo + " -> Instancia: " + logger);
                }
            });

            // Lanzamos el hilo
            hilo.start();
        }
    }
}
