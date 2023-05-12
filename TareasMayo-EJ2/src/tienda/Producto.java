package tienda;

public class Producto {
	
	private String Codigo;
	private String Nombre;
	private int Cantidad;
	private double Precio;
	
	public Producto (String codigo, String nombre, int cantidad, float precio) {
		this.Codigo = codigo;
		this.Nombre = nombre;
		this.Cantidad = cantidad;
		this.Precio = precio;
	}
	
	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public String toString() {
		
		return "Producto"+Codigo+","+Nombre
				+",N:"+Cantidad + "Presio" + ""+Precio+"$";
	}
}
