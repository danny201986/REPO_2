package pe.gob.mtc;

public class ConsultaTecnicaXML {
	private Long idConsulta;
	public Long getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Long idConsulta) {
		this.idConsulta = idConsulta;
	}

	private String tipoDocumento;
	private String numeroDocumento;
	private String respuesta;
	private String privacidad;
	private String sustentoLegal;
	private String resultado;

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getPrivacidad() {
		return privacidad;
	}

	public void setPrivacidad(String privacidad) {
		this.privacidad = privacidad;
	}

	public String getSustentoLegal() {
		return sustentoLegal;
	}

	public void setSustentoLegal(String sustentoLegal) {
		this.sustentoLegal = sustentoLegal;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
