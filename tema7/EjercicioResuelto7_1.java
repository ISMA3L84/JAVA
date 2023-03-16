/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema7;

/**
 *
 * @author JAVA
 */
public class EjercicioResuelto7_1 {
    
    public static void main(String[] args){
    CuentaCorriente c;
    c = new CuentaCorriente("12345678A","CASIANO");
    c.ingreso(1000);
    c.egreso(400);
    c.mostrarInfo();
        System.out.println("\nPuedo sacar 700 euros: " + c.egreso(700));
        System.out.println("\nPuedo sacar 500 euros: " + c.egreso(500));
    }
}
