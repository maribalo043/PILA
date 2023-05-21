package utilidades;

import java.util.ArrayList;
import java.util.TreeMap;

import actores.Coche;
import actores.Concesionario;
import actores.Dueño;
import actores.Persona;

public class AsignarCoches {
	
	public ArrayList<Dueño>  asignarCoches(Concesionario conse){
		
		ArrayList<Dueño> devolver = new ArrayList<Dueño>();
		ArrayList<String> asignaciones =  conse.getAsignaciones();
		TreeMap<String,Persona> personas =  conse.getPersonas();
		TreeMap<String,Coche> coches =  conse.getCoches();
		int contador = 0;
		while(contador<6) {
			Dueño persona = new Dueño("","","","","","","");
			persona.setMarca(coches.get(asignaciones.get(contador)).getMarca());
			persona.setColor(coches.get(asignaciones.get(contador)).getColor());
			persona.setMatricula(coches.get(asignaciones.get(contador)).getMatricula());
			persona.setModelo(coches.get(asignaciones.get(contador)).getModelo());
			
			contador++;
			
			persona.setDNI(personas.get(asignaciones.get(contador)).getDNI());
			persona.setNombre(personas.get(asignaciones.get(contador)).getNombre());
			persona.setFechaNacimiento(personas.get(asignaciones.get(contador)).getFechaNacimiento());
			contador++;
			
			devolver.add(persona);
		}
		return devolver;
	}
}
