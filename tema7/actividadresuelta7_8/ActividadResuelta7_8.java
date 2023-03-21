/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadresuelta7_8;

/**Definir una clase que permita controlar un sintonizador digital de emisoras
 * FM; concretamente se desea dotar al controlador de una interfac que permita
 * subir (up) o bajar (down) la frecuencia (en saltos de 0,5 MHz) y mostrar la
 * frecuencia sintonizada en un momento dado (display) supondremos que el rango
 * de frecuencias para manejar oscila entre los 80 MHz y los 108 MHz, y que, al
 * inicio, el controlador sintonice la frecuencia indicada en el constructor o
 * 80 MHz por defecto. Si durante una operacion de subida o bajada se sobrepasa
 * uno de los dos limites, la frecuencia sintonizada debe pasar a ser la del ex-
 * tremo contario. Escribir un pequeño programa principal para probar su funcio-
 * namiento.
 *
 * @author JAVA
 */
public class ActividadResuelta7_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SintonizadorFM a, b;
        a = new SintonizadorFM(107);
        a.up(); a.up(); a.up(); a.up();
        a.display();
        b = new SintonizadorFM(200);
        b.down(); b.down(); b.down();
        b.display();
        a = new SintonizadorFM(200);
        a.display();
    }
    
}
