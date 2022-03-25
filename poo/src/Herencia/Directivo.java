package Herencia;

import discoss.Empleado;

public class Directivo extends Empleado{
	
		public Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Directivo(String nombre) {
			super(nombre);
		}
		@Override
		public String toString() {
			return  super.toString()+"-> Directivo";
		}
}
