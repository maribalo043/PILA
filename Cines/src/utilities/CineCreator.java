package utilities;

import java.util.Iterator;

import objects.Cine;
import objects.Pelicula;

public class CineCreator {

	public static Cine crearCines(String codigo, String nombre, String nSalas, String localidad , Iterator<Pelicula> peliculas) {
		
		Cine devolver = new Cine();
		
		devolver.setCodigo(codigo);
		devolver.setNombre(nombre);
		devolver.setSalas(Integer.parseInt(nSalas));
		devolver.setLocalidad(localidad);
		
		devolver.setPeliculas(EstablecerPeliculas.unir(devolver, peliculas));
		
		return devolver;
	}

}