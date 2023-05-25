package utilidades;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class Write {
	
	private final String FICHERO_SALIDA = "C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\Examen\\";
	
	public void escribirFichero(String nombreFichero,Iterator<Integer> pila) {
		
		BufferedWriter escritor;
		String fichero = FICHERO_SALIDA + nombreFichero;
		String escribir = "";
		try {
			escritor = new BufferedWriter(new FileWriter(fichero));
			while(pila.hasNext()) {
				escribir += pila.next()+"\n";
			}
			escritor.write(escribir);
			escritor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
