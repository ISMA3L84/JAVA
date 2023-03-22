package ActividadResuelta7_12;

/*Añadir a la clase LISTA el método estático:
 * Lista concatena(Lista l1, Lista l2)
 * que construye y devuelve una lista que contiene, en el mismo orden, una
 * copia de todos los elementos de l1 y l2.
 */

 public class ListaConcatenada{
    /*Crearemos un objeto Lista donde insertaremos todos los elementos de
     * l1 y l2.
     */
    static Lista concatena(Lista l1, Lista l2){
        Lista resultado = new Lista(); //objeto Lista que contendrá la concatenacion.
        for (Integer e : l1.tabla){ //recorremos los elementos de l1 e insertamos.
            resultado.insertarFinal(e); //insertamos al final para mantener el orden.
        }
        for (Integer e : l2.tabla){
            resultado.insertarFinal(e);
        }
        return resultado;
    }


 }