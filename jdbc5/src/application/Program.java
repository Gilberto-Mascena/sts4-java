package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Delete departamento.
		 */
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DB.getConnection();

			ps = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");
			
			ps.setInt(1, 5);

			int rowsAffected = ps.executeUpdate();
			System.out.println("Done! Rows Affected " + rowsAffected);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			DB.closeStatement(ps);
			DB.closeConnetion();
		}
	}
}
