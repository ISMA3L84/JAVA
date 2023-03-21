/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadresuelta7_9;

/**Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda 
 * encender o apagar individualmente. Para ello, hacer una clase Bombilla con
 * una variable privada que indique si está encendida o apagada, así como un me-
 * todo que nos diga el estado de una bombilla concreta. Además, queremos poner
 * un interruptor general, de forma que si este se apaga, todas las bombillas
 * quedan apagadas. Cuando el interruptor general se activa, las bombillas vu-
 * elven a estar encendidas o apagadas, según estuvieran antes. Cada bombilla se
 * enciende y se apaga individualmente, pero solo responde que está encendida si
 * su interruptor particular está activado y además hay luz general.
 *
 * @author JAVA
 */
public class ActividadResuelta7_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bombilla b1, b2;
        b1 = new Bombilla();
        b2 = new Bombilla();
        b1.enciende();
        b2.apaga();
        System.out.println("b1: " + b1.muestraEstado());
        System.out.println("b2: " + b2.muestraEstado());
        Bombilla.interruptorGeneral = false;
        System.out.println("\nActivamos la luz general");
        System.out.println("b1: " + b1.muestraEstado());
        System.out.println("b2: " + b2.muestraEstado());
        
    }
    
}
