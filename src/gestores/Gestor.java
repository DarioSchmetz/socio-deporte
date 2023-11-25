package gestores;

import logica.Socio;

import java.sql.*;

public class Gestor {

	

	public static Socio buscarSocio(int nroSocio) throws Exception {

		String query = "SELECT s.nro_socio, s.nombre, s.apellido, s.categoria"
				+ " FROM socio s"
				+ " JOIN deporte d"
				+ " ON s.idsocio = d.idsocio"
				+ " WHERE s.nro_socio = ' + nroSocio + ';";

		Statement st = AdministradorConexiones.getConnection().createStatement();

		ResultSet rs = st.executeQuery(query);
		
		Socio socio = new Socio();
		
		while (rs.next()) {

			Integer nro_socio = rs.getInt("nro_socio");

			String nombre = rs.getString("nombre");

			String apellido = rs.getString("apellido");
			
			Integer categoria = rs.getInt("categoria");

			String deporte = rs.getString("deporte");

			socio.setNroSocio(nro_socio);

			socio.setNombre(nombre);

			socio.setApellido(apellido);

			socio.setCategoria(categoria);

			socio.setDeporte(deporte);
		}

		return socio;
	}

	public static String isVitalicio(int nroSocio) {
		
		Socio socio = new Socio();
		
		if (socio.getNroSocio() == nroSocio) {
			
			if(socio.getCategoria() == 3) {
			
				return "Vitalicio";
			}
		}
		return String.valueOf(socio.getCategoria());
	}
}