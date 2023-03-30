/*Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de
 * una melodia(dentro de una misma octava). El método add() añade nuevas notas musicales.
 * La clase también dispone del método abstracto interpretar(), que en cada subclase que
 * herede de instrumento, mostrará por consola las notas musicales según las interprete.
 * Utiizar enumerados para definir las notas musicales.
 * 
 * 
 * SOLUCION:
 * La clase abstracta Instrumento, basicamente contiene una tabla con una serie de notas.
 * Cada clase que herede de Instrumento, tendrá que implementar el método interpretar()
 * donde se decide de qué forma suenan las notas, por ejemplo: do, Do, Dolooon, doooooooo,
 * etc.
 
*/

public abstract class Instrumento {
    protected Nota[] melodia;// tabla que almacena las notas a interpretar.

    public Instrumento() {
        melodia = new Nota[0];// creamos la tabla.
    }

    // Usa el algoritmo de insercion no ordenada.
    void add(Nota n) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);//redimensionamos.
        melodia[melodia.length - 1] = n;//insertamos el nuevo elemento al final.

    }
    abstract void interpretar();//a implementar en cada subclase.
}
