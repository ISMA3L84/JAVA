/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadresuelta7_5;

/**
 *
 * @author ISMAEL FERNANDEZ
 */
public class CuentaCorriente {

  Gestor gestor;

    public CuentaCorriente(String dni, String nombre, Gestor gestor) {
        this(dni, nombre);
        this.gestor = gestor;
    }
    void setGestor(Gestor gestor){
        this.gestor = gestor;
    }
    void mostrarInformacion(){
        if(gestor == null){
            System.out.println("Cuenta sin gestor");
        }else{
            System.out.println("Informacion del gestor");
            gestor.mostrarInformacion();
        }
        System.out.println("Informacion de la cuenta");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dni: " + dni);
        System.out.println("Saldo: " + saldo);
    }
  
}
