package ejercicio1;

/**
 *
 * @author Fran Abril Alvarez
 */
public class claseConThread extends Thread {

    public void run() {
        // imprime por pantalla diez veces el nombre del hilo
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(i + " " + getName());
                // duerme el hilo durante 500ms
                sleep(500);
                System.out.println("Fin del thread" + getName());
            } catch (InterruptedException ex) {
                System.out.println("Hilo interrumpido");
            }
        }
    }

}
