package poo5;

public class Fraccion {
//ATRIBUTOS
	private int num,den;

//CONSTRUCTOR SIN PARAMETROS 
public Fraccion() {
	//EL VALOR MINIMO SERA LA FRACCION 0/1
	num=0;
	den=1;
}
//CONSTRUCTOR CON PARAMETROS 
public Fraccion(int num, int den) {
	//PARA EVITAR TENER FRACCIONES CON DENOMINADOR 0 
	//PONEMOS AQUI ESA CONDICION 
	this.num= num;
	if (den == 0 ) {
		den =1;
	}
	this.den=den;
	simplificar();
}
//CONSTRUCTOR COPIA 	
public Fraccion(final Fraccion f) {
		num= f.num;
		den= f.den;
}
//SIMPLIFICAR 
//método para simplificar fracciones
public void simplificar() {
	int n=mcd();
	num=num/n;
	den=den/n;
}
//SETTERS Y GETTERS 
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public int getDen() {
	return den;
}
public void setDen(int den) {
	this.den = den;
}
//MAXIMO COMUN DIVISOR                                          
private int mcd() {
    int u = Math.abs(num); //valor absoluto del numerador
    int v = Math.abs(den); //valor absoluto del denominador
    if (v == 0) {
        return u;
    }
    int r;
    while (v != 0) {
        r = u % v;
        u = v;
        v = r;
    }
    return u;
}
//Método toString
public String toString() {
	String mensaje = num+ "/"+den;
	return mensaje;
	
}
//METODO SUMAR 

public void sumar() {
	
}

}