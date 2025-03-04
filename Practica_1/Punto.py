import math 
class Punto:
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y
# Metodos
def coord_cartesianas(self):
    return f"({self.x}, {self.y})"

def coord_polares(self):
    r = math.sqrt(self.x**2 + self.y**2)
    theta = math.atan2(self.y, self.x) #en radianes
    return f"(r={r}, 0={theta})"

#Metodo toString
def __str__(self):
    returnf"punto en coordenadas cartesianas: {self.coord_cartesianas()}"