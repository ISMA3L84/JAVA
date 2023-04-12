/*Cambiar la implementación de la clase Socio para que su criterio de
 * ordenación natural sea por orden alfabético creciente de nombres.
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Socio implements Comparable {
    int id; //numero identificativo del socio.
    String nombre;
    LocalDate  fechaNacimiento;
    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        //establecemos el formato español para las fechas:
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }
    public Socio() {
    }
    int edad(){
        return (int)fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
        /*el cast (int) es por que until() devuelve un valor long. Al ser de
         * estrechamiento, en teoría podría suponer una pérdida de información
         * para números muy grandes ( de ahí un warning del compilador) pero,
         * por desgracia, las edades de las personas son enteros muy pequeños.
         */

    }
    @Override
    //la implementacion debe declararse public
    public int compareTo(Object otro){
       return nombre.compareTo(((Socio)otro).nombre);/*se invoca compare
       to() de la clase String */

        
    }
    public String toString(){
        return "Id: " + id + "Nombre: " + nombre + "Edad: " + edad() + "\n";
    }// el salto de linea del final '\n' es para que cada socio vaya en una linea distinta.
    
}