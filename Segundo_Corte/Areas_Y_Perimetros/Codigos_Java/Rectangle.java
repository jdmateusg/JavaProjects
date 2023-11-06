package rectangle;

public class Rectangle {
  
    public double ancho;
    public double largo;
    public Rectangle(double ancho, double largo){
        System.out.println("Creating rectangle with widht "+ ancho + " and length "+ largo);
        this.ancho= ancho;
        this.largo = largo;
    }
    public double Perimetro(){
    return 2*this.largo + 2*this.ancho;
}
    public double Area(){
        return this.largo*this.ancho;
    }
    public static void main(String[] args) {
        Rectangle book = new Rectangle(12,23);
        Rectangle gift_box = new Rectangle(36,55);
        Rectangle TV = new Rectangle(13,92);
        
        System.out.println(book.Perimetro());
        System.out.println(gift_box.Perimetro());
        System.out.println(TV.Perimetro());
        
        System.out.println(book.Area());
        System.out.println(gift_box.Area());
        System.out.println(TV.Area());
    }
        
  }