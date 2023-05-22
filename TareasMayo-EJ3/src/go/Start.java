package go;

import java.io.IOException;

import cine.Cinesa;

public class Start {

	public static void main(String[] args) {
		
		Cinesa Cines = null;
		try {
			Cines = new Cinesa();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(Cines.getPeliculas());
		System.out.println(Cines.getCines());
		 
		
	}
}
