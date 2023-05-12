package go;

import bingo.Bingo;
import bingo.Jugador;

public class Start {
	public static void main(String[] args) {
		
		Bingo uno = new Bingo();
		
		System.out.println(uno);
		Jugador dos = new Jugador("Pepe Luis","34293782T");
		System.out.println(dos);
		uno.extraerNumero();
		System.out.println(uno);

	}
}
