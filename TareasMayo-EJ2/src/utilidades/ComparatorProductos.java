package utilidades;

import java.util.Comparator;

import tienda.Producto;

public class ComparatorProductos implements Comparator<Producto>{

	@Override
	public int compare(Producto o1, Producto o2) {
		boolean esIgual = o1.equals(o2);
		int devolver = 0;
		if(esIgual) {
			devolver = 1;
		}else {
			devolver = 0;
		}
		return devolver;
	}

}
