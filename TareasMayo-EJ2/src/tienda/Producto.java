package tienda;

public class Producto {
	
	private String Codigo;
	private String Nombre;
	private String Cantidad;
	private String Precio;
	
	public Producto (String codigo, String nombre, String cantidad, String precio) {
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

	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}

	public String toString() {
		
		return "Producto"+Codigo+","+Nombre
				+",N:"+Cantidad + "Presio" +": "+Precio+"$";
	}
}
