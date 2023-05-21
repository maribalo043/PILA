package go;

import java.io.IOException;

import actores.Concesionario;
import utilidades.AsignarCoches;
import utilidades.Write;


public class Start {

	public static void main(String[] args){
			try {
			Concesionario primero = new Concesionario();
			AsignarCoches asignador = new AsignarCoches();
			Write escritor = new Write();
			escritor.escribir(primero, asignador, "C:\\Users\\mario\\OneDrive\\Escritorio\\Archivos de texto Eclipse\\EJ4_MAYO\\RESULTADO.txt");
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		
		
	}
}
