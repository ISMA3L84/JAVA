/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadresuelta7_5;

/**Existen gestores que administran las cuentas bancarias y atienden a sus pro-
 * pietarios. Cada cuenta, en caso de tenerlo, cuenta con un unico gestor. Dise-
 * ñar la clase Gestor de la que interesa guardar su nombre, telefono y el im-
 * porte maximo autorizado con el que pueden operar. Con respecto a los gestores
 * existen las siguientes restricciones:
 * 
 *  Un gestor tendrá siempre un nombre y un telefono.
 *  Si no se asigna, el importe maximo autorizado por operación sera 10000 euros
 *  Un gestor, una vez asignado, no podrá cambiar su numero de telefono. Y todo
 *  el mundo podrá consultarlo.
 * 
 * El nombre será público y el importe maximo solo sera visible por clases veci-
 * nas.
 * Modificar la calse CuentaCorriente para que pueda disponer de un objeto Ges-
 * tor. Escribir los métodos necesarios.
 * 
 * 
 * @author ISMAEL FERNANDEZ
 */
public class ActividadResuelta7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CuentaCorriente c1, c2, c3;
      Gestor g1 = new Gestor("Antonio Gonzalez", "666 524 321");
      Gestor g2 = new Gestor("Patricia Conde", "654 236 987", 12000.0);
      
     
        
    }   
    
}
