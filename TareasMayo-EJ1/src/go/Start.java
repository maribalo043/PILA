package go;

import java.util.ArrayList;

import ayuda.Juego;
import bingo.Bingo;
import bingo.Jugador;

public class Start {
	public static void main(String[] args) {
		
		Jugador Pepe = new Jugador("Pepe","skhdvbkdh");
		Jugador Juan = new Jugador("Juan","skhdvbkdh");
		Jugador Pablo = new Jugador("Pablo","skhdvbkdh");
		Jugador Jnadro = new Jugador("Jnadro","skhdvbkdh");
		Jugador Roberto = new Jugador("Roberto","skhdvbkdh");
		
		ArrayList<Jugador> Jugadores = new ArrayList<Jugador>();
		Jugadores.add(Roberto);
		Jugadores.add(Pepe);
		Jugadores.add(Jnadro);
		Jugadores.add(Pablo);
		Jugadores.add(Juan);
		
		Juego Juego1 = new Juego(Jugadores);
		System.out.println(Juego1.HayAlgunGanador());
	}
}
