package cl.aiep.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.aiep.ecommerce.dao.UsuarioDAO;
import cl.aiep.ecommerce.dto.UsuarioDTO;

@RestController
public class UsuariosController {

	@Autowired
	public UsuarioDAO usuarioDAO;
	
	@RequestMapping(value = { "/getUserCredentials" }, method = RequestMethod.POST)
	public UsuarioDTO getUserCredentials(@RequestBody UsuarioDTO usuario) {
		
		UsuarioDTO user = usuarioDAO.obtenerCredencialesUsuario(usuario);
		return user;
	}
	
	@RequestMapping(value = { "/addCustomer" }, method = RequestMethod.POST)
	public int addCustomer(@RequestBody UsuarioDTO usuario) {
		
		int result = usuarioDAO.ingresarCliente(usuario);
		return result;
	}
	
	@RequestMapping(value = { "/addLogin" }, method = RequestMethod.POST)
	public int addLogin(@RequestBody UsuarioDTO usuario) {
		
		int result = usuarioDAO.ingresarLogin(usuario);
		return result;
	}
	
	@RequestMapping(value = { "/associateLogin" }, method = RequestMethod.POST)
	public int associateLogin(@RequestBody UsuarioDTO usuario) {
		
		int result = usuarioDAO.asociarLoginUsuario(usuario);
		return result;
	}
}
