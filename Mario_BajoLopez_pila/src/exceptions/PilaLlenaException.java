package exceptions;

public class PilaLlenaException extends Exception{

	private static final long serialVersionUID = 1L;
	/**
	 * Creamos la excepcion para cuando la pila se encuentre llena
	 * 
	 * @param texto. Es el texto que devulve cuando hay una excepcion.
	 * 
	 */
	public PilaLlenaException(String texto) {
		super(texto);
	}
}
