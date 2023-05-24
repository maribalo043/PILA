package utilities;
import java.io.FileWriter;
import java.util.Iterator;

import objects.Cine;

public class Write {

	private final String FICHERO_SALIDA = ("C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ3_MAYO\\Resultado.txt");
	
	public Write() {	
	}

	public void escribirFichero(Iterator<Cine> cines) {
		
		FileWriter fichero;
		try {
			
			fichero = new FileWriter(FICHERO_SALIDA);

			while (cines.hasNext()){
				
				Cine c = cines.next();
				
				fichero.write(c.getNombre()+" , "+c.getLocalidad()+". Cartelera: \n{\n"+c.imprimirPeliculas()+"\n}\n");
			}
			fichero.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}