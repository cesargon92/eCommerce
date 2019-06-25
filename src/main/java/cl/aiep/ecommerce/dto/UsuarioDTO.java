package cl.aiep.ecommerce.dto;

import java.sql.Date;

public class UsuarioDTO {

	private String idUsuario;
	private String primerNombre;
	private String segundoNombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String rut;
	private String correo;
	private String telefono;
	private Date fechaNacimiento;
	private String login;
	private String claveLogin;
	private int tipoUsuario;
	private String idLogin;
	private String nombreUsuario;
	
	public UsuarioDTO() {
		super();
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getClaveLogin() {
		return claveLogin;
	}

	public void setClaveLogin(String claveLogin) {
		this.claveLogin = claveLogin;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getIdLogin() {
		return idLogin;
	}

	public void setIdLogin(String idLogin) {
		this.idLogin = idLogin;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre
				+ ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", rut=" + rut
				+ ", correo=" + correo + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", login="
				+ login + ", claveLogin=" + claveLogin + ", tipoUsuario=" + tipoUsuario + ", idLogin=" + idLogin
				+ ", nombreUsuario=" + nombreUsuario + "]";
	}


	
	
	
	
}
