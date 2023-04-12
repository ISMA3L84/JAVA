public class App {
   

    public static void main(String[] args) {

       Socio s1 = new Socio(3, "Peter", "11-05-2000");
       Socio s2 = new Socio(1, "Manuela", "24-12-2001");
       int resultado = s1.compareTo(s2);
       System.out.println(resultado);
       
        
      
    }

   
}
