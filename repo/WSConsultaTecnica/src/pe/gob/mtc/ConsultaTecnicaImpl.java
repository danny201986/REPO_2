package pe.gob.mtc;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;


@WebService(targetNamespace = "http://mtc.gob.pe/", portName = "ConsultaTecnicaImplPort", serviceName = "ConsultaTecnicaImplService")
public class ConsultaTecnicaImpl implements ConsultaTecnicaInterface {

	public List<TUPA> getTupa() {

		List<TUPA> list = new ArrayList<TUPA>();
		TUPA t = new TUPA();
		t.setCodigo("TUPA-001");
		t.setNombre("1 Evaluación del Estudio de Impacto Ambiental");
		t.setDescripcion("DESCRIPCION TUPA 01");
		list.add(t);

		// List<Capitulo> listaCap = new ArrayList<Capitulo>();
		// Capitulo c = new Capitulo();
		// c.setCodigo("1");
		// c.setNombre("Resumen Ejecutivo");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("2");
		// c.setNombre("Datos del Titular");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("3");
		// c.setNombre("Generalidades");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("4");
		// c.setNombre("Descripción del Proyecto");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("5");
		// c.setNombre("Área de Influencia");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("6");
		// c.setNombre("Línea Base");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("7");
		// c.setNombre("Impactos Ambientales");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("8");
		// c.setNombre("Plan de Manejo  Ambiental");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("9");
		// c.setNombre("Valoración Económica");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("10");
		// c.setNombre("Plan de Participación Ciudadana");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("11");
		// c.setNombre("Empresa Consultora");
		// listaCap.add(c);
		//
		// c = new Capitulo();
		// c.setCodigo("12");
		// c.setNombre("Documentos de Pago TUPA / Otros.");
		// listaCap.add(c);
		//
		// ContenedorCapitulo contCap = new ContenedorCapitulo();
		// contCap.setCapitulo(listaCap);
		//
		// t.setContenerCapitulo(contCap);
		//
		// list.add(t);

		t = new TUPA();
		t.setCodigo("TUPA-002");
		t.setNombre("2 Modificación de Estudio de Impacto Ambiental Detallado EIA-d");
		t.setDescripcion("DESCRIPCION TUPA 02");
		list.add(t);

		t = new TUPA();
		t.setCodigo("TUPA-003");
		t.setNombre("3 Evaluación y Aprobación del Informe Técnico Sustentatorio ITS");
		t.setDescripcion("DESCRIPCION TUPA 03");
		list.add(t);

		t = new TUPA();
		t.setCodigo("TUPA-004");
		t.setNombre("4 Clasificación y Aprobación de Términos de Referencia");
		t.setDescripcion("tupa");
		list.add(t);

		t = new TUPA();
		t.setCodigo("TUPA-005");
		t.setNombre("5 Evaluación y Aprobación del Plan de Participación Ciudadana - PPC previo a la presentación del EIA-d");
		t.setDescripcion("tupa");
		list.add(t);

		t = new TUPA();
		t.setCodigo("TUPA-006");
		t.setNombre("6 Inscripción en el Registro Nacional de Consultoras Ambientales");
		t.setDescripcion("tupa");
		list.add(t);

		t = new TUPA();
		t.setCodigo("7");
		t.setNombre("7 Renovación de Inscripción en el Registro Nacional de Consultoras Ambientales");
		t.setDescripcion("tupa");
		list.add(t);

		t = new TUPA();
		t.setCodigo("TUPA-008");
		t.setNombre("8 Actualización o Modificación de Inscripción en el Registro Nacional de Consultoras Ambientales");
		t.setDescripcion("tupa");
		list.add(t);

		t = new TUPA();
		t.setCodigo("TUPA-009");
		t.setNombre("Acceso a la información pública que posea o produzca la Entidad");
		t.setDescripcion("tupa");
		list.add(t);

		t = new TUPA();
		t.setCodigo("TUPA-010");
		t.setNombre("Recurso de apelación contra los actos emitidos en una Adjudicación Directa Selectiva o Adjudicación de Menor Cuantía");
		t.setDescripcion("tupa");
		list.add(t);

		t = new TUPA();
		t.setCodigo("TUPA-011");
		t.setNombre("Expedición de copias de los documentos contenidos en los expedientes de los procedimientos administrativos");
		t.setDescripcion("tupa");
		list.add(t);

		return list;
	}

	public List<Representante> getRepresentante() {
		List<Representante> list = new ArrayList<Representante>();
		Representante repre = new Representante();
		repre.setNombres("jose");
		repre.setApePaterno("torres");
		repre.setApeMaterno("casas");
		repre.setTipo("DNI");
		repre.setNumDoc("1234567");
		repre.setActivo(true);
		repre.setNacionalidad("Peruano");
		list.add(repre);

		repre = new Representante();
		repre.setNombres("carlos miguel");
		repre.setApePaterno("gonzales");
		repre.setApeMaterno("chang");
		repre.setTipo("RUC");
		repre.setNumDoc("12345678991");
		repre.setActivo(true);
		repre.setNacionalidad("CHINO");
		list.add(repre);

		repre = new Representante();
		repre.setNombres("carlos jose");
		repre.setApePaterno("chang");
		repre.setApeMaterno("chang");
		repre.setTipo("RUC");
		repre.setNumDoc("12345678991");
		repre.setActivo(true);
		repre.setNacionalidad("italiano");
		list.add(repre);

		repre = new Representante();
		repre.setNombres("carlos jose");
		repre.setApePaterno("chang");
		repre.setApeMaterno("chang");
		repre.setTipo("RUC");
		repre.setNumDoc("12345678991");
		repre.setActivo(true);
		repre.setNacionalidad("italiano");
		list.add(repre);

		return list;
	}

	public List<ObjConsultaTecnica> getListConsultaTecnica(String entidad) throws ServiceException {

		// ObjConsultaTecnica consulta = new ObjConsultaTecnica();

		Consulta c = new Consulta();
		Solicitud s = new Solicitud();
		c.setAsunto("asunto");
		c.setCantidad(new Long(1234));
		c.setDescripcion_Comercial("descripcion comercial");

		s.setEstado("comercializadora area");
		s.setFormato("hay un error");
		ObjConsultaTecnica obj = new ObjConsultaTecnica();
		obj.setConsulta(c);
		obj.setSolicitud(s);

		List<ObjConsultaTecnica> list = new ArrayList<ObjConsultaTecnica>();
		list.add(obj);
		return list;

	}

	public Boolean confirmarConsultaTecnica(Long idConsulta) throws ServiceException {
		// TODO Auto-generated method stub
		return true;

	}

	public Boolean respuestaConsultaTecnica(ConsultaTecnicaXML xml) throws ServiceException {
		return true;
	}

	@Override
	public List<Representante> searchRepresentante(String nombres, String apellidos, String tipo, String numDoc) {

		List<Representante> list = new ArrayList<Representante>();
		Representante repre1 = new Representante();
		repre1.setNombres("jose");
		repre1.setApePaterno("torres");
		repre1.setApeMaterno("casas");
		repre1.setTipo("DNI");
		repre1.setNumDoc("1234567");
		repre1.setActivo(true);
		repre1.setNacionalidad("Peruano");

		Representante repre2 = new Representante();
		repre2 = new Representante();
		repre2.setNombres("carlos miguel");
		repre2.setApePaterno("gonzales");
		repre2.setApeMaterno("chang");
		repre2.setTipo("RUC");
		repre2.setNumDoc("12345678991");
		repre2.setActivo(true);
		repre2.setNacionalidad("CHINO");

		if (nombres != null && nombres != "") {
			list.add(repre1);
			list.add(repre2);
		} else {
			list.add(repre1);
			list.add(repre2);

		}
		return list;
	}

	@Override
	public List<Consultora> serachConsultora(String codigo, String RUC, String razonSocial, String nacionalidad) {
		List<Consultora> list = new ArrayList<Consultora>();
		Consultora cons = new Consultora();

		cons.setCodigo("123456");
		cons.setDenominacion("IMPERIAL SAC");
		cons.setRazonSocial("SOCIEDAD ANONIMA CERRADA");
		cons.setDireccion("LIMA-PERU");
		cons.setRUC("12345678901");

		Representante repre2 = new Representante();
		repre2 = new Representante();
		repre2.setNombres("carlos miguel");
		repre2.setApePaterno("gonzales");
		repre2.setApeMaterno("chang");
		repre2.setTipo("RUC");
		repre2.setNumDoc("12345678991");
		repre2.setActivo(true);
		repre2.setNacionalidad("CHINO");

		cons.setRepresentante(repre2);
		cons.setTelefono("98585669");
		cons.setCorreo("cons@gmail.com");

		cons = new Consultora();
		cons.setCodigo("123456");
		cons.setDenominacion("IMPERIAL SAC");
		cons.setRazonSocial("SOCIEDAD ANONIMA CERRADA");
		cons.setDireccion("LIMA-PERU");
		cons.setRUC("12345678901");

		Representante repre1 = new Representante();
		repre1.setNombres("jose");
		repre1.setApePaterno("torres");
		repre1.setApeMaterno("casas");
		repre1.setTipo("DNI");
		repre1.setNumDoc("1234567");
		repre1.setActivo(true);
		repre1.setNacionalidad("Peruano");

		cons.setRepresentante(repre1);
		cons.setTelefono("98585669");
		cons.setCorreo("cons@gmail.com");

		list.add(cons);
		return list;
	}

	@Override
	public Boolean autentificarUsuario(String usuario, String password) {
		System.out.println("usuario:" + usuario);
		System.out.println("password:" + password);
		if (usuario != null && password != null) {
			if (usuario.equals("admin") && password.equals("admin")) {
				System.out.println("ok");
				return true;
			} else {
				System.out.println("error");
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public Pago verificarPago(String codigo) {
		// TODO Auto-generated method stub

		Pago pago = new Pago();
		pago.setCodigo("123456");
		pago.setEntidad("CONSULTORA SAC");
		pago.setMonto(new BigDecimal("100"));
		java.util.Date fecha = new Date();
		pago.setFecha(fecha);

		Persona persona = new Persona();
		persona.setCodigo("99999");
		persona.setNombre("juan");
		persona.setApePaterno("gonzales");
		persona.setApeMaterno("lima");
		persona.setEdad("50");
		persona.setNacionalidad("peruano");

		Ubigeo ubige = new Ubigeo();
		ubige.setCodigo("101010");
		ubige.setDistrito("Lima");
		ubige.setProvincia("Lima");
		ubige.setPais("Peru");

		persona.setUbigeo(ubige);

		pago.setUsuario(persona);
		System.out.println("codigo:" + codigo);

		if (pago.getCodigo().equals(codigo)) {
			System.out.println("si pago");
			return pago;
		} else {
			System.out.println("no pago");
			return null;

		}
	}

	@Override
	public List<Capitulo> getCapitulo(String codigo) {
		System.out.println("entron en get capitulos");
		if (codigo.equals("1")) {
			System.out.println("caodigo capitulo:" + 1);
			List<Capitulo> listaCap = new ArrayList<Capitulo>();
			Capitulo c = new Capitulo();
			c.setCodigo("1");
			c.setNombre("Resumen Ejecutivo");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("2");
			c.setNombre("Datos del Titular");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("3");
			c.setNombre("Generalidades");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("4");
			c.setNombre("Descripción del Proyecto");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("5");
			c.setNombre("Área de Influencia");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("6");
			c.setNombre("Línea Base");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("7");
			c.setNombre("Impactos Ambientales");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("8");
			c.setNombre("Plan de Manejo  Ambiental");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("9");
			c.setNombre("Valoración Económica");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("10");
			c.setNombre("Plan de Participación Ciudadana");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("11");
			c.setNombre("Empresa Consultora");
			listaCap.add(c);

			c = new Capitulo();
			c.setCodigo("12");
			c.setNombre("Documentos de Pago TUPA / Otros.");
			listaCap.add(c);

			return listaCap;
		} else {
			return null;
		}
	}
}
