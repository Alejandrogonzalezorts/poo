package poo2;

public class Contador {
//Atributos
	private int cont;
	
	//CONSTRUCTOR SIN PARAMETROS 
	public Contador() {
} 
	
	//CONSTRUCTOR CON PARAMETROS 
	public Contador(int cont) {
		this.cont = cont;
		if  (cont <0) {
			this.cont = 0;
			
		}
		
	}
	
	//CONSTRUCTOR COPIA 
	public Contador(Contador ObjContador) {
		this.cont = ObjContador.cont;
	}
	//METODOS GETTERS Y SETTERS 

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	//METODOS INCREMENTAR Y DECREMENTAR
	public int incremento() {
		cont ++;
		return cont;
	}
	public int decremento() {
		 cont --;
		if (cont <0) {
			cont = 0;			
		}
		return cont;
	}
}
