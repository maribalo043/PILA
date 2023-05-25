package actores;

import java.util.ArrayList;
import java.util.Iterator;

import exceptions.PilaLlenaException;
import utilidades.Write;

public class Pila {

	private ArrayList<Integer> pila;
	private int cuantosNumeros;

	/**
	 * Este es el constructor del objeto Pila, inicializamos el ArrayList y ademas
	 * como el ArrayList esta vacio ya inicializamos el atributo cuantosNumeros en 0
	 * por que no hay ningun numero.
	 */
	public Pila() {
		this.pila = new ArrayList<Integer>();
		this.cuantosNumeros = 0;
	}
	/**
	 * Operacion para añadir elementos a la pila, si la pila esta llena ç
	 * saltara la excepcion.
	 * 
	 * @param numero numero que queremos introducir
	 * @return devulve si fue posible añadir el numero o no.
	 * @throws PilaLlenaException excepcion que salta si la pila esta llena
	 */
	public boolean añadirNumero(int numero) throws PilaLlenaException {
		boolean devolver = false;

		if (cuantosNumeros < 30) {
			pila.add(numero);
			devolver = true;
			cuantosNumeros ++;
		} else {
			PilaLlenaException excepcion = new PilaLlenaException("La pila esta llena, retire algun numero");
			throw excepcion;
		}

		return devolver;
	}
	/**
	 * operacion para eliminar numeros de la pila, en este caso no hay excepciones
	 * pero si un if que nos protege de problemas futuros
	 * @return devuelve si se pudo eliminar el numero o no.
	 */
	public boolean eliminarNumero(){
		boolean devolver = false;
		
		if(cuantosNumeros>0) {
			pila.remove(0);
			devolver = true;
			cuantosNumeros--;
		}		
		return devolver;
	}
	/**
	 * metodo para saber si esta llena la pila
	 * @return devulve si esta llena o no.
	 */
	public boolean isLlena() {
		boolean devolver = false;
		if(cuantosNumeros ==30) {
			devolver = true;
		}
		return devolver;
	}
	/**
	 * metodo para saber si la pila esta vacia.
	 * @return devulve si esta vacia o no.
	 */
	public boolean isVacia() {
		boolean devolver = false;
		if(cuantosNumeros ==0) {
			devolver = true;
		}
		return devolver;
	}
	/**
	 * Metodo para saber cuantos numeros tiene la pila en ese momento
	 * @return devuelve el numero de elementos que hay
	 */
	public int cuantosNumeroshay() {
		int devolver = 0;
		devolver=pila.size();
		return devolver;
	}
	/**
	 * Getter para que cuando queramos saber el numero de espacios ocupados dentro
	 * de la pila
	 * 
	 * @return devulve el contenido del atributo cuantosNumeros
	 */
	public int getCuantosNumeros() {
		return this.cuantosNumeros;
	}
	/**
	 * creamos un iterador para pasarlo de una clase a otra de forma protegida
	 * @return
	 */
	public Iterator<Integer> crearIterador(){
		return pila.iterator();
	}
	/**
	 * Metodo para poder escribir los numeros en un archivo txt
	 * @param ubicacion es el archivo donde se van a escribir.
	 * @param iterador es para poder recorrerlo y escribirlo y camuflar
	 * el ArrayList.
	 */
	public void escribirNumeros(String ubicacion,Iterator<Integer> iterador) {
		Write escritor = new Write();
		escritor.escribirFichero(ubicacion, iterador);
	}
	/**
	 * Getter para que cuando queramos acceder al ArrayList dentro de la pila
	 * 
	 * @return devuelve el contenido del atributo pila
	 */
	public ArrayList<Integer> getPila() {
		return this.pila;
	}
/**
 * Metodo para imprimir las pilas por pantalla
 */
	public String toString() {
		return "Pila,\n Capacidad ocupada: " + cuantosNumeros + "\n" + pila.toString();
	}
}
