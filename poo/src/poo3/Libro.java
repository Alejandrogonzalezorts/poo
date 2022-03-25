package poo3;

public class Libro {
	//ATRIBUTOS 
	private String Titulo,Autor;
	private int nEjemplares,nPrestados;
	
	//CONSTRUCTOR SIN PARAMETROS 
	public Libro() {
	}

	//CONSTRUCTOR CON PARAMETROS 
	public Libro(String Titulo,String Autor,int nEjemplares,int nPrestados) {
	
	this.Titulo=Titulo;
	this.Autor=Autor;
	this.nEjemplares=nEjemplares;
	this.nPrestados=nPrestados;
	}
	//METODOS SETTERS Y GETTERS 

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getnEjemplares() {
		return nEjemplares;
	}

	public void setnEjemplares(int nEjemplares) {
		this.nEjemplares = nEjemplares;
	}

	public int getnPrestados() {
		return nPrestados;
	}

	public void setnPrestados(int nPrestados) {
		this.nPrestados = nPrestados;
	}
	
	//METODO PRESTAMO 
	public boolean prestamo() {
		if (nEjemplares <= nPrestados) {
			return false;
			
		}else { nPrestados ++;
		return true;
}
		
		}}
	//METODO DEVOLUCION 	
	

	

	
