package poo2;
import java.util.Scanner;

public class ContadorTest {

	public static void main(String[] args) {
		Scanner p=new Scanner (System.in);
		Contador contador1 = new Contador();
			//PIDO VALOR PARA CONTADOR POR PANTALLA 
			System.out.println("Introduce un valor al contador ");
			 int  nombre=p.nextInt();
			 //LO GUARDO EN CONT CON EL SET 
			  contador1.setCont(nombre);
			  //LLAMO AL METODO DE INCREMENTO 
			  contador1.incremento();
			  //IMPRIMO EL CONTADOR INCREMENTADO EN 1
			  System.out.println("Contador1 +1  = "+contador1.getCont());
			  contador1.incremento();
			  contador1.incremento();
			  System.out.println("Contador1 -1= "+contador1.getCont());
			  contador1.decremento();
			  System.out.println("El valor actual -1 es = "+contador1.getCont());
			  
			  //Crear un nuevo objeto Contador con valor inicial 10
			  Contador contador2 = new Contador(10);
			  //Incrementar y decrementar el contador2 y mostrar su valor   
			  contador2.incremento();
			  System.out.println("Contador2 +1 = "+ contador2.getCont());
			  contador2.decremento();
			  System.out.println("Contador2 -1 es = "+ contador2.getCont());
			  
//			  Crear un objeto Contador utilizando el constructor copia
//			  Crear el objeto contador3 como copia de contador2
//			  Mostrar el valor de contador3
			  
			  Contador contador3 = new Contador(contador2);
			  System.out.println("Contador3 es = "+ contador3.getCont() );
			  
		
	
	}

}
