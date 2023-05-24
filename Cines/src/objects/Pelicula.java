package objects;

import java.util.HashSet;
import java.util.Iterator;

public class Pelicula {

	private String director;
	private String titulo;
	private int anio;
	private HashSet<String> cines;
	
	public Pelicula() {
		cines = new HashSet<String>();
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Iterator<String> getCines() {
		return cines.iterator();
	}

	public void setCines(Iterator<String> cines) {
		
		while (cines.hasNext()) {
			this.cines.add(cines.next());
		}
		
	}

	@Override
	public String toString() {
		return "Pelicula [director=" + director + ", titulo=" + titulo + ", anio=" + anio + ", cines=" + cines + "]";
	}
	
	
}