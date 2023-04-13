import java.util.Comparator;

public class comparadorDni implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Futbolista)o1).getDni().compareTo(((Futbolista)o2).getDni());  
    }
    
    
}
