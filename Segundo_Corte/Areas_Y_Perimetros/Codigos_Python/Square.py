class Square:
    def _init_(self, lado):
        print("Creating Square with side {l}".format(l=lado))
        self.lado = lado
    def Perimetro(self) :
        return 4*self.lado
    def area(self):
        return self.lado*self.lado
    
Table = Square(25)
Card = Square(8)
Closet = Square(35)
        
print(Table.Perimetro())
print(Card.Perimetro())
print(Closet.Perimetro())

print(Table.area())
print(Card.area())
print(Closet.area())