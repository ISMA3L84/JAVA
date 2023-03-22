package ActividadResuelta7_13;
/*Vamos a implementar una estructura de pila para Integer usando objetos de la clase
 * Lista para guardar los datos que se apilan. Por razón de eficiencia, la cima será
 * el final de la lista, evitando así over los datos apilados previamente.
 */
public class Pila{
private Lista lista; //objeto donde almacenaremos los datos.
public Pila(){
    lista = new Lista(); //Creamos un objeto Lista.
}
//Apilamos añadiendo el elemento al final de la lista:
void apilar(Integer elemento){
    lista.insertarfinal(elemento);
}
//Desapilamos extrayendo el elemento de la cima. Si la pila está vacía, es por que
la lista también lo está y devuelve null.
Integer dessapilar(){
    return lista.eliminar(lista.tabla.length -1);
    
}
public void mostrar(){
    lista.mostrar();
}

}