import java.util.Scanner;

/*A partir de la clase Hora, implementar la clase HoraExacta, que incluye en la
 * hora los segundos. Además de los métodos heredados de Hora, dispondrá de:
 * 
 * ██ HoraExacta(hora, minuto, segundo), que construye un objeto con los datos
 * pasados como parámetros.
 * 
 * ██ setSegundo(valor), que asigna, si está comprendido entre ' 0 y 59', el
 * valor indicado a los segundos.
 * 
 * ██ inc(), que incrementa la hora en un segundo.
 */


public class App {
    

    public static void main(String[] args) throws Exception {
        HoraExacta r = new HoraExacta(11, 15, 23);//hora del descanso!!.
        System.out.println(r);
        for(i = 1; i <= 61; i++){
            r.inc();
        }
        System.out.println(r);
        System.out.println("Escriba los segundos: ");
        int segundos = new Scanner(System.in).nextInt();
        if(r.setSegundos(segundos)){
            System.out.println(r);
        }else{
            System.out.println("No es posible cambiar los segundos");
        }
    }
}
