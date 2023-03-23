/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema7;

/**Diseñar la clase CuentaCorriente, que almacena los datos: DNI y nombre
 * del titular, así como el saldo. Las operaciones típicas con una cuenta
 * corriente:
 * ֎    Crear una cuenta: se ecesita el DNI y el nombre del titular. El 
 * saldo inicial será 0.
 * 
 * ֎    Sacar dinero: el metodo debe indicar si ha sido posible llevar a
 * cabo la operación, si existe saldo suficiente.
 * 
 * ֎    Ingresar dinero: Se incrementa el saldo.
 * 
 * ֎    Mostrar información: Muestra la información disponible de la cu-
 * enta corriente.
 *
 * @author JAVA
 */
public class CuentaCorriente {

  String dni;
  String nombre;
  double saldo;
  CuentaCorriente(String dni, String nombre){
      this.dni = dni;
      this.nombre = nombre;
      saldo = 0;
        
    }
    boolean egreso(double cant){
        boolean sacarCuartos;
        if(saldo >= cant){
            saldo -= cant;
            sacarCuartos = true;
        }else{
            System.out.println("\nNo tienes un duro");
            System.out.println("Ni de donde te venga");
            sacarCuartos = false;
        }
        return(sacarCuartos);
    }
    void ingreso(double cant){
        saldo += cant;
    }
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Dni: " + dni);
        System.out.println("Saldo: " + saldo + " euros ");
    }
}
