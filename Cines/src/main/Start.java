package main;

import java.util.ArrayList;     
import java.util.HashMap;
import java.util.Iterator;

import objects.Cine;
import objects.Pelicula;
import utilities.Read;
import utilities.Write;

public class Start {

	public static void main(String[] args) {
		
		Iterator<Cine> cines = Read.leer(Read.FICHEROC,Read.FICHEROP);
		
		Write escribir = new Write();
		 
		escribir.escribirFichero(cines);
		
	}

}