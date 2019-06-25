package cl.aiep.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.aiep.ecommerce.dao.ProductosDAO;
import cl.aiep.ecommerce.model.Producto;

@RestController
public class ProductosController {

	@Autowired
	public ProductosDAO productosDAO;
	
	@RequestMapping("/getProducts")
	public List<Producto> getAllProducts(){
		List<Producto> productos = productosDAO.obtenerProductos();
		return productos;
	}
}
