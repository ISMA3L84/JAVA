/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadresuelta7_9;

/**
 *
 * @author JAVA
 */
public class Bombilla {

    public static boolean interruptorGeneral = true;
    private boolean interruptor;

    public Bombilla() {
        interruptor = false;
    }

    public void enciende() {
        interruptor = true;
    }

    public void apaga() {
        interruptor = false;
    }

    public boolean estado() {
        return interruptorGeneral && interruptor;
    }

    public String muestraEstado() {
        return estado() ? "encendida" : "apagada";

    }

}
