
package Practica_2;

public class TestVector3D {
   
    public static void main(String[] args) {
        Vector3D a = new Vector3D(1, 2, 3);
        Vector3D b = new Vector3D(4, -1, 2);

        System.out.println("Vector a = " + a);
        System.out.println("Vector b = " + b);

        System.out.println("\nSuma: a + b = " + a.add(b));
        System.out.println("Escalar: 3 * a = " + a.escalar(3));
        System.out.println("Norma de a = " + a.norma());
        System.out.println("Normal de a = " + a.normal());
        System.out.println("Producto punto: a·b = " + a.productoPunto(b));
        System.out.println("Producto cruz: a×b = " + a.productoCruz(b));
    }
}

    

