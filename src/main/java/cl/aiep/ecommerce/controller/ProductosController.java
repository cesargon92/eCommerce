package cl.aiep.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.aiep.ecommerce.dao.ProductoDAO;
import cl.aiep.ecommerce.dto.ProductoDTO;

@RestController
public class ProductosController {

	@Autowired
	public ProductoDAO productoDAO;
	
	@RequestMapping(value = { "/getProducts" }, method = RequestMethod.GET)
	public List<ProductoDTO> getAllProducts(){
		List<ProductoDTO> productos = productoDAO.obtenerProductos();
		return productos;
	}
	
	@RequestMapping(value = { "/getProductsByCategory" }, method = RequestMethod.POST)
	public List<ProductoDTO> getAllProducts(@RequestBody ProductoDTO producto){
		List<ProductoDTO> productos = productoDAO.obtenerProductos(producto);
		return productos;
	}
	
	@RequestMapping(value = { "/getProductStock" }, method = RequestMethod.POST)
	public long getProductStock(@RequestBody ProductoDTO producto) {
		long stock = productoDAO.obtenerStockProducto(producto);
		return stock;
	}
}
