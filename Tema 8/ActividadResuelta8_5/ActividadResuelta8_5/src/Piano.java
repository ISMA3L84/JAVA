/*un piano es un instrumento que interpreta las notas con un timbre muy característico. */
public class Piano extends Instrumento {
    //podemos añadir tantos atributos y métodos como necesitemos.
    public Piano() {
        super();//constructor de la superclase.
    }
    @Override//omplementamos el metodo abstracto.
    //recorremos las notas y las interpretamos de la forma específica del piano.
    public void interpretar(){
        for(Nota nota : melodia){
            switch(nota){
                case DO:
                    System.out.println("DO ");
                    break;
                case RE:
                    System.out.println("RE ");
                    break;
                case MI:
                    System.out.println("MI ");
                    break;
                case FA:
                    System.out.println("FA ");
                    break;
                case SOL:
                    System.out.println("SOL ");
                    break;
                    case LA:
                    System.out.println("LA ");
                    break;
                    case SI:
                    System.out.println("SI ");
                    break;

            }
        }
        System.out.println("");
    }
    
}
