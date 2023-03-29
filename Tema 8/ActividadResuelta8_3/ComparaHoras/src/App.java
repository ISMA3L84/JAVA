/*Añadir la clase HoraExacta un metodo que compare si dos horas(la invocante y
otra pasada como parámetro de entrada al método), son iguales o distintas.*/



public class App {
    public static void main(String[] args) throws Exception {
        HoraExacta a = new HoraExacta(1, 2, 3);
        HoraExacta b = new HoraExacta(1, 2, 3);
        HoraExacta c = new HoraExacta(10, 20, 30);
        System.out.println(a.equals(b));//son iguales.
        System.out.println(a.equals(c));//son distintas.
        

    }
}
