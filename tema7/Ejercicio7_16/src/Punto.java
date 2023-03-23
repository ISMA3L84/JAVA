

public class Punto {
    double X, Y;
    double DX, DY;
    private double distancia;
    

    public Punto(double X, double Y) {
        this.X = X;
        this.Y = Y;
       
    }

       

    public Punto() {
    }



    public void desplazaX(double DX) {
        X = X + DX;
    }
    private void getDesplazaX(){
        System.out.println("La cantidad incrementada a X es: " + X);
        
    }
    public void desplazaY(double DY) {
        Y = Y + DY;
        
    }
    private void getDesplazaY(){
        System.out.println("La cantidad incrementada a Y es: " + Y);
        
    }

    public void desplaza(double DX, double DY) {
        X += DX;
        Y += DY;
    }  
    private void getDesplaza(){
        System.out.println("El componente X se ha desplazado: " + X);
        System.out.println("El componente Y se ha desplazado: " + Y);
        
    }  
    public void distaciaEuclidea(Punto otro){
       return Math.sqrt(Math.pow(this.x - otro.x, 2) + Math.pow(this.y - otro.y, 2));
       
    }

    public void setDistanciaEuclidea(double distanciaEuclidea) {
        distancia = distanciaEuclidea;
    }
 

    public void muestra(){
        System.out.println(X + " X    Y " + Y);
        System.out.println(DX + " DX    DY " + DY);
        getDesplazaX();
        getDesplazaY();
        getDesplaza();
        distaciaEuclidea(Punto otro);
    }

}
