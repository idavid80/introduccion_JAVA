package programacion.tarea_mayo;

import java.sql.SQLException;

public class Main {
	/**
	 * @param args the command line arguments
	 * @throws java.sql.SQLException
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		ModuloDao dao = new ModuloDao();
		Modulo modulo1 = new Modulo("Geografia", 8, "Maria del Carmen", 2, 9);
		Modulo modulo2 = new Modulo("Historia", 6, "Consuelo", 2, 8);

		try {
			dao.insertarModulo(modulo1);
			dao.insertarModulo(modulo2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}