
package pe.gob.mtc.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.7.18
 * Tue Mar 15 11:22:37 COT 2016
 * Generated source version: 2.7.18
 */

@XmlRootElement(name = "getListConsultaTecnica", namespace = "http://mtc.gob.pe/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListConsultaTecnica", namespace = "http://mtc.gob.pe/")

public class GetListConsultaTecnica {

    @XmlElement(name = "entidad")
    private java.lang.String entidad;

    public java.lang.String getEntidad() {
        return this.entidad;
    }

    public void setEntidad(java.lang.String newEntidad)  {
        this.entidad = newEntidad;
    }

}
