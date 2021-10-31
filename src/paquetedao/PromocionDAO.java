package paquetedao;

import java.sql.SQLException;
import java.util.List;

public interface PromocionDAO<T>{
	public List<Promocion> getAll(List<Atraccion> atracciones) throws SQLException;

}
