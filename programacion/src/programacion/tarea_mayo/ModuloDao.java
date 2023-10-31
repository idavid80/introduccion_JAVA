package programacion.tarea_mayo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ModuloDao {

	ConexionDB conexionDB = new ConexionDB("jdbc:mysql://localhost:3308/ejemplo", "root", "");

	private void close(Connection connection) throws SQLException {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException ex) {
			System.out.println("Error al cerrar Connection");
		}

	}

	private void close(PreparedStatement preparedStatement) throws SQLException {
		try {
			if (preparedStatement != null) {
				preparedStatement.close();
			}
		} catch (SQLException ex) {
			System.out.println("Error cerrar PreparedStatement");
		}
	}

//Comprobar
	public void insertarModulo(Modulo modulo) throws SQLException {
		Connection connection = null;
		PreparedStatement pstmt = null;

		try {
			String query = "INSERT INTO modulos (nomModulo, numHoras, nomProfe, numUnit, notaFinal) VALUES (?, ?, ?, ?, ?);";

			connection = conexionDB.getConnection();
			pstmt = connection.prepareStatement(query);

			// pstmt.setString(1, modulo.getIdModulo());
			pstmt.setString(1, modulo.getNomModulo());
			pstmt.setInt(2, modulo.getNumHoras());
			pstmt.setString(3, modulo.getNomProfe());
			pstmt.setInt(4, modulo.getNumUnit());
			pstmt.setInt(5, modulo.getNotaFinal());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Error al insertarModulo");
		} finally {
			close(pstmt);
			close(connection);
		}
	}

	/*
	 * public void eliminarModulo(int id) throws SQLException {
	 * 
	 * try { String query = "DELETE FROM modulos WHERE id=" + id +";"; Connection
	 * con = conexionDB.getConnection(); PreparedStatement pstmt =
	 * con.prepareStatement(query); if (pstmt.executeUpdate() > 0) {
	 * pstmt.executeUpdate(); } else
	 * {System.out.println("Error executeUpdate <= 0");}
	 * 
	 * close(pstmt); close(con);
	 * 
	 * } catch (SQLException e) {
	 * System.out.println("Error cerrar PreparedStatement"); }
	 * 
	 * }
	 * 
	 * }
	 */
	
	public void eliminarModulo(int id) throws SQLException {
		Connection connection = null;
		PreparedStatement pstmt = null;

		try {
			connection = conexionDB.getConnection();
			String query = "DELETE FROM modulos WHERE idModulo = ?";

			pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, id);

			int rowsDeleted = pstmt.executeUpdate();
			if (rowsDeleted > 0) {
				System.out.println("Se ha eliminado modulo" + " con idModulo = " + id);
			}
		} finally {
			close(pstmt);
			close(connection);
		}
	}
}
