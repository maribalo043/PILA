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

		try {
			BufferedReader lector = new BufferedReader(new FileReader(fichero));

			String nombre;
			try {
				nombre = lector.readLine();
			} catch (IOException e) {
				e.printStackTrace();
				nombre = null;
			}
			ArrayList<String> lista =new ArrayList<String>();
			String codigo = "";
			while (nombre != null) {

				Pelicula pelicula = new Pelicula("", "", "",lista);

				pelicula.setTitulo(nombre);
				pelicula.setDirector(lector.readLine());
				pelicula.setAño(lector.readLine());
				nombre = lector.readLine();
				SeparadorCodigos separador = new SeparadorCodigos();
				codigo = separador.separarCodigo(nombre, 1);
				pelicula.getCines().add(codigo);
				codigo = separador.separarCodigo(nombre, 2);
				pelicula.getCines().add(codigo);
				for(int contador =0 ;;contador++) {
					devolver.put(pelicula.getCines().get(contador), pelicula);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
