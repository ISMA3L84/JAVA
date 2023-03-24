import java.util.Locale;

/*Crea una clase que sea capaz de mostrar el importe de un cambio, por ejemplo, al
 * realizar una compra, con el menor numero de  monedas y billetes posibles.
 */

public class Cambio {

    private final double moneda[] = {500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};
    private final double[] devolucion = {0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00, 0.00};

    
    
    
    public void generarCambio(double change){
        for(int i = 0; i < moneda.length; i++){
            if(change >= moneda[i]){
                devolucion[i] = Math.floor(change / moneda[i]);
                change -= devolucion[i] * moneda[i];
            }
        }    
        



    }
        public void generarDevolucion(){
            for(int i = 0; i < devolucion.length; i++){
                if(devolucion[i] > 0){
                    if(moneda[i] > 2){
                        System.out.println("Te devuelvo" + devolucion[i] + " billetes de " + moneda[i] + "eur");
                    }else{
                        System.out.println("Te devuelvo" + devolucion[i] + " monedas de " + moneda[i] + "eur");
                    }
                }
            }
        }



}
