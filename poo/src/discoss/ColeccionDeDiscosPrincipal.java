package discoss;
import java.util.Scanner;

/**
 * ColeccionDeDiscosPrincipal.java
 * Gestión de una colección de discos.
 */
public class ColeccionDeDiscosPrincipal {

  // N determina el tamaño del array
  static int N = 3;
  
  public static void main(String[] args) {
	  
	  Scanner s=new Scanner(System.in);
		  

    //Crea el array de discos
    Disco[] album = new Disco[N];

    // Crea todos los discos que van en cada una de
    // las celdas del array
    for(int i = 0; i < N; i++) {
      album[i] = new Disco();
    }

    int opcion;
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int duracionIntroducida;
    int primeraLibre;
    int i;
    
    do {
      imprimeCRUD();
      opcion = s.nextInt();
      
      switch (opcion) {
      case 1:
        System.out.println("\nLISTADO");
        System.out.println("=======");
        for(i = 0; i < N; i++) {
          if (!album[i].getCodigo().equals("LIBRE")) {
            System.out.println(album[i]);
          }
        }
        break;
        
      case 2:
        System.out.println("\nNUEVO DISCO");
        System.out.println("===========");
        
        // Busca la primera posición libre del array
        primeraLibre = -1;
        do {
          primeraLibre++;
        } while (!((album[primeraLibre].getCodigo()).equals("LIBRE")));
        
        System.out.println("Por favor, introduzca los datos del disco.");  
        
        System.out.print("Código: ");
        s.nextLine();
        codigoIntroducido =s.nextLine();
        album[primeraLibre].setCodigo(codigoIntroducido);
        
        System.out.print("Autor: ");
        autorIntroducido = s.nextLine();
        album[primeraLibre].setAutor(autorIntroducido);
        
        System.out.print("Título: ");
        tituloIntroducido = s.nextLine();
        album[primeraLibre].setTitulo(tituloIntroducido);
        
        System.out.print("Género: ");
        generoIntroducido =s.nextLine();
        album[primeraLibre].setGenero(generoIntroducido);
       
        System.out.print("Duración: ");
        duracionIntroducida = s.nextInt();
        album[primeraLibre].setDuracion(duracionIntroducida);
        
        break;
        
      case 3:
        System.out.println("\nMODIFICAR");
        System.out.println("===========");
        
        s.nextLine();
        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigoIntroducido =s.nextLine();
  
        i = -1;
        do {
          i++;
        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
        
        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
  
        System.out.println("Código: " + album[i].getCodigo());
        System.out.print("Nuevo código: ");
        codigoIntroducido = s.nextLine();
        if (!codigoIntroducido.equals("")) {
          album[i].setCodigo(codigoIntroducido);
        }
        
        System.out.println("Autor: " + album[i].getAutor());
        System.out.print("Nuevo autor: ");
        autorIntroducido = s.nextLine();
        if (!autorIntroducido.equals("")) {
          album[i].setAutor(autorIntroducido);
        }
        
        System.out.println("Título: " + album[i].getTitulo());
        System.out.print("Nuevo título: ");
        tituloIntroducido = s.nextLine();
        if (!tituloIntroducido.equals("")) {
          album[i].setTitulo(tituloIntroducido);
        }
        
        System.out.println("Género: " + album[i].getGenero());
        System.out.print("Nuevo género: ");
        generoIntroducido = s.nextLine();
        if (!generoIntroducido.equals("")) {
          album[i].setGenero(generoIntroducido);
        }
        
        System.out.println("Duración: " + album[i].getDuracion());
        System.out.print("Duración: ");
        duracionIntroducidaString = s.nextLine();
        if (!duracionIntroducidaString.equals("")) {
          album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
        }
        
        break;
        
      case 4:
        System.out.println("\nBORRAR");
        System.out.println("======");
        s.nextLine();
        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigoIntroducido =s.nextLine();
  
        i = -1;
        do {
          i++;
        } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
        album[i].setCodigo("LIBRE");
        System.out.println("Album borrado.");
        
        break;
        
      default:
    	  System.out.println("\nHa salido de la aplicación");
      
      } // switch
    } while (opcion != 5);
    s.close();
  }
  
  public static void imprimeCRUD() {
	  System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
  }
}