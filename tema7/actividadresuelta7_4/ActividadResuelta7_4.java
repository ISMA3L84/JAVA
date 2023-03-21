/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadresuelta7_4;

/**Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo
 * banco. Añadir un atributo que almacene el nombre del banco (que es unico) en
 * la clase CuentaCorriente.
 * Diseñar un método que permita recuperar y modificar el nombre del banco (al
 * que pertenecen todas las cuentas corrientes).
 * 
 * 
 * @author ISMAEL FERNANDEZ
 */
public class ActividadResuelta7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c1, c2;
        c1 = new CuentaCorriente("123456789-A", "Pepe");
        c2 = new CuentaCorriente("98654321-Z", "Antonio");
        c1.mostrarInformacion();
        CuentaCorriente.setBanco("BCE");
        c1.mostrarInformacion();
        CuentaCorriente.setBanco("BANCO JONES");
        c1.mostrarInformacion();
        c2.mostrarInformacion();
      
     
        
    }   
    
}
