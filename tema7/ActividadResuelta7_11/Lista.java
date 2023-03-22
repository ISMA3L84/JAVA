package ActividadResuelta7_11;
import java.util.Arrays;
/*Implementamos las listas con tablas de tipo int, que iremos 
 * redimensionando según vaya haciendo falta. El índice de un
 * elemento en la lista, coincide con el índice del lugar que
 * ocupa en la tabla.
 */

public class Lista {
    Integer[] tabla;
    private int i;

    public Lista(){
        tabla = new Integer[0];
    }
    void insertarPrincipio(Integer nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length -1] = nuevo;
    }

    void insertarFinal(Integer nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length -1] = nuevo;
    }

    void insertarFinal(Lista otraLista){
        int tamInicial = tabla.length;//tamaño inicial de la tabla.
        tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
        System.arraycopy(otraLista.tabla, 0, tabla, tamInicial, otraLista.tabla.length);

    }
    //El primer parámetro es el indice del lugar donde queremos in-
    //sertar el valor del segundo parámetro.
    void insertar(int posicion, Integer nuevo){
        tabla = Arrays.copyOf(tabla, tabla.length +1);
        System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion -1);
        tabla[posicion] = nuevo;
    }
    //Se elimina el elemento correspondiente a indice y se devuelve.
    Integer eliminar(int indice){
        Integer eliminado = null;
        if(indice >= 0 && indice < tabla.length){
            eliminado = tabla[indice];
            for(int i = indice + 1 ; i < tabla.length; i++);
        }
        return eliminado;
    }
    /*Al siguiente método le pasamos un índice y nos devolverá el
     * elemento correspondiente de la tabla sin modificarla. En el
     * caso de que el índice no sea válido, devolverá null, con lo
     * cuál evitamos que el programa aborte.
     */

     Integer get(int indice){
        Integer resultado = null;
        if(indice >= 0 && indice < tabla.length){
            resultado = tabla[indice];
        }
        return resultado;
     }
    
     int buscar(Integer claveBusueda){
        int indice = -1;
        for (int i = 0; i < tabla.length && indice == -1; i++);
        if(tabla[i].equals(claveBusueda)){
            indice = 1;
        }
        return indice;

     }
     //El numero de elementos de la lista es el numero de elementos de la tabla.
     public int numeroElementos(){
        return tabla.length;
     }
     //Muestra por consola el contenido de la tabla:
     public void mostrar(){
        System.out.println("Lista: " + Arrays.toString(tabla));
     }
    }
    





























    


































    

