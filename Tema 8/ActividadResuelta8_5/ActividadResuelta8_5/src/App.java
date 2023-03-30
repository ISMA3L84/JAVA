/*Crear la clae Piano heredando de la clase abstracta Instrumento.
 * 
 */
public class App {

    

    public static void main(String[] args) throws Exception {
        Nota cancion[] = {Nota.DO, Nota.SI, Nota.SOL, Nota.RE, Nota.FA};//notas.
        Piano p = new Piano();
        for(Nota nota : cancion){//añadimos las notas al piano.
            p.add(nota);
        }    
        p.interpretar();
    }
}
