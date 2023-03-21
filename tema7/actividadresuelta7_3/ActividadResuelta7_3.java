/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadresuelta7_3;

/**Modificar la visibilidad de la clase CuentaCorriente para que sea visible
 * desde clases externas y la visibilidad de sus atributos para que:
 * 
 *  SALDO no sea visible para otras clases.
 *  NOMBRE sea público para cualquier clase.
 *  DNI solo sea visible por clases vecinas.
 * 
 * Realizar un programa para comprobar la visibilidad de los atributos.
 * @author ISMAEL FERNANDEZ
 */
public class ActividadResuelta7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c;
        c = new CuentaCorriente("123456789-A", "Pepe");
        c.saldo = 2000;
        c.dni = "1111111-T";
        c.nombre = "Antonio";
     
        
    }   
    
}
