package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import tienda.Producto;

public class Read {
	
	private final String FICHERO = "C:\\Users\\mario\\Documents\\datos.txt";
	/**
	 * Lee una línea de un fichero de texto y los saca por pantalla
	 */
	public ArrayList<Producto> getDatos(int numero) {
		
		// creo una variable que permite conectar con un fichero para poder leer sus líneas
		BufferedReader ficheroEntrada;
		
		
        try {
        	// BufferedReader enlaza con un fichero; para ello en java hay que crear un FileReader
            ficheroEntrada = new BufferedReader(new FileReader(FICHERO));
 
            // leo una nombre del fichero          
            String nombre=ficheroEntrada.readLine();
            
                     
            ficheroEntrada.close();
        }
        catch (IOException e) {
            System.out.println("Problemas: " +e.getMessage());
        } 
        catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
		return null;
	}
}
