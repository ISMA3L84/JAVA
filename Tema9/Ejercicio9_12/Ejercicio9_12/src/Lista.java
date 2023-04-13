import java.util.Arrays;

public class Lista implements Cola, Pila{
    Object tabla[];
    Lista(){
    tabla = new Object[0];
}
void insertarPrincipio(Object nuevo){
    tabla = Arrays.copyOf(tabla, tabla.length + 1);
    System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
    tabla[0] = nuevo;
}
void insertarFinal(Object nuevo){
    tabla = Arrays.copyOf(tabla, tabla.length +1);
    tabla[tabla.length - 1] = nuevo;
}
void insertarFinal(Lista otraLista){
    int tamIni = tabla.length; //tamaño inicial de la tabla.
    tabla = Arrays.copyOf(tabla, tabla.length + otraLista.tabla.length);
    System.arraycopy(otraLista.tabla, 0, tabla, tamIni, otraLista.tabla.length);
}
/*El primer parámetro es el índice del lugar donde queremos insertar el
 * valor del segundo parámetro.
 */
void insertar(int posicion, Object nuevo){
    tabla = Arrays.copyOf(tabla, tabla.length + 1);
    System.arraycopy(tabla, posicion, tabla, posicion + 1, tabla.length - posicion -1);
    tabla[posicion] = nuevo;
}
Object get(int indice){
    Object resultado = null;
    if(indice >= 0 && indice < tabla.length){//indice válido.
        resultado = tabla[indice];
    }
    return resultado;
}
int buscar(Object claveBusqueda){
    int indice = -1;
    for(int i = 0; i < tabla.length && indice == -1; i++){
        if(tabla[i].equals(claveBusqueda)){
            indice = i;
        }
    }
    return indice;
}
public String toString(){//mostramos la tabla.
return Arrays.deepToString(tabla);
}
@Override
public void apilar(java.lang.String Elemento) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'apilar'");
}
@Override
public java.lang.String desapilar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'desapilar'");
}
@Override
public void encolar(java.lang.String o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'encolar'");
}
@Override
public void String() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'String'");
}

}