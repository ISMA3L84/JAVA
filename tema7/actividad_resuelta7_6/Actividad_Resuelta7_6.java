/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_resuelta7_6;

import java.util.Scanner;

/**Escribir un programa que lea por teclado una hora cualquiera y un numero n 
 * que representa una cantidad em segundos. el programa mostrará la hora intro-
 * ducida y las n siguientes, que se diferencian en un segundo. Para ello hemos
 * de diseñar previamente la clase Hora que dispone de los atributos hora, mi-
 * nuto y segundo. Los valores de los atributos se controlarán mediante métodos
 * set/get.
 *
 * @author JAVA
 */
public class Actividad_Resuelta7_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hora h = new Hora();
        System.out.println("Hora: ");
        int valor = sc.nextInt();
        h.setHora(valor);
        System.out.println("Minuto: ");
        valor = sc.nextInt();
        h.setMinuto(valor);
        System.out.println("Segundo: ");
        valor = sc.nextInt();
        h.setSegundo(valor);
        System.out.println("cuantos segundos quiere mostrar??: ");
        int numSegundos = sc.nextInt();
        for (int i = 0; i <= numSegundos; i++) {
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
            h.incrementaSegundo();
            
        }
        
         
    }
    
}
