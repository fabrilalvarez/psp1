/**
 * Programa en Java que cree dos hilos y los ejecuta. Los hilos escriben diez
 * veces un número de iteración del bucle y su nombre. En cada iteración,
 * después de escribir su nombre, se bloquean durante un tiempo aleatorio de
 * segundos y después vuelven a estar disponibles para su ejecución.
 */
package ejercicio1;

/**
 *
 * @author Fran Abril Alvarez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se crean dos clases cada una ejecutada en un hilo distinto.
        claseConThread primera = new claseConThread();
        claseConThread segunda = new claseConThread();
        // se ejecutan los hilos de la clase.
        primera.start();
        segunda.start();
    }

}
