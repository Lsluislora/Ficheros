package escribiendo;

/**
 * FUNCIONA CORRECTAMENTE. ESCRIBE LO QUE SE INDICA EN LA FRASE EN UN ARCHIVO TXT EN LA RUTA ESPECIFICADA. 
 */

/**
 * @author Luis Lora Jaquez
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Fichero {

	public static void main(String[] args) {

		Escribiendo escribir = new Escribiendo();

		escribir.escribir_texto();

	}

}

class Escribiendo {

	public void escribir_texto() {

		String frase = "Esta sera la Primera Linea de Codigo";

		try {
			FileWriter fr = new FileWriter("D:\\Escribir.txt"); // El archivo se creara en el disco D

			for (int i = 0; i < frase.length(); i++) {

				fr.write(frase.charAt(i));

			}

			System.out.println("El archivo se ha creado correctamente. ");

			fr.close();

		} catch (IOException e) {
			// TODO Bloque catch generado automáticamente

			e.printStackTrace();
		}

	}
}
