/*Añadir a la actividad de la aplicación 9.13 un comparador que ordene los
 * futbolistas por edades y, para aquellos que tienen la misma edad, por nom-
 * bres.
 */
import java.util.Arrays;
import java.util.Comparator;
public class App {
    public static void main(String[] args) throws Exception {

        comparadorEdad CE = new comparadorEdad();
        comparadorNombre CN = new comparadorNombre();
        comparadorDni CD = new comparadorDni();
        Futbolista[] F1 = new Futbolista[] {
                new Futbolista("0657589M", "Paco", 24, 5),
                new Futbolista("0516237N", "Peterson", 23, 8),
                new Futbolista("0362547A", "Donald", 26, 3),
                new Futbolista("0965874W", "Ronald", 29, 12),
                new Futbolista("0965214Z", "Casiano", 21, 11),
        };
       
        Arrays.sort(F1);
        System.out.println(Arrays.deepToString(F1));
    
    }
}
