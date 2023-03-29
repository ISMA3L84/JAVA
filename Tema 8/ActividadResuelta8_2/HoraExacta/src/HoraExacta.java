public class HoraExacta extends Hora {//heredamos de la clase Hora.
    protected int segundos;//añadimos un atributo para los segundos.
    public HoraExacta(int hora, int minutos, int segundos){
        super(hora, minutos);//aprovechamos el constructor de la superclase.
        //this.segundos = segundos; permitiría asignar cualquier valor a los
        //segundos.
        if(!setSegundos(segundos)){//mejpr usar el metodo para asignar valores.
            System.out.println("Segundos incorrectos");

        }
    }
//Añadimos un método que asigna los segundos.
public boolean setSegundos(int segundos){
    boolean correcto = false;
    if(0 <= segundos && segundos < 60){//si está en un rango válido.
        this.segundos = segundos;//modificamos los segundos.
        correcto = true;

    }
    return correcto;
}
    @Override//Sustituimos el metodo para incrementar segundos en lugar de minutos.
    public void inc(){
        segundos++;
        if(segundos > 59){//si los segundos son mayores a 59.
            segundos = 0;//inicializamos los segundos.
            super.inc();//+1 con el método inc() de la superclase.
            result += ":" + segundos;//añadimos los segundos.
            return result;
        }
    }
    
}
