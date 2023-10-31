package programacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Crear un programa que permita escribir algo por pantalla y lo muestre por pantalla.

public class LeerEntrada {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Introducir algo y pulsar enter: ");
			String linea = entrada.readLine();
			System.out.println("Ha escrito: " + linea);
			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}