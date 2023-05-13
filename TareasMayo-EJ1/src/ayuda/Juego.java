package ayuda;

import java.util.ArrayList; 

import bingo.Bingo;
import bingo.Jugador;

public class Juego {
	
	ArrayList<Jugador> Jugadores = new ArrayList<Jugador>();
	
	public Juego (ArrayList<Jugador> Jugadores) {
		
		this.Jugadores = Jugadores;
	}
	public Jugador HayAlgunGanador() {
		
		Jugador ganador = new Jugador("Ganador","Ganador");
		boolean hayGanador = false;
		/*En el siguiente while se realizaria la partida donde se extrae 
		 * un numero y se van "tachando" de los cartones en el caso en el
		 * cual se encontraran los numeros, y mientas haya numeros en los cartones
		 * se seguira en medio del juego, cuando se termine, se devolvera el 
		 * jugador que ha ganado.
		 */
		while(hayGanador == false) {
			Bingo Bolas = new Bingo();
			Integer numero = 0;
			numero = Bolas.extraerNumero();
			for(int i =0;i<Jugadores.size();i++) {
				if(Jugadores.get(i).getCarton().contains(numero)) {
					Jugadores.get(i).tacharNumero(numero);
				}
			}
			for(int i =0;i<Jugadores.size();i++) {
				if(Jugadores.get(i).getCarton().isEmpty()) {
					hayGanador = true;
					ganador = Jugadores.get(i);
				}
			}
		}
		String devolver = "";
		for(int i =0;i<Jugadores.size();i++) {
			devolver += Jugadores.get(i).getNombre();
			devolver += Jugadores.get(i).getCarton().toString()+"\n";
		}
		System.out.println(devolver);
		return ganador;	
	}
}
