public class Caja {
    protected int ancho;
    protected int alto;
    protected int fondo;
    protected double anchoDouble;
    protected double altoDouble;
    protected double fondoDouble;
    protected Unidad unidad;

    public Caja() {

    }

    public Caja(int ancho, int alto,  int fondo, Unidad cms) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        unidad = cms;

    }

     public Caja(double anchoDouble, double altoDouble, double fondoDouble, Unidad  m) {
        this.anchoDouble = anchoDouble;
        this.altoDouble = altoDouble;
        this.fondoDouble = fondoDouble;
        unidad = m;
    }

    public double getVolumen() {
        return ancho * alto * fondo;
        

    }

   
    public String toString () {
        System.out.println("******ATRIBUTOS DE CAJA********************");
        String cadena = "";
         cadena = cadena + "Ancho: " + ancho + "\n";
         cadena = cadena + "Alto: " + alto + "\n";
         cadena = cadena + "Fondo: " + fondo + "\n";
         cadena = cadena + "Unidad: " + unidad + "\n";
         cadena = cadena + "Volumen: " + getVolumen() + " centimetros cubicos" + "\n";
         return cadena;

    }
  

}

