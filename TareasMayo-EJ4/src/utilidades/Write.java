package utilidades;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import actores.Concesionario;
import actores.Dueño;

public class Write {
	
	public void escribir(Concesionario conse,AsignarCoches asignador,String Ubicacion){
		try {
			FileWriter escritor = new FileWriter(Ubicacion);
			String asignaciones = "";
			ArrayList<Dueño> personas = asignador.asignarCoches(conse);
			for(int i = 0;i<3;i++) {
				
				asignaciones+="Persona-Coche:\n \n";
				asignaciones+=personas.get(i).getDNI()+"\n";
				asignaciones+=personas.get(i).getNombre()+"\n";
				asignaciones+=personas.get(i).getFechaNacimiento()+"\n";
				asignaciones+=personas.get(i).getMatricula()+"\n";
				asignaciones+=personas.get(i).getMarca()+"\n";
				asignaciones+=personas.get(i).getModelo()+"\n";
				asignaciones+=personas.get(i).getColor()+"\n";
				asignaciones+="\n";
			}
			escritor.write(asignaciones);
            escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
