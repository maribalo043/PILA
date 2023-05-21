package tienda;

import java.util.ArrayList;

import utilidades.ComparatorProductos;

public class Empresa {
	
	private ArrayList<Producto> Productos;
	
	public void añadirProductos(Producto Producto) {
		
		ComparatorProductos cp = new ComparatorProductos();
		
		Productos.add(Producto);
		
	}
	
	public String toString() {
		
		String devolver = "";
		for(int i = 0;i<Productos.size();i++) {
			devolver += Productos.get(i).toString(); 
		}
		return devolver;
	}
}
