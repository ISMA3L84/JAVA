import java.util.Scanner;
/*Crea una clase que sea capaz de mostrar el importe de un cambio, por ejemplo, al
 * realizar una compra, con el menor numero de monedas y billetes posibles.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Cambio c = new Cambio();
        System.out.println("introduzca el importe de su compra: ");
        double importe = sc.nextDouble();
        System.out.println("Introduce el importe con el que va a pagar: ");
        double pago = sc.nextDouble();
        double cambio = pago - importe;
        if (importe > pago) {
            System.out.println("El importe de su compra es mayor que lo que me estas dando, soo liiistooo");

        } else {
            c.generarCambio(cambio);
            c.generarDevolucion();
                
        
            
           
        }
    }
}
