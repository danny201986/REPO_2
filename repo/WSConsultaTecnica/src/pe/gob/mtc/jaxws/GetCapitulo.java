
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

@XmlRootElement(name = "getCapitulo", namespace = "http://mtc.gob.pe/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCapitulo", namespace = "http://mtc.gob.pe/")

public class GetCapitulo {

    @XmlElement(name = "codigo")
    private java.lang.String codigo;

    public java.lang.String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(java.lang.String newCodigo)  {
        this.codigo = newCodigo;
    }

}

