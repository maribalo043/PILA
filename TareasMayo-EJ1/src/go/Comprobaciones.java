package go;

import java.util.ArrayList;

public class Comprobaciones {

	public static void main(String[] args) {

		ArrayList<Integer> carton = new ArrayList<Integer>();
		carton.add(1);
		while (carton.contains(1)) {
			if (!carton.contains(1)) {
				System.out.println("entro");
			} else {
				System.out.println("no entro");
			}
		}

	}

}
