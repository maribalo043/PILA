package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;	
import tienda.Producto;

public class Read {
	
	/**
	 * Lee una línea de un fichero de texto y los saca por pantalla
	 */
	public Producto getDatos(String fichero) {
		
		// creo una variable que permite conectar con un fichero para poder leer sus líneas
		BufferedReader ficheroEntrada;
		
		Producto devolver = null;
        try {
        	// BufferedReader enlaza con un fichero; para ello en java 
        	//hay que crear un FileReader
            ficheroEntrada = new BufferedReader(new FileReader(fichero));
            
            
            
            
            String Codigo=ficheroEntrada.readLine();
            String Nombre=ficheroEntrada.readLine();
            String cantidad=ficheroEntrada.readLine();
            String precio=ficheroEntrada.readLine();
            
            devolver = new Producto(Codigo,Nombre,cantidad,precio);
            ficheroEntrada.close();
        }
        catch (IOException e) {
            System.out.println("Problemas: " +e.getMessage());
        } 
        catch (Exception e) {
			// Otro fallos
			e.printStackTrace();
		}
		return devolver;
	}
}
