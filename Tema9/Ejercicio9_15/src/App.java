import java.util.Scanner;

/*Implementar la clase Supercola, que tiene como atributos dos colas para
 * enteros, en las que encola y desencola por separado. Sin embargo, si una
 * de las colas queda vacía, al llamar a su método desencolar, se desencola
 * de la otra mientras tenga elementos. Solo cuando las dos colas estén va-
 * cías, cualquier llamada a desencolar devolverá null. Escribir un progra-
 * ma con el menú:
 * 
 * ■    Encolar en Cola1
 * ■    Encolar en Cola2
 * ■    Desencolar de Cola1
 * ■    Desencolar de Cola2
 * ■    Salir
 * 
 * Después de cada operación se mostrará el estado de las dos colas para 
 * seguir su evolución.
 */

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Supercola superCola = new Supercola();

        int opcion;
        boolean salir = false;
        

        do {
            menu();
            System.out.println("Seleccione Opcion o escriba `salir` para abandonar el programa: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nOpcion: Encolar en cola1");
                    System.out.println("Introduce el numero que encolar: ");
                    int encole1 = sc.nextInt();
                    superCola.encolar1(encole1);
                    break;
                case 2:
                    System.out.println("\nOpcion: Encolar en cola2");
                    System.out.println("Introduce el numero que encolar: ");
                    int encole2 = sc.nextInt();
                    superCola.encolar2(encole2);
                    break;
                case 3:
                    System.out.println("\nOpcion: Desencolar en cola2");
                    System.out.println(superCola.desencolar1());
                    break;
                case 4:
                    System.out.println("\nOpcion: Desencolar en cola2");
                    System.out.println(superCola.desencolar2());
                    break;
                case 5:
                    salir = true;
                    break;
            }

        } while (!salir);

    }

    public static void menu() {
        System.out.println("\n1. Encolar en Cola1");
        System.out.println("2. Encolar en Cola2");
        System.out.println("3. Desencolar en Cola1");
        System.out.println("4. Desencolar en Cola2");
        System.out.println("5. Salir\n");
    }
}


