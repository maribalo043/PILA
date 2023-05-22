package cine;

import java.util.ArrayList;

public class Pelicula {

	private String Titulo;
	private String Director;
	private String Año;
	private ArrayList<String> Cines;

	public Pelicula(String titulo, String director, String año, ArrayList<String> cines) {
		this.Titulo = titulo;
		this.Director = director;
		this.Año = año;
		this.Cines = cines;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getAño() {
		return Año;
	}

	public void setAño(String año) {
		Año = año;
	}

	public ArrayList<String> getCines() {
		return Cines;
	}

	public void setCines(ArrayList<String> cines) {
		Cines = cines;
	}

	@Override
	public String toString() {
		return "Titulo=" + Titulo + ",\n Director=" + Director + ",\n Año=" + Año + ",\n Cines=" + Cines + "]\n\n";
	}
	
	
}
