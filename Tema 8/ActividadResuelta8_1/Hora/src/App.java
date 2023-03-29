import java.util.Scanner;

/*Diseñar la calse Hora, que representa un instante de tiempo compuesto por la
 * hora(de 0 a 23) y los minutos. Dispone de los métodos:
 * 
 * █    Hora(hora, minuto), que construye un objeto con los datos pasados como
 * parámetros.
 * 
 * █    void inc(), que incrementa la hora en un minuto.
 * 
 * █    boolean setMinutos(valor), que asigna un valor, si es valido, a los mi-
 * nutos. Devuelve true o false según haya sido posible modificar los minutos 
 * o no.
 * 
 * █    boolean setHora(valor), que asigna un valor, si está comprendido entre
 * 0 y 23, a la hora. Devuelve true o false según haya sido posible cambiar la
 * hora o no.
 * 
 * █    String toString(), que devuelve un String con la representacion de la
 * hora.
 */






public class App {
    public static void main(String[] args) throws Exception {
        //vamos a probar a clase Hora:
        Hora r = new Hora(11, 30);//las 11:30
        System.out.println(r);
        for(int i = 1; i <= 61; i++){//incrementamos 61 minutos.
            r.inc();

        }
        System.out.println(r);//mostramos.
        System.out.println("Escriba una hora: ");
        int hora = new Scanner(System.in).nextInt();
        boolean cambio = r.setHora(hora);//cambiamos la hora.
        if(cambio){
            System.out.println(r);
        }else{
            System.out.println("La hora no se pudo cambiar");
        }
    }
}
