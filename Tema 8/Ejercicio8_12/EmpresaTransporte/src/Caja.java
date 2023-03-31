/*Las empresas de transporte, para evitar daños en los paquetes, embalan todas sus mercancias
 * en cajas con el tamaño adecuado. Una caja se crea expresamente con un ancho, un alto y un
 * fondo. Una vez creada, se mantiene inmutable. Cada caja lleva pegada una etiqueta, de un
 * maximo de 30 caracteres, con informacion útil como el nombre del destinatario, direccion,
 * etc. Implementa la clae Caja con los siguientes métodos:
 * 
 *  ■ Caja (int ancho, int alto, int fondo, Unidad unidad): que construye una caja con las
 * dimensiones especificadas, que pueden encontrarse en cms(centimetros) o m (metros).
 * 
 *  ■ double getVolumen(): devuelve el volumen de la caja en metros cúbicos.
 * 
 *  ■ void setEtiqueta(String etiqueta): modifica el valor de la etiqueta de la caja.
 * 
 *  ■ String toString(): que devuelve una cadena con la representacion de la caja.
 * 
 * 
 */

public class Caja {
    protected int ancho;
    protected int alto;
    protected int fondo;
    protected double anchoDouble;
    protected double altoDouble;
    protected double fondoDouble;
    protected Unidad unidad;

    public Caja() {

    }

    public Caja(int ancho, int alto, int fondo, Unidad cms) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        unidad = cms;

    }

    public Caja(double anchoDouble, double altoDouble, double fondoDouble, Unidad m) {
        this.anchoDouble = anchoDouble;
        this.altoDouble = altoDouble;
        this.fondoDouble = fondoDouble;
        unidad = m;
    }

    public double getVolumen() {
        return  ancho * alto * fondo;
        

    }

   
    public String toString() {
        System.out.println("********************ATRIBUTOS DE CAJA********************");
        String cadena = "";
        cadena = cadena + "Ancho: " + ancho + "\n";
        cadena = cadena + "Alto: " + alto + "\n";
        cadena = cadena + "Fondo: " + fondo + "\n";
        cadena = cadena + "Unidad: " + unidad + "\n";
        cadena = cadena + "Volumen: " + getVolumen() + " centimetros cubicos" + "\n";
        return cadena;

    }

}
