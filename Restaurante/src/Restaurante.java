import java.util.ArrayList;
import java.util.Iterator;

public class Restaurante {
	
	private ArrayList<Comanda> comandas;
	
	public Restaurante() {
		comandas = new ArrayList<Comanda>();
	}

	public void crearComanda(Comanda comanda1) {
		
		 comandas.add(comanda1);
		
	}

	public void atenderComanda(Comanda comanda) {
		comandas.remove(comanda);	
		
	} 
	public void escribirComandas() {
		
		EscribirArchivoTexto.Escribir(comandas.iterator());
	}
	@Override
	public String toString() {
		return comandas.toString();
	}

}
