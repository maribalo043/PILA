package tienda;

import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Producto> Productos;
	
	public String toString() {
		
		String devolver = "";
		for(int i = 0;i<Productos.size();i++) {
			devolver += Productos.get(i).toString(); 
		}
		return devolver;
	}
}
