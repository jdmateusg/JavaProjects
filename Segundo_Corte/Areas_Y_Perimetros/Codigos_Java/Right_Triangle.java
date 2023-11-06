package Right_Triangle;

public class Right_Triangle {
  
    public double base;
    public double altura;
    public double hipotenusa;
    public Right_Triangle(double base, double altura, double hipotenusa){
        System.out.println("Creating Right Triangle with base " + base +" height " + altura + " and hypotenuse " + hipotenusa);
        this.altura = altura;
        this.base = base;
        this.hipotenusa = hipotenusa;
    }
    public double Perimetro(){
    return this.base + this.altura + this.hipotenusa;
}
    public double Area(){
        return (this.base*this.altura)/2;
    }
    public static void main(String[] args) {
    Right_Triangle Triangle_1 = new Right_Triangle(2,3,6);
    Right_Triangle Triangle_2 = new Right_Triangle(3,5,7);
    Right_Triangle Triangle_3 = new Right_Triangle(1,2,5);
        
        System.out.println(Triangle_1.Perimetro());
        System.out.println(Triangle_2.Perimetro());
        System.out.println(Triangle_3.Perimetro());
        
        System.out.println(Triangle_1.Area());
        System.out.println(Triangle_2.Area());
        System.out.println(Triangle_3.Area());
    }
        
  }