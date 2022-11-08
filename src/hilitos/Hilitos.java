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
public class Hilitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hilos t1,t2,t3;
        // Creación de los threads con parámetro tiempo aleatorio
        t1 = new hilos( "Hilo 1",(int)(Math.random()*2000));
        t2 = new hilos( "Hilo 2",(int)(Math.random()*2000));
        t3 = new hilos( "Hilo 3",(int)(Math.random()*2000));
        // Arrancamos los threads con el método start
        t1.start();
        t2.start();
        t3.start();
    }
}
