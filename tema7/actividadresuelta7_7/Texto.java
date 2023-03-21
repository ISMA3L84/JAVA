/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividadresuelta7_7;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author JAVA
 */
public class Texto {

    private String cad;
    LocalDateTime creacion;
    LocalDateTime ultimaModificacion;
    private final int LONGITUD_MAX;
    static final String VOCALES = "aeiouáéíóú";

    public Texto(int longitudMax) {
        cad = "";
        this.LONGITUD_MAX = longitudMax;
        creacion = LocalDateTime.now();
        ultimaModificacion = null;
    }

    public void addFinal(char c) {
        if (LONGITUD_MAX >= cad.length()) {
            cad = cad + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addFinal(String c) {
        if (LONGITUD_MAX >= cad.length()) {
            cad = cad + c;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addPrincipio(char c) {
        if (LONGITUD_MAX > cad.length()) {
            cad = c + cad;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void addPrincipio(String c) {
        if (LONGITUD_MAX >= cad.length()) {
            cad = c + cad;
            ultimaModificacion = LocalDateTime.now();
        }
    }

    public void mostrar() {
        System.out.println("Texto creado el " + creacion);
        System.out.println("Ultima modificacion: " + ultimaModificacion);
        System.out.println(cad);
    }

    public int numVocales() {
        int voc = 0;
        for (int i = 0; i < cad.length(); i++) {
            if (esVocal(cad.charAt(i))) {
                voc++;
            }

        }
        return (voc);
    }

    private boolean esVocal(char c) {
        boolean vocal = false;
        c = Character.toLowerCase(c);
        if (VOCALES.indexOf(c) != -1) {
            vocal = true;

        }
        return (vocal);
    }

}
