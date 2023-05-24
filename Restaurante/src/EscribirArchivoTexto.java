import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class EscribirArchivoTexto {

    public static boolean Escribir (Iterator<Comanda> comandas) {
        // Ruta del archivo de texto
        String rutaArchivo = "C:\\Users\\mario\\Documents//Comandas.txt";

        try {
            // Crear objeto FileWriter
            FileWriter escritorArchivo = new FileWriter(rutaArchivo);
            String comanda = "";
            while(comandas.hasNext()) {
            	comanda += comandas.next().toString();
            	comanda += "\n";
            }
            escritorArchivo.write(comanda);
            escritorArchivo.close();
            
            return true;
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
		return true; 
    }
}