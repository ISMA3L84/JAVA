import java.util.Scanner;
/*ACTIVIDAD RESUELTA 9.1

   Definir la interfaz Cola para números enteros, e implementarla en la clase
 * Lista.
 * 
 * SOLUTION:
 * Nosotros, en esta implementación, decidimos que la cabeza de la cola co-
 * incida con el principio de la lista y el final de la cola con el final
 * de la lista, pero se puede hacer al contrario.
 * 
 * 
 * 
 * ACTIVIDAD RESUELTA 9.2
 * Utilizando la lista anterior, escribir un programa en el que se encolen
 * numeros enteros introducidos por teclado, hasta que se introduzca uno 
 * negativo. A continuación, desencolarlos todos a medida que se muestran
 * por pantalla.
 * 
 * 
 * ACTIVIDAD RESUELTA 9.3
 * Definir la interfac Pila para números enteros.
 * 
 * 
 * ACTIVIDAD RESUELTA 9.4
 * Añadir en la clase Lista la implementacion de la interfaz Pila, junto a 
 * la interfaz Cola, ya implementada.
 * 
 * 
 * ACTIVIDAD RESUELTA 9.5
 * Implementar un programa en el que, usando una Cola anónima, se encolan
 * números enteros hasta que se introduce un valor negativo. luego se de-
 * sencolan todos los valores mostrándolos por pantalla.
 * SOLUTION:
 * En el ejemplo, en vez de implementar la cola en una lista, construimos
 * una lista dentro de la clase anónima y la ussamos para guardar en ella
 * los elementos insertados.
 * 
 * ACTIVIDAD RESUELTA 9.6
 * Implementar, en la interfac Cola, el método encolarMúltiple(), que en-
 * cole un mismo elemento varias veces seguidas.
 */
public class App {
    public static void main(String[] args) throws Exception {
      Lista c = new Lista();
       System.out.println("iNTRODUCIR NUMERO: ");
       Integer n = new Scanner (System.in).nextInt();
       while (n >= 0){
        c.encolar(n);
        System.out.println("Introducir numero: ");
        n = new Scanner(System.in).nextInt();
       }
       n = c.desencolar();
       while (n != null){ //la cola vacia devuelve null al desencolar.
        System.out.println(n + " ");
        n = c.desencolar();
       }
       System.out.println("");
    }
    

}

