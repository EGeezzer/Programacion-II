package Practica_2;
public class AlgebraVectorial {
    private double x, y, z;
    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public AlgebraVectorial suma(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x + v.x, this.y + v.y, this.z + v.z);
    }
    public AlgebraVectorial resta(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x - v.x, this.y - v.y, this.z - v.z);
    }
    public double productoPunto(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }
    public AlgebraVectorial productoCruz(AlgebraVectorial v) {
        return new AlgebraVectorial(
            this.y * v.z - this.z * v.y,
            this.z * v.x - this.x * v.z,
            this.x * v.y - this.y * v.x
        );
    }
    public double norma() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    public boolean esPerpendicular(AlgebraVectorial v) {
        return Math.abs(this.productoPunto(v)) < 1e-9;
    }
    public boolean esParalelo(AlgebraVectorial v) {
        AlgebraVectorial cruz = this.productoCruz(v);
        return Math.abs(cruz.x) < 1e-9 && Math.abs(cruz.y) < 1e-9 && Math.abs(cruz.z) < 1e-9;
    }
    public AlgebraVectorial proyeccionSobre(AlgebraVectorial v) {
        double escalar = this.productoPunto(v) / (v.norma() * v.norma());
        return new AlgebraVectorial(v.x * escalar, v.y * escalar, v.z * escalar);
    }
    public double componenteEn(AlgebraVectorial v) {
        return this.productoPunto(v) / v.norma();
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}


