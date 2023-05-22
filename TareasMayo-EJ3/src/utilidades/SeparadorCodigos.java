package utilidades;

public class SeparadorCodigos {

	public String separarCodigo(String codigo, int posicion) {
        String[] partes = codigo.split("\\*");
        if (posicion < partes.length) {
            return partes[posicion];
        }
		return codigo; 
    }
}
