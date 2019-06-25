package cl.aiep.ecommerce.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.aiep.ecommerce.dto.ComentarioDTO;
import cl.aiep.ecommerce.dto.ProductoDTO;

@Repository
public class ComentarioDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<ComentarioDTO> obtenerComentarios(ProductoDTO productoDto) {

		String sql = "SELECT a.titulo_comentario, a.comentario, a.fecha_comentario, b.nombre_usuario FROM productos a INNER JOIN usuarios b ON a.id_usuario = b.id_usuario WHERE a.codigo_barra = ?";
		List<ComentarioDTO> lstComentarios = new ArrayList<ComentarioDTO>();

		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, productoDto.getCodigoBarra());
		for (Map<String, Object> row : rows) {

			ComentarioDTO comentario = new ComentarioDTO();
			comentario.setTituloComentario((String) row.get("titulo_comentario"));
			comentario.setComentario((String) row.get("comentario"));
			comentario.setFechaComentario((Date) row.get("fecha_comentario"));
			comentario.setUsuario((String) row.get("nombre_usuario"));
		}

		return lstComentarios;
	}

	public int insertarComentario(ComentarioDTO comentarioDto) {
		int result = 0;

		String sql = "INSERT INTO comentarios (id_comentario, codigo_barra, id_usuario, titulo_comentario, comentario, fecha_comentario) VALUES (?, ?, ?, ?, ?, ?)";
		result = jdbcTemplate.update(sql, comentarioDto.getIdComentario(), comentarioDto.getCodigoBarra(),
				comentarioDto.getUsuario(), comentarioDto.getTituloComentario(), comentarioDto.getFechaComentario());

		return result;
	}

}
