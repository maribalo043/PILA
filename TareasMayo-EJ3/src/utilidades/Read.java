package utilidades;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import cine.Cine;
import cine.Pelicula;

public class Read {

	public HashMap<String, Pelicula> getPelicula(String fichero) throws IOException {
		HashMap<String, Pelicula> devolver = new HashMap<String, Pelicula>();
		BufferedReader lector = new BufferedReader(new FileReader(fichero));
		String nombre = lector.readLine();
		Pelicula pelicula = new Pelicula("","","",new ArrayList<String>());
		pelicula.setTitulo(nombre);
		pelicula.setDirector(lector.readLine());
		pelicula.setAño(lector.readLine());
		nombre = lector.readLine();
		SeparadorCodigos separador = new SeparadorCodigos();
		pelicula.getCines().add(separador.separarCodigo(nombre, 0));
		pelicula.getCines().add(separador.separarCodigo(nombre, 1));
		return devolver;
	}

	public HashMap<String, Cine> getCine(String fichero) throws IOException {
		HashMap<String, Cine> devolver = new HashMap<String, Cine>();

		try {
			BufferedReader lector = new BufferedReader(new FileReader(fichero));

			String nombre;
			try {
				nombre = lector.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				nombre = null;
			}
			while (nombre != null) {

				Cine cine = new Cine("", "", "", "");

				cine.setCodigo(nombre);
				cine.setNombre(lector.readLine());
				cine.setNumeroSalas(lector.readLine());
				cine.setLocalidad(lector.readLine());

				devolver.put(cine.getCodigo(), cine);

				nombre = lector.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return devolver;
	}
}
