package actores;

public class Dueño {
	
	private String DNI;
	private String Nombre;
	private String fechaNacimiento;
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	
	public Dueño (String DNI,String nombre, String fecha,
			String matricula,String marca,String modelo,String color) {
		
		this.DNI = DNI;
		this.Nombre = nombre;
		this.fechaNacimiento = fecha;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dueño [DNI=" + DNI + ", Nombre=" + Nombre + ", fechaNacimiento=" + fechaNacimiento + ", matricula="
				+ matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
	
}
