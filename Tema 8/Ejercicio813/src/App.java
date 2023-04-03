import java.util.Scanner;

/*La empresa de mensajeria BiciExpress, que reparte en bicicleta, para dis-
 * minuir el peso que transportan sus empleados, solo utiliza cajas de car-
 * ton. El volúmen de estas se calcula como el 80% del volumen real, con el
 * fin de evitar que se deformen y se rompan. Otra característica de las 
 * cajas de carton es que sus medidas siempre estan en centimetros. Por ul-
 * timo, la empresa, para controlar costes, necesita saber cual es la su-
 * perficie total de carton utilizado para construir todas las cajas.
 * Escribe la clase CajaCarton heredando de la clase Caja.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("******************CREAMOS UNA CAJA NUEVA**************");
        System.out.println("*****LAS MEDIDAS DE LA CAJA SON EXPRESADAS EN CMS*****");
        System.out.println("Introduzca ancho de la caja: ");
        int cmsAncho = sc.nextInt();
        System.out.println("Introduzca el alto de la caja: ");
        int cmsAlto = sc.nextInt();
        System.out.println("Introduzca el fondo de la caja: ");
        int cmsFondo = sc.nextInt();
        CajaCarton cms = new CajaCarton(cmsAncho, cmsAlto, cmsFondo, Unidad.cms);
        System.out.println("\n ----------------------------------------------------");
        System.out.println(cms.Atributos());
        
    }

}  
