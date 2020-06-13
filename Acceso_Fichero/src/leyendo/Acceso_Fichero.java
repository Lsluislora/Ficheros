package leyendo;

/**
 * programa que funciona correctamente. lee un archivo en la ruta especificada. 
 */

/**
 * @author Luis Lora Jaquez
 */



import java.io.FileReader;
import java.io.IOException;

public class Acceso_Fichero {

	public static void main(String[] args) {
		
		Leer_Fichero leyendo = new Leer_Fichero();
		
		leyendo.lee();

	}

}


class Leer_Fichero{
	
	public void lee() {
		
		try {
			FileReader entrada = new FileReader("D:\\escribir_Cliente.txt");
			
			int c = entrada.read();
			
			while(c != -1) {
				
				c = entrada.read();
				
				char letra = (char) c;
				
				System.out.print(letra);
			}
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}
	}
}