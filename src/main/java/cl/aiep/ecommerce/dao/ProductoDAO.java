package cl.aiep.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.aiep.ecommerce.dto.ProductoDTO;

@Repository
public class ProductoDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<ProductoDTO> obtenerProductos() {

		String sql = "SELECT nombre_producto, precio, descripcion_producto FROM productos GROUP BY codigo_barra";
		List<ProductoDTO> lstProductos = new ArrayList<ProductoDTO>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> row : rows) {

			ProductoDTO producto = new ProductoDTO();
			producto.setNombre((String) row.get("nombre_producto"));
			producto.setPrecio((int) row.get("precio"));
			producto.setDescripcion((String) row.get("descripcion_producto"));
		}

		return lstProductos;
	}

	public List<ProductoDTO> obtenerProductos(ProductoDTO productoDto) {

		String sql = "SELECT a.nombre_producto, a.precio, a.descripcion_producto FROM productos a INNER JOIN categorias b ON a.id_categoria = b.id_categoria WHERE nombre_categoria = ? GROUP BY codigo_barra";
		List<ProductoDTO> lstProductos = new ArrayList<ProductoDTO>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, productoDto.getCategoria());
		for (Map<String, Object> row : rows) {

			ProductoDTO producto = new ProductoDTO();
			producto.setNombre((String) row.get("nombre_producto"));
			producto.setPrecio((int) row.get("precio"));
			producto.setDescripcion((String) row.get("descripcion_producto"));
		}

		return lstProductos;
	}

	public long obtenerStockProducto(ProductoDTO productoDto) {

		long result = 0;
		String sql = "SELECT COUNT(nombre_producto) as Stock FROM productos WHERE codigo_barra = ? AND id_producto NOT IN (SELECT a.id_producto FROM productos_vendidos a INNER JOIN productos b ON a.id_producto = b.id_producto WHERE b.codigo_barra = ?)";

		Map<String, Object> count = jdbcTemplate.queryForMap(sql, productoDto.getCodigoBarra(), productoDto.getCodigoBarra());
		result = (long) count.get("Stock");

		return result;
	}

}
