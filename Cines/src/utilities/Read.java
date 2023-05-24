package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import objects.Cine;
import objects.Pelicula;


public class Read {
	
	
	public final static String FICHEROC = "C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ3_MAYO\\Cines.txt";
	
	public final static String FICHEROP = "C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ3_MAYO\\Peliculas.txt";
	
	
	
	public static Iterator<Cine> leer(String fichero1,String fichero2){
		
		BufferedReader ficheroEntrada1; 
		BufferedReader ficheroEntrada2; 
		ArrayList<Cine> cines = new ArrayList<Cine>();
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

		try {
 			ficheroEntrada1 = new BufferedReader(new FileReader(fichero1));
			
 			ficheroEntrada2 = new BufferedReader(new FileReader(fichero2));
 			
				
				String titulo = ficheroEntrada2.readLine();
				
				while (titulo!=null) {
					String director = ficheroEntrada2.readLine();
					String anio = ficheroEntrada2.readLine();
					String codCines = ficheroEntrada2.readLine();
					
					Pelicula nueva = PeliculaCreator.crearPeliculas(titulo,director,anio,codCines);
					
					peliculas.add(nueva);
					
					titulo = ficheroEntrada2.readLine();
				}
				ficheroEntrada2.close();
				
				
				
				String codigo = ficheroEntrada1.readLine();
				
				while (codigo!=null) {
					String nombre = ficheroEntrada1.readLine();
					String nSalas = ficheroEntrada1.readLine();
					String localidad = ficheroEntrada1.readLine();
					
					Cine nuevo = CineCreator.crearCines(codigo,nombre,nSalas,localidad,peliculas.iterator());
					cines.add(nuevo);
					codigo = ficheroEntrada1.readLine();
				}
				ficheroEntrada1.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cines.iterator();
	}
}
