import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Fichero {
    private BufferedReader lector;

    // Constructor: abre el fichero
    public Fichero(String nombre) {
        try {
            lector = new BufferedReader(new FileReader(nombre));
        } catch (IOException e) {
            System.out.println("Error: No se pudo abrir el fichero '" + nombre + "'.");
        }
    }

    // Lee una línea entera como String (Apartado B)
    public String leerLinea() {
        if (lector != null) {
            try {
                return lector.readLine();
            } catch (IOException e) {
                System.out.println("Error al leer la línea del fichero.");
            }
        }
        return null;
    }

    // Lee la línea, la parsea y devuelve el objeto Intervalo (Apartado A)
    public Intervalo leerIntervalo() {
        String linea = leerLinea();

        if (linea != null) {
            String[] partes = linea.split(",");
            if (partes.length == 2) {
                try {
                    double min = Double.parseDouble(partes[0].trim());
                    double max = Double.parseDouble(partes[1].trim());
                    return new Intervalo(min, max);
                } catch (NumberFormatException e) {
                    System.out.println("Error: Formato numérico incorrecto en la línea -> " + linea);
                }
            }
        }
        return null; // Devuelve null si se acaba el fichero o hay error
    }

    // Cierra el fichero
    public void cerrarFichero() {
        if (lector != null) {
            try {
                lector.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero.");
            }
        }
    }
}