class Right_Triangle:
    def _init_(self, base, altura, hipotenusa):
        print("Creating Right Triangle with base {b},".format(b=base), " height {a}".format(a=altura), "and hypotenuse {h}".format(h=hipotenusa))
        self.altura = altura
        self.base = base
        self.hipotenusa = hipotenusa
    def Perimetro(self) :
        return self.base + self.altura + self.hipotenusa
    def area(self):
        return (self.base*self.altura)/2
    
Triangle_1 = Right_Triangle(2,3,6)
Triangle_2 = Right_Triangle(3,5,7)
Triangle_3 = Right_Triangle(1,2,5)
        
print(Triangle_1.Perimetro())
print(Triangle_2.Perimetro())
print(Triangle_3.Perimetro())

print(Triangle_1.area())
print(Triangle_2.area())
print(Triangle_3.area())