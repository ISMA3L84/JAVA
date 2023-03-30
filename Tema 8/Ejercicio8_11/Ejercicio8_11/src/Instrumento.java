import java.util.Arrays;

public abstract class Instrumento {
    protected Nota[] melodia;// tabla que almacena las notas a interpretar.

    public Instrumento() {
        melodia = new Nota[0];// creamos la tabla.
    }

    public Instrumento(String string) {
    }

    // Usa el algoritmo de insercion no ordenada.
    void add(Nota n) {
        melodia = Arrays.copyOf(melodia, melodia.length + 1);//redimensionamos.
        melodia[melodia.length - 1] = n;//insertamos el nuevo elemento al final.

    }
    abstract void interpretar();//a implementar en cada subclase.
}
