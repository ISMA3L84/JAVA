/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadresuelta7_2;

/**
 *
 * @author ISMAEL FERNANDEZ
 */
public class CuentaCorriente {
    String dni;
    String nombre;
    double saldo;
    
    
    


   

     CuentaCorriente(String dni, String nombre) {
         this.dni = dni;
         this.nombre = nombre;
         saldo = 0;
    }
     boolean egreso(double cant){
         boolean operacionPosible;
         if (saldo >= cant){
             saldo -= cant;
             operacionPosible = true;
             
         }else{
             System.out.println("No hay un duro");
             operacionPosible = false;
         }
        return (operacionPosible);
     }
     void ingreso (double cant){
         saldo += cant;
     }
     void mostrarInformacion(){
         System.out.println("Nombre: " + nombre);
         System.out.println("DNI: " + dni);
         System.out.println("Saldo: " + saldo + " euros");
     }
     CuentaCorriente(String dni, double saldo){
         this.dni = dni;
         this.nombre = nombre;
         this.saldo = saldo;
     }

   
    
    
}
