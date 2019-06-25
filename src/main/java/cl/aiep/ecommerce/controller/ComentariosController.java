package cl.aiep.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.aiep.ecommerce.dao.ComentarioDAO;
import cl.aiep.ecommerce.dto.ComentarioDTO;
import cl.aiep.ecommerce.dto.ProductoDTO;

@RestController
public class ComentariosController {

	@Autowired
	public ComentarioDAO comentarioDao;
	
	@RequestMapping(value = { "/getComments" }, method = RequestMethod.GET)
	public List<ComentarioDTO> getComents(ProductoDTO productoDto){
		
		List<ComentarioDTO> comentarios = comentarioDao.obtenerComentarios(productoDto);
		return comentarios;
		
	}
	
	@RequestMapping(value = { "/addComment" }, method = RequestMethod.POST)
	public int addCustomer(@RequestBody ComentarioDTO comentarioDto) {
		
		int result = comentarioDao.insertarComentario(comentarioDto);
		return result;
	}
}
