package ActividadResuelta7_14;
/*Implementar el método no estático:
 * void insertarFinal(int nuevo)
 * Que se inserta un número entero al final de tablaEnteros[], que es un atributo
 * no estático de la clase Main. Escribir un programa que inicialice la tabla con
 * los numeros del 1 al 10 y después la muestre por consola.
 */
import java.util.Arrays;
/*La clase Main puede tener atributos y métodos no estaticos, aunque no podemos
 * invocarlos directamente desde el método Main(), ya que este static, pero sí
 * a través de un objeto de la propia clase Main.
 */
public class Main{
        int[] tablaEnteros = new int[0]; //Creamos un objeto de la clase Main con el
        //constructor por defecto.
        for(int i = 0; i < 10; i++){
        m.insertarFinal(i + 1);
   }
    system.out.println("tabla: " + Arrays.toString(m.tablaEnteros));

    void insertarFinal(int nuevo){//metodo no estático de Main.
    tablaEnteros = Arrays.copyOf(tablaEnteros, tablaEnteros.length + 1);
    tablaEnteros[tablaEnteros.length -1] = nuevo;
}
}