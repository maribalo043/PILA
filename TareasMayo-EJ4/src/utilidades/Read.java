package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import actores.Coche;
import actores.Persona;

public class Read {
	
	private String ubicacion;
	/**
	 * Este metodo sirve para leer cualquier archivo de texto que querramos
	 * pero lo vamos a modelar de tal forma que se espezialize en leer atributos
	 * de la clase coche y asi puedan crearse los objetos.
	 * 
	 * @param ubicacion Aqui metemos la direccion del archivo de texto.
	 * @return devolvemos todos los objetos creados metidos en un ArrayList.
	 * @throws IOException 
	 * 
	 */
	public TreeMap<String,Coche> leerCoches (String ubicacion) throws IOException{
		
		TreeMap<String,Coche> devolver = new TreeMap<String,Coche>();
		BufferedReader lector = new BufferedReader(new FileReader(ubicacion));
		
		String nombre = "";
		while(nombre!=null) {
			nombre = lector.readLine();
			if(nombre != null) {
			Coche coche = new Coche(nombre,"","","");
			coche.setMarca(lector.readLine());
			coche.setModelo(lector.readLine());
			coche.setColor(lector.readLine());
			devolver.put(coche.getMatricula(),coche);
			}
		}
		
		
		return devolver;
	}
	/**
	 * Este metodo sirve para leer cualquier archivo de texto que querramos
	 * pero lo vamos a modelar de tal forma que se espezialize en leer atributos
	 * de la clase Persona y asi puedan crearse los objetos.
	 * 
	 * @param ubicacion Aqui metemos la direccion del archivo de texto.
	 * @return devolvemos todos los objetos creados metidos en un ArrayList.
	 * @throws IOException 
	 * 
	 */
	public TreeMap<String,Persona> leerPersonas (String ubicacion) throws IOException{
		TreeMap<String,Persona> devolver = new TreeMap<String,Persona>();
		BufferedReader lector = new BufferedReader(new FileReader(ubicacion));
		
		String nombre = "";
		while(nombre!=null) {
			nombre = lector.readLine();
			if(nombre != null) {
			Persona persona = new Persona(nombre,"","");
			persona.setNombre(lector.readLine());
			persona.setFechaNacimiento(lector.readLine());
			devolver.put(persona.getDNI(),persona);
			}
		}
		return devolver;
	}
	/**
	 * Este metodo sirve para leer cualquier archivo de texto que querramos
	 * pero lo vamos a modelar de tal forma que se espezialize en leer atributos
	 * de la clase Persona y asi puedan crearse los objetos.
	 * 
	 * @param ubicacion Aqui metemos la direccion del archivo de texto.
	 * @return devolvemos todos los objetos creados metidos en un ArrayList.
	 * @throws IOException 
	 * 
	 */
	public ArrayList<String> leerAsignaciones (String ubicacion) throws IOException{
		ArrayList<String> devolver = new ArrayList<String>();
		BufferedReader lector = new BufferedReader(new FileReader(ubicacion));
		String nombre = "";
		while(nombre!= null) {
			
			nombre = lector.readLine();
			if(nombre!=null) {
				devolver.add( nombre);
			}
		}
		
		return devolver;
	}
}
