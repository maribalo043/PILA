package utilities;

import java.util.ArrayList;
import java.util.Iterator;

import objects.Pelicula;

public class PeliculaCreator {

	public static Pelicula crearPeliculas(String titulo, String director, String anio, String codCines) {
		
		Pelicula devolver = new Pelicula();
		
		devolver.setTitulo(titulo);
		devolver.setDirector(director);
		devolver.setAnio(Integer.parseInt(anio));
		
		String[] partes = codCines.split(",");
		
		ArrayList<String> codigos = new ArrayList<String>();
		
		for (int i=0;i<partes.length;i++) {
			codigos.add(partes[i]);
		}
		
		Iterator<String> cod = codigos.iterator();

		devolver.setCines(cod);
		
		return devolver;
	}

}