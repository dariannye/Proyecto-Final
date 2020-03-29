package logic;

import java.util.ArrayList;

//probando
public class Bachiller extends Personal {
	
	private static final long serialVersionUID = 1L;
	private ArrayList<String> habilidades;

	public Bachiller(String cedula, String name, String apellido, String sexo, String nacionalidad,  String provincia,
			String ciudad, String sector, String calle, String numeroCasa, String referencia,  int edad, String telefono, String correo,
			int yearExperiencia, boolean vehiculo, int categoriaLicencia, boolean dispViajar, boolean mudarse,
			boolean contratado, String estudiosComplementarios,ArrayList<String> habilidades) {
		super(cedula, name, apellido, sexo, nacionalidad, provincia, ciudad, sector, calle, numeroCasa, referencia, edad, telefono, correo,
				yearExperiencia, vehiculo, categoriaLicencia, dispViajar, mudarse, contratado, estudiosComplementarios);
		// TODO Auto-generated constructor stub
		
	   this.habilidades = new ArrayList<>();
	   for (String habili : habilidades) {
			this.habilidades.add(habili);
			
		}
	}
	
	@Override
	void insertarIdioma(String aux){
		idiomas.add(aux); 
	}

	public ArrayList<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<String> habilidades) {
		this.habilidades = habilidades;
	}
	

	//Probando
}
