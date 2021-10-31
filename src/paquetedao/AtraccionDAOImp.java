package paquetedao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import paquete.TipoAtraccion;

public class AtraccionDAOImp implements AtraccionDAO<Atraccion> {

	@Override
	public List<Atraccion> getAll() throws SQLException {
	List<Atraccion> atracciones = new ArrayList<Atraccion>();
	String sql = "SELECT * FROM Atraccion inner join TipoAtraccion on Tipo.id=Atraccion.tipo_id";
	Connection conexion = Conexion.getConexion();
	PreparedStatement statement = conexion.prepareStatement(sql);
	ResultSet results = statement.executeQuery();
	while(results.next()) {
		atracciones.add(new Atraccion(results.getInt("id"),
	    results.getString("nombre"), TipoAtraccion.valueOf(results.getString("tipo")),
	    results.getDouble("tiempo"),results.getDouble("costo"), results.getInt("cupo")));
		
	}
		return atracciones;
	}
	

	public void update(Atraccion atraccion) throws SQLException {
		String sql = "UPDATE Atraccion set cupo=? where id=?;";
		Connection conexion = Conexion.getConexion();
		PreparedStatement statement = conexion.prepareStatement(sql);
		statement.setInt(1, atraccion.getCupo());
		statement.setInt(2, atraccion.getId());
		statement.executeUpdate();
	}
	
		

}
