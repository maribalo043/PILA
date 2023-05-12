package bingo;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	private boolean ganar;
	private String DNI;
	private ArrayList<Integer> carton;

	public Jugador(String nombre, String DNI) {

		this.nombre = nombre;
		this.DNI = DNI;
		this.ganar = false;
		carton = new ArrayList<Integer>();
		/*
		 * Establecemos un numero tope para cuando llegue a 90 se pare y ademas si el
		 * numero esta ya metido en el carton no se mete
		 * 
		 */
		int numero = 0;
		int tope = 10;
		int minimo = 1;
		while (tope < 91) {
			for (int j = 0; j < 2; j++) {

				numero = (int) (Math.random() * 10 + minimo);
				if (!carton.contains(numero)) {
					carton.add(numero);
				} else {
					j--;
				}
			}
			minimo += 10;
			tope += 10;
		}
	}
	public boolean estaVacio() {
		boolean devolver = false;
		if(carton.size()==0) {
			devolver = true;
		}
		return devolver;
	}
	public void tacharNumero(int numero) {
		carton.remove(numero);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isGanar() {
		return ganar;
	}

	public void setGanar(boolean ganar) {
		this.ganar = ganar;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String toString() {
		return nombre + carton.toString();
	}
}
