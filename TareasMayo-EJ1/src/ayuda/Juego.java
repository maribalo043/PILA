package ayuda;

import java.util.ArrayList;
import java.util.Iterator;

import bingo.Jugador;

public class Juego {
	
	ArrayList<Jugador> Jugadores = new ArrayList<Jugador>();
	
	@SuppressWarnings("unchecked")
	public Juego (Iterator<Jugador> Jugadores) {
		
		this.Jugadores = (ArrayList<Jugador>)Jugadores;
	}
	public Jugador HayAlgunGanador() {
		
		Jugador ganador = new Jugador("","");
		boolean hayGanador = false;
		/*En el siguiente while se realizaria la partida donde se extrae 
		 * un numero y se van "tachando" de los cartones en el caso en el
		 * cual se encontraran los numeros, y mientas haya numeros en los cartones
		 * se seguira en medio del juego, cuando se termine, se devolvera el 
		 * jugador que ha ganado.
		 */
		while(hayGanador == false) {
			
		}
		return ganador;
	}
}
