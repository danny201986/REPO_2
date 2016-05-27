package pe.gob.mtc;

import java.util.Date;

public class Solicitud {
	private Long id_Solicitud;
	//private Long id_Solicitud_Inicio;
	//private Long id_Transmision;
	//private Long id_Notificacion;
	private String tipo_Mensaje;
	private String formato;
	private String tipo_Documento;
	private String nume_Documento;
	private Date fecha_Documento;
//	private BigDecimal monto_Documento;
	private String tipo_Docref;
	private String nume_Docref;
	private String notificacion;
//	private String texto;
//	private String error;
	private String tipo;
	private String estado;
	private String usu_Creacion;
	private Date fec_Creacion;
	//private String situacion;
	//private int plazo;
//	private String escrito;
	//private String usu_Modifica;
//	private Date fec_Modifica;
	//private BigDecimal tasa;
//	private String respuesta;
	//private String area;
//	private String subArea;
//	private String responsable;
//	private Date fechaIngreso;
//	private String detalleTrazabilidad;
//	private Date fechaEstimadaSalida;
//	private Date fecha_Expediente;
//	private String nume_Expediente;
	public Long getId_Solicitud() {
		return id_Solicitud;
	}
	public void setId_Solicitud(Long id_Solicitud) {
		this.id_Solicitud = id_Solicitud;
	}
	public String getTipo_Mensaje() {
		return tipo_Mensaje;
	}
	public void setTipo_Mensaje(String tipo_Mensaje) {
		this.tipo_Mensaje = tipo_Mensaje;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getTipo_Documento() {
		return tipo_Documento;
	}
	public void setTipo_Documento(String tipo_Documento) {
		this.tipo_Documento = tipo_Documento;
	}
	public String getNume_Documento() {
		return nume_Documento;
	}
	public void setNume_Documento(String nume_Documento) {
		this.nume_Documento = nume_Documento;
	}
	public Date getFecha_Documento() {
		return fecha_Documento;
	}
	public void setFecha_Documento(Date fecha_Documento) {
		this.fecha_Documento = fecha_Documento;
	}
	public String getTipo_Docref() {
		return tipo_Docref;
	}
	public void setTipo_Docref(String tipo_Docref) {
		this.tipo_Docref = tipo_Docref;
	}
	public String getNume_Docref() {
		return nume_Docref;
	}
	public void setNume_Docref(String nume_Docref) {
		this.nume_Docref = nume_Docref;
	}
	public String getNotificacion() {
		return notificacion;
	}
	public void setNotificacion(String notificacion) {
		this.notificacion = notificacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getUsu_Creacion() {
		return usu_Creacion;
	}
	public void setUsu_Creacion(String usu_Creacion) {
		this.usu_Creacion = usu_Creacion;
	}
	public Date getFec_Creacion() {
		return fec_Creacion;
	}
	public void setFec_Creacion(Date fec_Creacion) {
		this.fec_Creacion = fec_Creacion;
	}


}
