package cl.aiep.ecommerce.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cl.aiep.ecommerce.dto.UsuarioDTO;

@Repository
public class UsuarioDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public UsuarioDTO obtenerCredencialesUsuario(UsuarioDTO usuario) {

		String sql = "SELECT a.primer_nombre_usuario, a.apellido_paterno_usuario, b.clave_usuario, b.tipo_usuario FROM usuarios a INNER JOIN login b ON a.id_login = b.id_login WHERE b.nombre_usuario LIKE ? OR correo_usuario LIKE ?";
		Map<String, Object> result = jdbcTemplate.queryForMap(sql, usuario.getNombreUsuario(), usuario.getCorreo());

		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO.setPrimerNombre((String) result.get("primer_nombre_usuario"));
		usuarioDTO.setApellidoPaterno((String) result.get("apellido_paterno_usuario"));
		usuarioDTO.setClaveLogin((String) result.get("clave_usuario"));
		usuarioDTO.setTipoUsuario((int) result.get("tipo_usuario"));

		return usuarioDTO;
	}

	public int ingresarCliente(UsuarioDTO usuario) {

		int result = 0;
		String sql = "INSERT INTO usuarios (id_usuario, primer_nombre_usuario, segundo_nombre_usuario, apellido_paterno_usuario, apellido_materno_usuario, rut_usuario, telefono_usuario, correo_usuario, fecha_nacimiento_usuario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		result = jdbcTemplate.update(sql, usuario.getIdUsuario(), usuario.getPrimerNombre(), usuario.getSegundoNombre(),
				usuario.getApellidoPaterno(), usuario.getApellidoMaterno(), usuario.getRut(), usuario.getTelefono(),
				usuario.getCorreo(), usuario.getFechaNacimiento());

		return result;
	}

	public int ingresarLogin(UsuarioDTO usuario) {

		int result = 0;
		String sql = "INSERT INTO login (id_login, nombre_usuario, correo_usuario, clave_usuario, tipo_usuario) VALUES (?, ?, ?, ?, ?)";

		result = jdbcTemplate.update(sql, usuario.getIdLogin(), usuario.getNombreUsuario(), usuario.getCorreo(),
				usuario.getClaveLogin(), usuario.getTipoUsuario());

		return result;
	}
	
	public int asociarLoginUsuario(UsuarioDTO usuario) {
		
		int result = 0;
		String sql = "UPDATE usuario SET id_login = ? WHERE id_usuario = ?";
		
		result = jdbcTemplate.update(sql, usuario.getIdLogin(), usuario.getIdUsuario());
		
		return result;
	}
}
