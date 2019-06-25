package cl.aiep.ecommerce.model;

import java.sql.Date;
import java.sql.Time;


public class Producto {

	private String id;
	private String nombre;
	private String lote;
	private String descripcion;
	private String codigoBarra;
	private int precio;
	private String proveedor;
	private String lugarAlmacenamiento;
	private String categoria;
	private Date fechaIngreso;
	private Time horaIngreso;
	private Date fechaVencimiento;
	
	public Producto() {
		
	}
	
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", lote=" + lote + ", descripcion=" + descripcion
				+ ", codigoBarra=" + codigoBarra + ", precio=" + precio + ", proveedor=" + proveedor
				+ ", lugarAlmacenamiento=" + lugarAlmacenamiento + ", categoria=" + categoria + ", fechaIngreso="
				+ fechaIngreso + ", horaIngreso=" + horaIngreso + ", fechaVencimiento=" + fechaVencimiento + "]";
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getLugarAlmacenamiento() {
		return lugarAlmacenamiento;
	}
	public void setLugarAlmacenamiento(String lugarAlmacenamiento) {
		this.lugarAlmacenamiento = lugarAlmacenamiento;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public Time getHoraIngreso() {
		return horaIngreso;
	}
	public void setHoraIngreso(Time horaIngreso) {
		this.horaIngreso = horaIngreso;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
}
