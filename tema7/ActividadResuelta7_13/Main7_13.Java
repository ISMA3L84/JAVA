package ActividadResuelta7_13;
/*Una pila es una estructura dinámica de datos donde los elementos se insertan(se 
apilan) y se retiran (se desapilan) siguiendo la norma de que el último que se a-
pila será el primero en desapilarse, como ocurre con una pila de platos. Cuando
vamos a retirar un plato de una pila, a nadie se le ocurre tirar de uno de los de
abajo; retiramos (desapilamos) el que está encima de todos, que fué el ultimo en
ser apilado(o al primer elemento para desapilar). Los métodos fundamentales de 
una pila son apilar() y desaspilar().

Implementar la clase Pila para números Integer, donde se usa una lista(un objeto
de la clase Lista implementada en la Actividad resuelta 7.11) para guardar los e-
lementos apilados.*/

public class Main{
public static void main(String[] args{
    //Programa principal para probar la clase Pila.
    Pila p = new Pila();
    System.out.println(p.desapilar());//Muestra null, ya que p está vacía.
    for(int i = 0; i < 10; i++){//Apilamos lon números del 0 al 9.
        p.apilar(i);
    }
    Integer num = p.desapilar();//Desapilamos.
    while(num != null){//Mientras la pila no esté vacía
System.out.println(num + " ");//Mostramos el elemento desapilado.
sum = p.desapilar(); //Y volvemos a desapilar.
    }
}


}