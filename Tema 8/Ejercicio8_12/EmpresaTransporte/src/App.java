import java.util.Scanner;

public class App {
    /*
     * Las empresas de transporte, para evitar daños en los paquetes, embalan todas
     * sus mercancias
     * en cajas con el tamaño adecuado. Una caja se crea expresamente con un ancho,
     * un alto y un
     * fondo. Una vez creada, se mantiene inmutable. Cada caja lleva pegada una
     * etiqueta, de un
     * maximo de 30 caracteres, con informacion útil como el nombre del
     * destinatario, direccion,
     * etc. Implementa la clae Caja con los siguientes métodos:
     * 
     * ■ Caja (int ancho, int alto, int fondo, Unidad unidad): que construye una
     * caja con las
     * dimensiones especificadas, que pueden encontrarse en cms(centimetros) o m
     * (metros).
     * 
     * ■ double getVolumen(): devuelve el volumen de la caja en metros cúbicos.
     * 
     * ■ void setEtiqueta(String etiqueta): modifica el valor de la etiqueta de la
     * caja.
     * 
     * ■ String toString(): que devuelve una cadena con la representacion de la
     * caja.
     * 
     * 
     */

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("****************CREAMOS UNA CAJA******************");
        System.out.println("Introduzca el ancho de la caja: ");
        int cmsAncho = sc.nextInt();
        System.out.println("Introduzca el alto de la caja: ");
        int cmsAlto = sc.nextInt();
        System.out.println("Introduzca el fondo de la caja: ");
        int cmsFondo = sc.nextInt();
        Caja cms = new Caja(cmsAncho, cmsAlto, cmsFondo, Unidad.cms);
        System.out.println("****************CREAMOS UNA ETIQUETA****************");
        sc.nextLine();
        System.out.println("Nombre Destinatario:");
        String nombre = sc.nextLine();
        System.out.println("Direccion de entrega: ");
        String direccion = sc.nextLine();
        System.out.println("Telefono del Destinatario: ");
        String telefono = sc.next();
        System.out.println("Region de Entrega: ");
        sc.nextLine();
        String region = sc.nextLine();
        Etiqueta e = new Etiqueta(nombre, direccion, telefono, region);
        System.out.println("------------------------------------------------");
        System.out.println(cms.toString());
        System.out.println(e.mostrar());

    }

}
