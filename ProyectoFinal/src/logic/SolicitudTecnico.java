package logic;

import java.util.ArrayList;

public class SolicitudTecnico extends Solicitud {
	
	private static final long serialVersionUID = 1L;
	private String area; 

	public SolicitudTecnico(float cantVacantes, Empresa empresa, String localidad, int edadMax, 
			int edadMin, int yearExperience, String tipoContrato, boolean vehiculoPropio, 
			int categoriaLicencia, ArrayList<String> idiomas, boolean mudarse, String area, float cantAux) {
		super(cantVacantes, empresa, localidad, edadMax, edadMin, yearExperience,
				tipoContrato, vehiculoPropio, categoriaLicencia, mudarse, idiomas, cantAux);
		
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	

}
