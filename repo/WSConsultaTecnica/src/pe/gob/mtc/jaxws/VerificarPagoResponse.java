
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

@XmlRootElement(name = "verificarPagoResponse", namespace = "http://mtc.gob.pe/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificarPagoResponse", namespace = "http://mtc.gob.pe/")

public class VerificarPagoResponse {

    @XmlElement(name = "return")
    private pe.gob.mtc.Pago _return;

    public pe.gob.mtc.Pago getReturn() {
        return this._return;
    }

    public void setReturn(pe.gob.mtc.Pago new_return)  {
        this._return = new_return;
    }

}
