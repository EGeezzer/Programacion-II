package Practica_3;
public class JAdiPar extends JAdiNumero2 {

    public JAdiPar(int vidas) {
        super(vidas);
    }

    @Override
    public boolean validaNumero(int n) {
        if (n < 0 || n > 10) {
            return false;
        }
        if (n % 2 == 0) {
            return true;
        } else {
            System.out.println("Error: Debes ingresar un número PAR entre 0 y 10.");
            return false;
        }
    }
}

