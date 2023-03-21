/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadresuelta7_2;

/**En la clase CuentaCorriene, sobrecargar los constructores para poder crear
 * objetos.
 * Con el DNI del titular de la cuenta y su saldo inicial.
 * Con el DNI, nombre y el saldo inicial.
 * 
 * Escribir un programa que compruebe el funcionamiento de los métodos.
 *
 * @author ISMAEL FERNANDEZ
 */
public class ActividadResuelta7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c;
        c = new CuentaCorriente("123456789-A", "Pepe");
        c.ingreso(1000);
        c.egreso(300);
        c.mostrarInformacion();
        System.out.println("Puedo sacar 700 euros: " + c.egreso(700));
        System.out.println("Puedo sacar 500 euros: " + c.egreso(500));
        
        c = new CuentaCorriente("98765432-Z", 2000);
        c.mostrarInformacion();
        
    }   
    
}
