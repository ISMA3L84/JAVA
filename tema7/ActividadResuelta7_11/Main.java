package ActividadResuelta7_11;

 /*Las listas son estructuras dinámicas de datos donde se pueden 
  * insertar o eliinar elementos de un determinado tipo sin limi-
  tacion de espacio.
  Implementar la clase LISTA correspondiente a una lista de nume-
  ros de la clase int. Los numeros se guardarán en una tabla que
  se redimensionará con las inserciones y eliminaciones, aumen-
  tando o disminuyendo la capacidad de la lista según el caso.
  Entre los métodos de la clase, se incluirán las siguientes ta-
  reas:

  ֎ Un constructor que inicialice la tabla con un tamaño 0.
  ֎ Obtener el numero de elementos insertados en la lista.
  ֎ Insertar un número al final de la lista.
  ֎ Insertar un numero al rincipio de la lista.
  ֎ Insertar un numero en un lugar de la lista cuyo índice, que es
  el de la tabla, se pasa como parámetro.
  ֎ Añadir al final de la lista los elementos de otra lista que se
  pasa como parámetro.
  ֎ Obtener el elemento cuyo índice se pasa como parámetro.
  ֎ Buscar un numero de la lista devolviendo el índice del primer
  lugar donde se encuentre. Si no está, devolverá -1.
  ֎ Mostrar los elementos de la lista por consola.
  */
  public class Main{

    public static void main(String[] args){
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        l1.insertarFinal(4);
        l1.insertarFinal(5);
        l1.insertarFinal(6);
        l1.mostrar();
        l1.insertarPrincipio(3);
        l1.insertarPrincipio(2);
        l1.insertarPrincipio(1);
        l1.mostrar();
        l1.insertar(2, 99);
        l1.mostrar();
        l1.eliminar(2);
        l1.mostrar();
        System.out.println(l1.buscar(4));
        l2.insertarFinal(10);
        l2.insertarFinal(20);
        l2.insertarFinal(30);
        l2.insertarFinal(40);
        l2.insertarFinal(50);
        l2.mostrar();
        l1.insertarFinal(12);
        l1.mostrar();


    }
    
   















  }