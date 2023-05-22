package cine;

import java.io.IOException;
import java.util.HashMap;

import utilidades.Read;

public class Cinesa {
	
	private HashMap<String,Cine> Cines;
	private HashMap<String,Pelicula> Peliculas;
	
	public Cinesa () throws IOException {
		Read lector = new Read();
		Cines = lector.getCine("C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ3_MAYO\\Cines.txt");
		Peliculas = lector.getPelicula("C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ3_MAYO\\Peliculas.txt");
	}

	public HashMap<String, Cine> getCines() {
		return Cines;
	}

	public void setCines(HashMap<String, Cine> cines) {
		Cines = cines;
	}

	public HashMap<String, Pelicula> getPeliculas() {
		return Peliculas;
	}

	public void setPeliculas(HashMap<String, Pelicula> peliculas) {
		Peliculas = peliculas;
	}
	
}
	
