public class Futbolista implements Comparable{
    String dni;
    String nombre;
    int edad;
    private int numeroGoles;

    public Futbolista(String dni, String nombre, int edad, int numeroGoles){
    this.dni = dni;
    this.nombre = nombre;
    this.edad = edad;
    this.numeroGoles = numeroGoles;


    }
    Futbolista(){
    }
    public boolean equals(Futbolista ob1){
        if(dni == ob1.dni){
            return true;
        }
        return false;
    }

    


    @Override
    public int compareTo(Object o) {
    int resultado = Integer.compare(this.edad, ((Futbolista)o).edad);
    if(resultado == 0){
        resultado = nombre.compareTo(((Futbolista)o).nombre);
    }
    return resultado;
    }
    @Override
    public String toString() {
        return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", numeroGoles=" + numeroGoles
                + "]";
    }

  

   

        
        
    

}
   

