package sistemuniv;
import java.io.*;

public class Persistencia {

    public static void guardar(Biblioteca bib) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("biblioteca.dat"))) {
            oos.writeObject(bib);
            System.out.println("Datos guardados correctamente.");
        } catch (Exception e) { 
            System.out.println("Error al guardar: " + e.getMessage()); 
        }
    }

    public static Biblioteca cargar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("biblioteca.dat"))) {
            return (Biblioteca) ois.readObject();
        } catch (Exception e) {
            System.out.println("Creando nueva biblioteca...");
            return new Biblioteca(); 
        }
    }

    public static void guardarBiblioteca(Biblioteca biblioteca, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(biblioteca);
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static Biblioteca cargarBiblioteca(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Biblioteca) ois.readObject();
        } catch (Exception e) {
            return new Biblioteca();
        }
    }
}