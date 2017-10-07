package Objeto;



public class Persona {

	private String nombre;
	private String apellido;
	private int cedula;
	private int peso;
	private int edad;
	
	public Persona(String nombre, String apellido, int cedula, int peso, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.peso = peso;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Object[] getDetalles() {
		Object[] data = {this.cedula,this.nombre, this.apellido, this.edad,this.peso};
		System.out.println(data);
		return data;
	}
	//String nombre, String apellido, int cedula, int peso, int edad
	public static Persona build(int cedula, String nombre, String apellido,int edad,int peso){
		return new Persona(nombre, apellido,cedula,peso,edad);
	}
		
}
