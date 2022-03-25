package poo6;

public class Fecha {

	private int dia, mes, año;
	
//CONSTRUCTOR SIN PARAMETROS 
	public Fecha() {
	}

//CONSTRUCTOR CON PARAMETROS 
	public Fecha(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;

	}
//GETTERS Y SETTERS 

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

//METODO FECHA CORRECTA 

public boolean FechaCorrecta() {
	boolean diaC = true;
	boolean mesC = true;
	boolean añoC = true;
	if (año <= 0 ) {
		añoC = false;
	}
	if (mes <1 || mes>12) {
		mesC = false;
	}
	if (mes == 1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12 ) {
		if (dia <1 || dia >31) {
			diaC = false;
		}
	}
	if (mes == 4 ||mes == 6 ||mes == 9 ||mes == 11 ) {
		if (dia<1 || dia>30) {
			
		}
		diaC = false;
	}
	if (año == 2 ) {
		if (EsBisiesto()) {
			if (dia<1 || dia>29) {
				
			}
			diaC=false;
		}else {
				if (EsBisiesto()==false) {
					if (dia<1 || dia<28) {
						
					}
					diaC = false;
				}
			}
			
		}
		
	
	
return diaC && mesC && añoC;	
}

//METODO BISIESTO 
	public boolean EsBisiesto() {
		if (año % 4 == 0 && año % 100 == 0 && año % 400 == 0) {
			return true;
		} else {
			System.out.println("el año no es bisiesto");
			return false;
		}

		
	}
//METODO DIA SIGUIENTE 
	public void diaSiguiente() {
		
		 if ((mes == 1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && dia ==31) {
			 dia = 1 ;
			 if (mes ==12) {
				mes = 1 ;
			}else {
				mes = mes +1;
				
			}
					 
		 }
		 if ((mes == 4 ||mes == 6 ||mes == 9 ||mes == 11) && dia == 30 ) {
			 dia = 1; 
			 if (mes ==12) {
					mes = 1 ;
				}else {
					mes = mes +1;
			 
		 }
		 
		
	}
	 
}
	//TO STRING 

	@Override
	public String toString() {
		if (dia <10 & mes <10) {
			String Fecha = "0"+ dia +"/"+"0"+mes+"/"+año;
			return Fecha ;
		} else {
			if (dia<10 & mes >10) {
				String Fecha ="0"+dia+"/"+mes+"/"+año ;
				return Fecha;
			}else {
				if(dia>10 & mes <10){
					String Fecha = dia+"/"+"0"+mes+"/"+año;
					return Fecha;
				}else {
					 String Fecha = dia+"/"+mes+"/"+año;
					 return Fecha;
						
					}
				}
				
			}
			
		
		
	}
	
	}
