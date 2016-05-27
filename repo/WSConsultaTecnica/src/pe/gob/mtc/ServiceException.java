package pe.gob.mtc;

public class ServiceException extends Exception {

	private String codigo;

	public ServiceException(String mensaje) {
		super(mensaje);
		codigo = "";
	}

	public ServiceException(String mensaje, String codigo) {

		super(mensaje);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
