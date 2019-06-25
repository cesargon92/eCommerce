package cl.aiep.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.aiep.ecommerce.model.Producto;

@Repository
public class ProductosDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Producto> obtenerProductos(){
		
		String sql = "SELECT nombre_producto, precio, descripcion_producto FROM productos GROUP BY codigo_barra";
		List<Producto> lstProductos = new ArrayList<Producto>();
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> row : rows) {
			
			Producto producto = new Producto();
			producto.setNombre( (String) row.get("nombre_producto"));
			producto.setPrecio( (int) row.get("precio"));
			producto.setDescripcion( (String) row.get("descripcion_producto"));
		}
		
		return lstProductos;
	}

}
