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
    c = new CuentaCorriente("12345678A","Pepe");
    c.ingreso(1000);
    c.egreso(300);
    c.mostarInfo();
        System.out.println("Puedo sacar 700 euros" + c.egreso(700));
        System.out.println("Puedo sacar 500 euros: " + c.egreso(500));
    }
}
