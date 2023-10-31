package programacion;

import java.util.Scanner;

public class EntradaMatrices {

	/*
	 * Crear una matriz de 6 filas y 4 columnas . Poder introducir tantos datos como
	 * queramos. Los datos vacíos estarán representados por una X Una vez
	 * terminemos, que nos muestre el resultado de la matriz con los nuevos datos.
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int filasMatriz;
		int columnaMatriz;
		boolean continuar;
		String datos;
		String repetir;

		Scanner entrada = new Scanner(System.in);
		// Según el ejercicio el número de filas es 6 y el de columna es 4
		filasMatriz = 4;
		columnaMatriz = 6;

		String matriz[][] = new String[columnaMatriz][filasMatriz];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = "X";
			}
		}

		int fila;
		int columna;

		System.out.println("Programa para introducir datos en una matriz de 4 filas y 6 columnas");
		do {
			do {
				System.out.println("Introducir número fila que quiere modificar (entre 1 y 4)");
				fila = entrada.nextInt();
				if (fila > filasMatriz || fila < 1) {
					System.out.println("Recuerde que los valores de la fila deben de estar entre 1 y 4");
				}

			} while (fila > filasMatriz || fila < 1);
			System.out.println("Ha seleccionado la fila: " + fila);
			do {

				System.out.println("Introducir número columna que quiere modificar (entre 1 y 6)");
				columna = entrada.nextInt();
				if (columna < 1 || columna > columnaMatriz) {
					System.out.println("Recuerde que los valores de la columnas deben de estar entre 1 y 6");
				}
			} while (columna < 1 || columna > columnaMatriz);

			System.out.println("Introducir datos en la fila " + fila + " de la columna " + columna + " de la matriz: ");
			datos = entrada.next();
			matriz[columna - 1][fila - 1] = datos;

			System.out.println("¿Quieres continuar introduciendo datos en la matriz? (S/N)");
			repetir = entrada.next();

			/*
			 * if (repetir.equalsIgnoreCase("no") || repetir.equalsIgnoreCase("n")) {
			 * continuar = false; } else { continuar = true; }
			 *
			 */
			// Estructura de if anterior más simplificada.

			continuar = !(repetir.equalsIgnoreCase("no") || repetir.equalsIgnoreCase("n"));

		} while (continuar == true);
		entrada.close();
		// dibujo de la matriz
		for (String[] matriz1 : matriz) {
			System.out.print("|");
			for (int y = 0; y < matriz1.length; y++) {
				System.out.print(matriz1[y]);
				if (y != matriz1.length - 1) {
					System.out.print("\t");
				}
			}
			System.out.println("|");
		}

		/*
		 * for en su forma tradicional for (int x = 0; x < matriz.length; x++) {
		 * System.out.print("|"); for (int y = 0; y < matriz[x].length; y++) {
		 * System.out.print(matriz[x][y]); if (y != matriz[x].length - 1) {
		 * System.out.print("\t"); } } System.out.println("|"); }
		 */

		System.out.println("|");
	}

}
