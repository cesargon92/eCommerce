package cl.aiep.ecommerce.dto;

import java.sql.Date;

public class ComentarioDTO {

	private String idComentario;
	private String codigoBarra;
	private String usuario;
	private String tituloComentario;
	private String comentario;
	private Date fechaComentario;
	
	public ComentarioDTO() {
		super();
	}

	public String getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(String idComentario) {
		this.idComentario = idComentario;
	}

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTituloComentario() {
		return tituloComentario;
	}

	public void setTituloComentario(String tituloComentario) {
		this.tituloComentario = tituloComentario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Date getFechaComentario() {
		return fechaComentario;
	}

	public void setFechaComentario(Date fechaComentario) {
		this.fechaComentario = fechaComentario;
	}

	@Override
	public String toString() {
		return "ComentarioDTO [idComentario=" + idComentario + ", codigoBarra=" + codigoBarra + ", usuario=" + usuario
				+ ", tituloComentario=" + tituloComentario + ", comentario=" + comentario + ", fechaComentario="
				+ fechaComentario + "]";
	}
	
	
}
