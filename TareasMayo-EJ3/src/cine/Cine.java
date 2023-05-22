package cine;

public class Cine {
	
	private String Codigo;
	private String Nombre;
	private String numeroSalas;
	private String Localidad;
	
	public Cine (String codigo, String nombre,String numeroSalas, String localidad) {
		this.Codigo = codigo;
		this.Nombre = nombre;
		this.numeroSalas = numeroSalas;
		this.Localidad=localidad;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getNumeroSalas() {
		return numeroSalas;
	}

	public void setNumeroSalas(String numeroSalas) {
		this.numeroSalas = numeroSalas;
	}

	public String getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}

	@Override
	public String toString() {
		return "[Codigo=" + Codigo + ",\n Nombre=" + Nombre + ",\n numeroSalas=" + numeroSalas + ",\n Localidad="
				+ Localidad + "]\n\n";
	}
	
}
