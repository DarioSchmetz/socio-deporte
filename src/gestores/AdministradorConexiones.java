package gestores;

import java.sql.*;

public class AdministradorConexiones {
	
	public AdministradorConexiones() { }

	public static Connection getConnection() throws Exception {

		// Establece el nombre del driver a utilizar
		String dbDriver = "com.mysql.jdbc.Driver";

		// Establece la conexion a utilizar contra la base de datos
		String dbConnString = "jdbc:mysql://localhost:3306/club_deportivo_dario";

		// Establece el usuario de la base de datos
		String dbUser = "root";

		// Establece la contraseña de la base de datos
		String dbPassword = "";

		// Establece el driver de conexion
		Class.forName(dbDriver).newInstance();

		// Retorna la conexion
		return DriverManager.getConnection(dbConnString, dbUser, dbPassword);
	}
}