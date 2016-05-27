package pe.gob.mtc;

import java.util.List;

public interface ConsultaTecnicaInterface {
	List<ObjConsultaTecnica> getListConsultaTecnica(String entidad) throws ServiceException;

	Boolean confirmarConsultaTecnica(Long idSolicitud) throws ServiceException;

	Boolean respuestaConsultaTecnica(ConsultaTecnicaXML xml) throws ServiceException;

	List<Representante> searchRepresentante(String nombres, String apellidos, String tipo, String numDoc);

	List<Consultora> serachConsultora(String codigo, String RUC, String razonSocial, String nacionalidad);

	Boolean autentificarUsuario(String usuario, String password);

	Pago verificarPago(String codigo);
	
	List<Capitulo> getCapitulo(String codigo);
		
	//String getNumeroExpediente(String a,String b,String c);
}
