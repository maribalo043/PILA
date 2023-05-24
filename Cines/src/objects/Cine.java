package objects;

import java.util.HashSet;
import java.util.Iterator;

public class Cine {

	private String codigo;
	private String nombre;
	private int salas;
	private String localidad;
	private HashSet<Pelicula> peliculas;
	
	public Cine () {
		peliculas = new HashSet<Pelicula>();
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSalas() {
		return salas;
	}
	public void setSalas(int salas) {
		this.salas = salas;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public Iterator<Pelicula> getPeliculas() {
		return peliculas.iterator();
	}
	public void setPeliculas(Iterator<Pelicula> peliculas) {
		
		while (peliculas.hasNext()) {
			this.peliculas.add(peliculas.next());
		}
		
	}
	public String imprimirPeliculas() {
		return peliculas.toString();
	}

	@Override
	public String toString() {
		return "Cine [codigo=" + codigo + ", nombre=" + nombre + ", salas=" + salas + ", localidad=" + localidad
				+ ", peliculas=" + peliculas + "]";
	}
	
	
}