package discoss;

public class Empleado {

	private String nombre;

//Constructor 
	public Empleado() {
	}

//Constructor con parametros 
	public Empleado(String nombre) {
		this.nombre = nombre;

	}

//Metodo set y get para nombre 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//To String 
	@Override
	public String toString() {
		return "Empleado" + nombre;
	}

}
