public class HoraExacta extends Hora{//hereda de Hora.
    //resto de implementacion de la clase.
    /*Reimplementamos (overriding), el metodo equals() heredado de la clase
     * Object, que tendremos que convertir (cast) a HoraExacta.
    */
    @Override public boolean equals(Object o){
        HoraExacta otroReloj = (HoraExacta) o;//el mismo objeto está referenciado
        //como Object (con el parámetro o), y como HoraExacta (con la variable
        //otro reloj).
        boolean iguales;
        //si las horas, minutos y segundos son iguales:
        if(this.hora == otroReloj.hora && this.minutos == otroReloj.minutos && this.segundos == otroReloj.segundos){
            iguales = true;// son iguales.
        }else{
            iguales = false;//no son iguales.
        }
        return iguales;
    }
}
