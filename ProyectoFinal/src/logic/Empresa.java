package logic;

import java.util.ArrayList;
import java.io.Serializable;
import java.time.LocalDate;
//hola
public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;
	private String RNC;
	private String nombre;
	private String telefono;
	private String provincia; 
	private String ciudad;
	private String direccion;
	private String calle; 
	private int numeroLocal; 
	private String area; 
	private String email;
	private String referencia; 
	private ArrayList<Personal> misEmpleadosC;
	
	public Empresa(String RNC, String nombre, String telefono, String provincia, String ciudad, String direccion, String calle, int numeroLocal, String area, String email, String referencia) {
		super();
		this.RNC = RNC;
		this.nombre = nombre;
		this.telefono = telefono;
		this.provincia = provincia; 
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.calle = calle; 
		this.numeroLocal = numeroLocal; 
		this.area = area; 
		this.email = email;
		this.referencia = referencia; 
		this.misEmpleadosC = new ArrayList<Personal>();
	}

	public String getRNC() {
		return RNC;
	}

	public void setRNC(String RNC) {
		this.RNC = RNC;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumeroLocal() {
		return numeroLocal;
	}

	public void setNumeroLocal(int numeroLocal) {
		this.numeroLocal = numeroLocal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public ArrayList<Personal> getMisEmpleadosC() {
		return misEmpleadosC;
	}
	
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	//Funci�n para agregar un empleado contratado
	public void insertarEmpleadoC(Personal empleadoC) {
		LocalDate date = LocalDate.now();
		empleadoC.setFechaContratado(date);
		empleadoC.setContratado(true);
		misEmpleadosC.add(empleadoC);
	}
	
	//Funci�n para comprobar que sea un email v�lido
	private void comprobarEmail(String correo) {
		boolean arroba = false;
		for(int i = 0; i<correo.length(); i++) {
			
			if(correo.charAt(i) == '@') { //chartAt devuelve el caracter en el indice que se especifica en la cadena
				arroba = true;
				
			}
		}
		
		if(arroba) {
			this.email = correo;
		}
		else {
			this.email = "Email no v�lido";
		}
	}

}
