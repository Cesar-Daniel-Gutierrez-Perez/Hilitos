/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilitos;

/**
 *
 * @author perez
 */
/* Clase que define las características de un objeto

* que denominaremos Hilo e imprime el nombre y tiempo de espera

*/

public class hilos extends Thread {
    private String nombre;
    private int retardo;
    // Constructor para inicializar el nombre del hilo y tiempo de retardo
    public hilos( String s,int d ) {
        nombre = s;
        retardo = d;
    }
    // El metodo run() ejecuta
    // threads. Cuando run() termina el thread muere
    public void run() {
        // Con el método sleep retrasamos la ejecución el tiempo especificado
        try {
        sleep( retardo );
        } 
        catch( InterruptedException e ) {
        }
    // Imprimimos el nombre y tiempo que hemos retardado el hilo
    System.out.println( "Prueba Hilos: "+nombre+" "+retardo);
    }
}