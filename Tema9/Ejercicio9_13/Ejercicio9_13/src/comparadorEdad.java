import java.util.Comparator;

public class comparadorEdad implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Futbolista)o1).getEdad() - (((Futbolista)o2).getEdad());  
    }
    
}
