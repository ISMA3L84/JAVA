import java.util.Scanner;
/*Escribe la clase Punto que representa un punto en el plano(con un componenete X
y un componente Y), con los métodos:
►   Punto(double x, double y): construye un objeto con los datos pasados como pa-
rámetros

►   void desplazaX(double x): incrementa el componente X en la cantidad dx.

►   void desplazaY(double dy): incrementa el componente Y en la cantidad dy.

►   void desplaza(double dx, double dy): desplaza ambos componentes segun las
cantidades dx(en el eje X) y dy(en el eje Y).

►   double distanciaEuclidea(Punto otro): calcula y devuelve la distancia eu-
clídea entre el punto invocante y el punto otro.

►   void muestra(): muestra por consola la informacion relativa al punto.*/

public class App {
    public static void main(String[] args) throws Exception {
        Punto p1 = new Punto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la coordenada X: ");
        p1.X = sc.nextDouble();
        System.out.println("Ingrese la coordenada Y: ");
        p1.Y = sc.nextDouble();
        System.out.println("Ingrese cantidad DX: ");
        p1.DX = sc.nextDouble();
        System.out.println("Ingrese cantidad DY: ");
        p1.DY = sc.nextDouble();
  
        p1.desplazaX(0);
        p1.desplazaY(0);
        p1.desplaza(0, 0);
        p1.muestra();

    }
}
