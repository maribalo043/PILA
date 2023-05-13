package bingo;

import java.util.HashSet;

public class Bingo {
	
	private HashSet<Integer> numeros;
	
	public Bingo(){
		numeros = new HashSet<Integer>();
		int i = 1;
		for(i = 0 ;i<91;i++) {
			numeros.add(i);
		}
	}
	public int extraerNumero() {
		int devolver = 0;
		int numero = 0;
		int binario = 0;
		numero = (int)(Math.random()*89+1);
		while(binario == 0) {
			numero = (int)(Math.random()*89+1);
			if(numeros.contains(numero)) {
				binario = 1;
			}
		}
		devolver = numero;
		numeros.remove(numero);
		return devolver;	
	}

	public HashSet<Integer> getNumeros() {
		return numeros;
	}
	
	public String toString() {
		return numeros.toString();
	}
}