package poo;

public class Cuenta {

	//atributos
	
	private String NombreCliente,NumeroCuenta;
	private double TipoInteres,Saldo;
	
	//METODOS
	
	//CONSTRUCTOR SIN PARAMETROS 
	public Cuenta () {
	}
	
	
	//CONSTRUCTOR CON PARAMETROS 
	public Cuenta (String nc, String numc, double ti, double sal){
	
	NombreCliente = nc;
	NumeroCuenta = numc;
	TipoInteres = ti;
	Saldo = sal;
	

}
	//METODOS GETTER Y SETTERS

	public String getNombreCliente() {
		return NombreCliente;
	}


	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}


	public String getNumeroCuenta() {
		return NumeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}


	public double getTipoInteres() {
		return TipoInteres;
	}


	public void setTipoInteres(double tipoInteres) {
		TipoInteres = tipoInteres;
	}


	public double getSaldo() {
		return Saldo;
	}


	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	
	//METODOS INGRESO Y REINTEGRO 
	boolean ingreso(double cantidad) {
      
        
        if (cantidad <0) {
        	System.out.println("la cantidad no puede ser negativa");
        	return false;
		}else {
		this.Saldo = Saldo + cantidad;
		return true;
	}
	
}
	boolean reintegro(double cantidad) {
		
		if (Saldo <0) {
			System.out.println("El Saldo es negativo");
			return false;
		
		}else if (cantidad<0) {
			this.Saldo = Saldo-cantidad;
			
		}
		return true;
		
	
	
	}

	
	//METODO TRANSFERENCIA
	
	boolean transferencia(Cuenta c , double cantidad) {
	reintegro(cantidad);
	c.ingreso(cantidad);
	return true;
}}
