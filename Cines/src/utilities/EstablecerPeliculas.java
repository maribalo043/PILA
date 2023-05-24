package utilities;

import java.util.ArrayList;
import java.util.Iterator;

import objects.Cine;
import objects.Pelicula;

public class EstablecerPeliculas {

	public static Iterator<Pelicula> unir(Cine cine, Iterator<Pelicula> peliculas) {
		
		ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
		while (peliculas.hasNext()) {
			pelis.add(peliculas.next());
		}
		ArrayList<Pelicula> devolver = new ArrayList<Pelicula>();
//		while(peliculas.hasNext()) {
//			
//			while (peliculas.next().getCines().hasNext()) {
//				if (peliculas.next().getCines().next()==devolver.getCodigo()) pelis.add(peliculas.next());
//				
//			}
//			
//		}
		
//		for (Pelicula p: pelis) {
//			
//			while(p.getCines().hasNext()) {
//				String codigo1 = p.getCines().next();
//				String codigo2 = cine.getCodigo();
//				if (codigo1.equals(codigo2)) devolver.add(p);
//
//			}	
//		}
		for (Pelicula p : pelis) {
		    Iterator<String> cineIterator = p.getCines();
		    while (cineIterator.hasNext()) {
		        String codigo1 = cineIterator.next();
		        String codigo2 = cine.getCodigo();
		        if (codigo1.equals(codigo2)) {
		            devolver.add(p);
		        }
		    }
		}
		
		return devolver.iterator();
	}

}