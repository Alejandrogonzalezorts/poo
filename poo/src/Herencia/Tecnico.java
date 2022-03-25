package Herencia;

import discoss.Empleado;

public class Tecnico extends Empleado {
	public Tecnico(){
		
	}
	public Tecnico(String nombre) {
		super(nombre);
	}
		@Override
		public String toString() {
			return  super.toString()+"-> Tecnico";
		}
}
