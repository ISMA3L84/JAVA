/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadresuelta7_7;

/**Diseñar la clase Texto que gestiona una cadena de caracteres con algunas ca-
 * racterísticas:
 * ۞ Permite añadir un caracter al principio o al final, siempre y cuando no se
 * exceda la longitud maxima, es decir, exista espacio disponible.
 * 
 * ۞ Igualmente, permite añadir una cadena, al principio o al final del texto,
 * siempre y cuando no se rebase el tamaño maximo establecido.
 * 
 * ۞ Es necesario saber cuantas vocales(mayusculas y minusculas) hay en el texto
 * 
 * ۞ Cada objeto de tipo texto tiene que conocer la fecha en la que se creó, asi
 * como la fecha y hora de la ultima modificacion efectuada.
 * 
 * ۞ Deberá existir un método que muestre la informacion que gestiona cada texto
 * 
 *
 * @author JAVA
 */
public class ActividadResuelta7_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Texto t = new Texto(5);
        t.addPrincipio("HO");
        t.addPrincipio(';');
        t.addFinal("Lá");
        t.addFinal('X');
        t.mostrar();
        System.out.println("Numero de vocales: " + t.numVocales());
    }
    
}
