package programacion;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class CopiarArchivos {

	/*
	 * Mediante código y utilizando FileOutputStream realizarás una copia del
	 * contenido de archivo.txt a otro fichero llamado copia.txt. Crear archivo1.txt
	 * con el contenido de archivo.txt. Mediante código y usando BufferedWriter
	 * realizarás una copia del contenido de archivo.txt a otro archivo llamado
	 * archivo1.txt Crear archivo2.txt con el contenido de archivo.txt.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rutaArchivo = System.getProperty("user.dir") + "/src/ejercicios_java/assets/";

		String archivoOriginal = "archivo.txt";
		// 1. Con FileOutputStream copiar el contenido de archivo.txt a copia.txt

		String archivoCopiado = "copia.txt";
		FileInputStream entrada = null;
		FileOutputStream salida = null;

		try {

			entrada = new FileInputStream(rutaArchivo + archivoOriginal);
			salida = new FileOutputStream(rutaArchivo + archivoCopiado);
			int cadena;
			while ((cadena = entrada.read()) != -1) {
				salida.write(cadena);
			}
		} catch (IOException e) {

			System.out.println("No puede encontrar archivo: " + archivoOriginal);
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (salida != null) {
				try {
					salida.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		// 2. Usando BufferedWriter copiar el contenido de archivo.txt a archivo1.txt
		archivoCopiado = "archivo1.txt";
		// podemos usar otro nombre o el mismo que el anterior
		BufferedReader input = null;
		BufferedWriter output = null;

		try {
			input = new BufferedReader(new FileReader(rutaArchivo + archivoOriginal));
			output = new BufferedWriter(new FileWriter(rutaArchivo + archivoCopiado));
			String linea;
			while ((linea = input.readLine()) != null) {
				output.write(linea);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		// 3.Con FileWriter copiar el contenido de archivo.txt a archivo2.txt
		archivoCopiado = "archivo2.txt";

		FileReader in = null;
		FileWriter out = null;
		try {
			in = new FileReader(rutaArchivo + archivoOriginal);
			out = new FileWriter(rutaArchivo + archivoCopiado);
			int cadena;
			while ((cadena = in.read()) != -1) {
				out.write(cadena);
			}

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
