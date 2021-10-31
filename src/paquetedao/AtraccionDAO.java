package paquetedao;

import java.sql.SQLException;
import java.util.List;

public interface AtraccionDAO<T> {
	public void update(T t) throws SQLException;
	public List<T> getAll() throws SQLException;

}
