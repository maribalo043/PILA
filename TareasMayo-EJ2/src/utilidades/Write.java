package utilidades;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import tienda.Producto;

public class Write {
	
	 public static boolean Escribir (Iterator<Producto> Productos) {
	        // Ruta del archivo de texto
	        String rutaArchivo = "C:\\Users\\mario\\Documents//Comandas.txt";

	        try {
	            // Crear objeto FileWriter
	            FileWriter escritorArchivo = new FileWriter(rutaArchivo);
	            String Producto = "";
	            while(Productos.hasNext()) {
	            	Producto += Productos.next().toString();
	            	Producto += "\n";
	            }
	            escritorArchivo.write(Producto);
	            escritorArchivo.close();
	            
	            return true;
	        } catch (IOException e) {
	            System.out.println("Ha ocurrido un error: " + e.getMessage());
	        }
			return true; 
	    }
	
	

}
