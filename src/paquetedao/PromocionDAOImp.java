package paquetedao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromocionDAOImp implements PromocionDAO<Promocion>{


	@Override
	public List<Promocion> getAll(List<Atraccion> atracciones) throws SQLException {
		List<Promocion> promociones = new ArrayList<Promocion>();
		Map<Promocion, List<Atraccion>> mapPromociones = new HashMap<Promocion, List<Atraccion>>();
		String sql = "SELECT * FROM Promocion"
				+ "inner join tipopromocion on tipo.id=promocion.tipo_id"
				+ "inner join atracciones_promociones on atracciones_promociones.promocion_id=promocion.id"
				+ "inner join atracciones on atracciones.id=atracciones_promociones.atraccion_id";
		Connection conexion = Conexion.getConexion();
		PreparedStatement statement = conexion.prepareStatement(sql);
		ResultSet results = statement.executeQuery();
		while(results.next()) {
			Promocion promo = new Promocion(results.getInt("id"),
					atracciones, TipoPromocion.valueOf(results.getString("tipo")),
					results.getString("nombre"));
					
		}
		return promociones;
	}

}
