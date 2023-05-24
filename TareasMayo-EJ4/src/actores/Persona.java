package actores;

import java.util.ArrayList;

public class Persona {

	private String DNI;
	private String Nombre;
	private String fechaNacimiento;
	private ArrayList<Coche> Coches;
	
	public Persona (String DNI,String nombre, String fecha) {
		
		this.DNI = DNI;
		this.Nombre = nombre;
		this.fechaNacimiento = fecha;
		Coches = new ArrayList<Coche>();
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [DNI=" + DNI + ", Nombre=" + Nombre + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}
