class Rectangle:
    def _init_(self, largo, ancho):
        print("Creating rectangle with widht {a}".format(a=ancho), " and length {l}" .format(l=largo))
        self.largo = largo
        self.ancho = ancho
    def Perimetro(self) :
        return 2*self.largo + 2*self.ancho
    def area(self):
        return self.largo*self.ancho
    
book = Rectangle(12,23)
gift_box = Rectangle(36,55)
TV = Rectangle(13,92)
        
print(book.Perimetro())
print(gift_box.Perimetro())
print(TV.Perimetro())

print(book.area())
print(gift_box.area())
print(TV.area())