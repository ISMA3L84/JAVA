/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7_1_ampliado;

import java.util.Scanner;

/**
 *
 * @author JAVA
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        CuentaCorriente c;
        
          do {
        System.out.println("**************** CAJA RURAL DE CUENCA ****************");
        System.out.println("1- Ingresar Cuartejos");
        System.out.println("2- Retirar Cuartejos");
        System.out.println("3- Pedir una Hipoteca");
        System.out.println("4- Salir de to esto");
        System.out.println("********Elija Opcion********");
        opcion = sc.nextInt();
        

      
            if (opcion == 2) {
                System.out.println("Indique los Cuartos a sacar: ");
                double egreso = sc.nextDouble();

            }
            if (opcion == 1) {
                System.out.println("Indique los Cuartos a ingresar: ");
                double cant = sc.nextDouble();

            }
            if (opcion == 3) {
                System.out.println("En serio? Te has creido lo de la Hipoteca?");
            }

        } while (opcion != 4 && opcion > 4);
        System.out.println("GRACIAS POR CONFIAR EN CAJA RURAL DE CUENCA");
    }

}
