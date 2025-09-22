package Practica_2;
public class Vector3D {
    private double x, y, z;
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector3D add(Vector3D v) {
        return new Vector3D(this.x + v.x, this.y + v.y, this.z + v.z);
    }
    public Vector3D escalar(double r) {
        return new Vector3D(r * this.x, r * this.y, r * this.z);
    }
    public double norma() {
        return Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
    }
    public Vector3D normal() {
        double n = this.norma();
        if (n == 0) throw new ArithmeticException("Vector nulo no tiene normal");
        return new Vector3D(this.x / n, this.y / n, this.z / n);
    }
    public double productoPunto(Vector3D v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
    public Vector3D productoCruz(Vector3D v) {
        return new Vector3D(
            this.y*v.z - this.z*v.y,
            this.z*v.x - this.x*v.z,
            this.x*v.y - this.y*v.x
        );
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}




    
    
    
    

