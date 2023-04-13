import java.util.Arrays;

/*Diseñar la clase Futbolista con los siguientes atributos: dni, nombre,
 * edad, y numero de goles. Implementar:
 * 
 * ■ Un cosntructor y los metodos toString() y equals() (este ultimo ba-
 * sado en el DNI).
 * 
 * ■ La interfac Comparable con un criterio de ordenación basado también
 * en el DNI.
 * 
 * ■ Un comparador para hacer ordenaciones basadas en el nombre y otro
 * basado en la edad.
 * 
 * ■ Crear una tabla con 5 futbolistas y mostrarlos ordenados por DNI,
 * por nombre y por edad.
 */
public class App {
    public static void main(String[] args) throws Exception {
      
            Futbolista[]futbolistas = new Futbolista[5];
            futbolistas[0] = new Futbolista("7895A", "Pepe", 24, 55);
            futbolistas[1] = new Futbolista("5432B", "Paco", 22, 31);
            futbolistas[2] = new Futbolista("6578N", "Futre", 27, 26);
            futbolistas[3]= new Futbolista("8675M", "Romario", 26, 45);
            futbolistas[4]= new Futbolista("8674Z", "Pedro", 23, 46);

            Arrays.sort(futbolistas);
            System.out.println("Ordenado por DNI: ");
            for(Futbolista f : futbolistas){
                System.out.println(f);
            }
            
            System.out.println("ORDENADOR POR EDAD");
            Arrays.sort(futbolistas, new comparadorEdad());
            for(Futbolista f : futbolistas){
                System.out.println(f);
            }
            System.out.println("\nOrdenados por DNI, por nombre y por edad");
            Arrays.sort(futbolistas, new comparadorEdadyDNI());
            
    }
}
