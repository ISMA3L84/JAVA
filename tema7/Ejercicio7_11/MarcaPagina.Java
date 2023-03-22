package Ejercicio7_11;
import java.util.Arrays;
/*Escribe la clase MarcaPagina, que ayuda a llevar el control de la lectura de un
 * libro. Deberá disponer de métodos para incrementar la página leída, para obtener
 * información de la última página que se ha leído y para para comenzar desde el
 * principio una nueva lectura del mismo libro.
 */
public class MarcaPagina{
   
    
    public Marcador(){
        libro = new PaginasLeidas[50];//El libro consta de 50 páginas.
    }
    void incrementarPagina(int paginaLeida){
        for (int i = 0; i < libro.length; i++){
            incrementarPagina(i);
            System.out.println("leyendo la pagina: " + i);
            paginaLeida++;
            return = paginaLeida;
        }
       
      

    }
    void comenzarDenuevo (double reset){
        comienzo = libro[libro.length];
        if(libro.length == 50){
            comienzo = 0;
            reset = true;
            system.out.println("Empezamos...Erase una vez...");
        }
        return reset;
       

    }
    void informacion(){
        system.out.println("Leyendo la pagina: " + paginaLeida);


    }

    
}

