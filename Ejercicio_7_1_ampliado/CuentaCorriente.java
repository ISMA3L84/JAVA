/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_7_1_ampliado;

/**
 *
 * @author JAVA
 */
public class CuentaCorriente {
  String dni;
  String nombre;
  double saldo;
  
  public CuentaCorriente(String dni, String nombre, double saldo){
      this.dni = dni;
      this.nombre = nombre;
      this.saldo = saldo;
      
              
  }
  public CuentaCorriente(){
      
  }
  void mostrarSaldo(double saldo){
      System.out.println(nombre + " tienes un saldo de: " + saldo);
  }
  void ingresarCuartos(double ingreSaldo){
      saldo  += ingreSaldo;
              
  }
}
