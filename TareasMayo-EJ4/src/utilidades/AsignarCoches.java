package utilidades;

import java.util.ArrayList;
import java.util.TreeMap;
import actores.Coche;
import actores.Concesionario;
import actores.Persona;

public class AsignarCoches {
	
	public ArrayList<Persona>  asignarCoches(Concesionario conse){
		
		ArrayList<String> asignaciones =  conse.getAsignaciones();
		TreeMap<String,Persona> personas =  conse.getPersonas();
		TreeMap<String,Coche> coches =  conse.getCoches();
		ArrayList<Persona> devolver = new ArrayList<Persona>();
		for(int i = 0;i<asignaciones.size();i++) {
			
			
			
		}
		return devolver;
	}
}
