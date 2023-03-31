import java.util.Arrays;

public class Etiqueta {

    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String region;
    //protected String cadena2;

    //CONSTRUCTOR VACIO PARA QUE NO DE ERROR.
    public Etiqueta() {
    }

    public Etiqueta(String nombre, String direccion, String telefono, String region) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.region = region;
    }
        
        
    



    public String mostrar() {
        System.out.println("********DATOS DE ETIQUETA CLIENTE***********");
        String cadena = "";
        cadena = cadena + "nombre: " + nombre + "\n";
        cadena = cadena + "direccion: " + direccion + "\n";
        cadena = cadena + "telefono: " + telefono + "\n";
        cadena = cadena + "region: " + region + "\n";
       
        return cadena;
    }

}

