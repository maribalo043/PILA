package actores;

public class Coche {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	
	/**
	 * Aqui esta el constructor que se encarga de construir los objeros de tipo coche
	 * @param matricula meter el valor en el atributo
	 * @param marca meter el valor en el atributo
	 * @param modelo meter el valor en el atributo
	 * @param color meter el valor en el atributo
	 */
	public Coche(String matricula,String marca,String modelo,String color) {	
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}
	/*Se generan getters y setters por si acaso se necesitaran mas adelante que es lo mas probable*/
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
		return "Coche [matricula=" + matricula + ", marca=" +
	marca + ", modelo=" + modelo + ", color=" + color + "]";
	}
	

}
