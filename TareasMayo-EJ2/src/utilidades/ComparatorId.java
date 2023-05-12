package utilidades;

import java.util.Comparator;

import tienda.Producto;

public class ComparatorId implements Comparator<Producto> {

	@Override
	public int compare(Producto o1, Producto o2) {
		
		boolean esIgual = false;
		int devolver = 0;

		esIgual = o1.getCodigo().equals(o2.getCodigo());
		
		if (esIgual) {
			devolver = 0;
		} else {
			devolver = 1;
		}
		
		return devolver;
	}
}