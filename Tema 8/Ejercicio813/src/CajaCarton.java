public class CajaCarton extends Caja {

    public CajaCarton(int ancho, int alto, int fondo, Unidad cms) {
        super(ancho, alto, fondo, cms);

    }
    public int Volumen(){

        //calculamos el 80 por ciento del volumen y lo devolvemos. No entiendo
        //por qué la caja es mas pequeña que lo que se va a contener en su in-
        //terior, pero bueno, es lo que pide el ejercicio.
        int volumen = (ancho * alto * fondo) / 100 * 80;   
        return volumen;    
    }    
        public int AreaCaja(){
           //  Area = 2(area base) + (area lateral)
            int area = 2 * (fondo * fondo) + (ancho * ancho);
            return area;


        }
        public String Atributos () {
            System.out.println("******ATRIBUTOS DE CAJA********************");
            String cadena = "";
             cadena = cadena + "Ancho: " + ancho + "\n";
             cadena = cadena + "Alto: " + alto + "\n";
             cadena = cadena + "Fondo: " + fondo + "\n";
             cadena = cadena + "Unidad: " + unidad + "\n";
             cadena = cadena + "Volumen: " + Volumen() + " centimetros cubicos" + "\n";
             cadena = cadena + "El carton utilizado han sido " + AreaCaja() + " centimetros cuadrados" + "\n";
             return cadena;
        }


   


    
}

