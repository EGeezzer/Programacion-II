package Tareas_121;

public class Punto {
    public float x; float y;
    //constructor
    public Punto(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    //metodos
    public String coord_cartesianas(){
        return "(" + x + "," + y + ")";
    }
    public String coord_polares(){
        double r = Math.sqrt( x * x + y * y);
        double theta = Math.atan2(y, x); //en radianes
        return"(r=" + r + ", 0=" + theta + ")";
    }
    
    //toString
    public String toString(){
        return "Punto en coordenadas cartesianas: " + coord_cartesianas();
    }
}
