package Square;

public class Square {
  
    public double lado;
    public Square(double lado){
        System.out.println("Creating Square with side " + lado);
        this.lado= lado;
    }
    public double Perimetro(){
    return 4*this.lado;
}
    public double Area(){
        return this.lado*this.lado;
    }
    public static void main(String[] args) {
        Square Table = new Square(25);
        Square Card = new Square(8);
        Square Closet = new Square(35);
        
        System.out.println(Table.Perimetro());
        System.out.println(Card.Perimetro());
        System.out.println(Closet.Perimetro());
        
        System.out.println(Table.Area());
        System.out.println(Card.Area());
        System.out.println(Closet.Area());
    }
        
  }