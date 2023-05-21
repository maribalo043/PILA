package go;

import tienda.Empresa;
import utilidades.Read;

public class Start {

	public static void main(String[] args) {
		
		Empresa jandroSL = new Empresa ();
		Read fichero = new Read();
		
		jandroSL.añadirProductos(fichero.getDatos("C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ2_MAYO\\FC1.txt"));
		jandroSL.añadirProductos(fichero.getDatos("C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ2_MAYO\\FC2.txt"));

	}
}
