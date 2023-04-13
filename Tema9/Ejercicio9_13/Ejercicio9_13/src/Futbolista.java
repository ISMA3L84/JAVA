public class Futbolista implements Comparable{
    private String dni;
    private String nombre;
    private int edad;
    private int numeroGoles;

    public Futbolista(String dni, String nombre, int edad, int numeroGoles){
    this.dni = dni;
    this.nombre = nombre;
    this.edad = edad;
    this.numeroGoles = numeroGoles;


    }

    @Override
    public int compareTo(Object o) {
     return dni.compareTo(((Futbolista)o).dni);
    }
    @Override
    public String toString() {
        return "Futbolista [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", numeroGoles=" + numeroGoles
                + "]";
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

   

        
        
    

}
   
