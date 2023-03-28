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
        Punto p1 = new Punto();//creamos el constructor p1.
            Scanner sc = new Scanner(System.in);
            System.out.println("introduzca componente X: ");
            p1.X = sc.nextDouble();

            System.out.println("introduzca componente y: ");
            p1.Y = sc.nextDouble();
            System.out.println("introduzca cuanto desea desplazar en el eje X: ");
          p1.DX = sc.nextDouble();
            System.out.println("introduzca cuanto desea desplazar en el eje Y: ");
            p1.DY = sc.nextDouble();
            //System.out.println("introduzca cuanto desea desplazar en el eje Y: ");
            //p1.DY = sc.nextDouble();
          
       
             p1.desplazaX(p1.DX);
             p1.desplazaY(p1.DY);

        /*      System.out.println("introduzca cuanto desea desplazar en conjunto a Y en el eje X: ");
             p1.DX = sc.nextDouble();
             System.out.println("introduzca cuanto desea desplazar en el eje Y: ");
             p1.DY = sc.nextDouble();
         */    p1.desplaza(p1.DX, p1.DY);
             p1.muestra();
           System.out.println(p1.distaciaEuclidea(p1.DY));
       
    }
}
