package go;

import actores.Pila;
import exceptions.PilaLlenaException;


public class Start {

	public static void main(String[] args) {
		
		Pila pila = new Pila();
		for(int i =0;i<40;i++) {
			try {
				pila.añadirNumero((int)(Math.random()*50));
			} catch (PilaLlenaException e) {
				e.printStackTrace();
			}
		}
		pila.escribirNumeros("salida1.txt",pila.crearIterador());
		
		for(int i = 0;i<10;i++) {
			pila.eliminarNumero();
		}
		pila.cuantosNumeroshay();
		
		pila.escribirNumeros("salida2.txt",pila.crearIterador());
		
		for(int i =0;i<30;i++) {
			pila.eliminarNumero();
		}
		System.out.println(pila);
		
	}
}
