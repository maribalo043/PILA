
public class Start {
	
	public static void main(String[] args) {
		
		Restaurante restaurante = new Restaurante();
		
		Comanda comanda1 = new Comanda("Tortilla de patata");
		Comanda comanda2 = new Comanda("Huevos con picadillo");
		Comanda comanda3 = new Comanda("Entremeses frios");
		
		restaurante.crearComanda(comanda1);
		restaurante.crearComanda(comanda2);
		restaurante.crearComanda(comanda3);
		
		restaurante.escribirComandas();
		
		System.out.println(restaurante);
		
		restaurante.atenderComanda(comanda1);
		
		System.out.println(restaurante);
		
		
	}
}
