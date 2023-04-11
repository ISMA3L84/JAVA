import java.util.Scanner;
/*Esta es la clase Main de la Actividad resuelta 9.5 */


public class Main9_5{
    public static void main(String[] args) throws Exception {
        Cola cola = new Cola() {
            Lista L = new Lista(); //aqui guardamos los numeros.
            @Override
            public void encolar(Integer nuevo){
                L.insertarFinal(nuevo);
            }  
            @Override
            public Integer desencolar(){
                return L.eliminar(0);
            }
        };
    
        System.out.println("Introducir numero (negativo para salir):  ");
        Integer n = new Scanner(System.in).nextInt();
        while (n >= 0){
            cola.encolar(n);
            System.out.println("Introducir numero:  ");
            n = new Scanner(System.in).nextInt();

        }
        n = cola.desencolar();
        while (n != null){
            System.out.println(n + " ");
            n = cola.desencolar();
        }
    }

}