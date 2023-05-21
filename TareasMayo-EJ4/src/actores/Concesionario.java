package actores;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

import utilidades.Read;

public class Concesionario {
	
	private TreeMap<String,Coche> Coches;
	private TreeMap<String,Persona> Personas;
	private ArrayList<String> Asignaciones;
	
	public Concesionario() throws IOException {
		Read lector = new Read();
		this.Coches = lector.leerCoches("C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ4_MAYO\\COCHES.txt");
		this.Personas = lector.leerPersonas("C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ4_MAYO\\PERSONAS.txt");
		this.Asignaciones = lector.leerAsignaciones("C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ4_MAYO\\ASIGNACIONES.txt");
	}
	public TreeMap<String,Coche> getCoches() {
		return Coches;
	}

	public void setCoches(TreeMap<String,Coche> coches) {
		Coches = coches;
	}

	public TreeMap<String,Persona> getPersonas() {
		return Personas;
	}

	public void setPersonas(TreeMap<String,Persona> personas) {
		Personas = personas;
	}

	public ArrayList<String> getAsignaciones() {
		return Asignaciones;
	}

	public void setAsignaciones(ArrayList<String> asignaciones) {
		Asignaciones = asignaciones;
	}

	@Override
	public String toString() {
		return "Concesionario [Coches=" + Coches + "\n, Personas=" + Personas + "\n, Asignaciones=" + Asignaciones + "]";
	}
	
}
