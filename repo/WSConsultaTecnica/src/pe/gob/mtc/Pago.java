package pe.gob.mtc;

import java.math.BigDecimal;
import java.util.Date;

public class Pago {
	private String codigo;
	private String entidad;
	private Date fecha;
	private BigDecimal monto;
	private Persona usuario;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public Persona getUsuario() {
		return usuario;
	}
	public void setUsuario(Persona usuario) {
		this.usuario = usuario;
	}
	
	

}
