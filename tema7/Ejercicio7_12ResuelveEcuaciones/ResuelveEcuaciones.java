package ResuelveEcuaciones.java;
/*Para calcular  las soluciones de una ecuacion de segundo grado hay que 
 * aplicar una sencilla formula. El único inconveniente es comprobar que
 * no existan divisiones por 0 o que no calculemos la raiz cuadrada de un
 * número negativo. Estos errores producen una parada de la ejecucion del
 * programa.
 */

import java.util.Locale;
import java.util.Scanner;

public class ResuelveEcuaciones{
   private double A, B, C; //coeficientes AX² + BX + C = 0. 
   private double X1, X2, D;// Soluciones y Discriminante.
    
    
    
    public void Ecuacion(){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ITALIAN);
        double A, B, C; 
        double X1, X2, D;
        System.out.println("Introduzca primer coeficiente: (A): ");
        this.A = sc.nextDouble();
        System.out.println("Introduzc segundo coeficiente: (B): ");
        this.B = sc.nextDouble();
        System.out.println("Introduzca tercer coeficiente: (C): ");
        this.C = sc.nextDouble();
        

    }
    public void Discriminante(){
        //Calculamos el Discriminante
        this.D = (B * B - 4 * A * C);
        if(D < 0){//Como hay que calcular la raiz cuadrada de D, este no
            //puede ser negativo.
            System.out.println("No hay solucion posible");

        }else{
            //Si A = 0 se produce una division por 0. Y en este caso, ni
            //siquiera sería una ecuación de segundo grado.
            if (A == 0){
                System.out.println("No es una ecuacion de segundo grado");
            }else{
                this.X1 = (-B + Math.sqrt(D)) / (2 * A);//.srqt() calcula la 
                //raiz cuadrada.
                this.X2 = (-B - Math.sqrt(D)) / (2 * A);
                System.out.println("Solucion 1: " + X1);
                System.out.println("Solucion 2: " + X2);
            }
        }
    }











}
