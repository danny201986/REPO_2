
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

@XmlRootElement(name = "getTupaResponse", namespace = "http://mtc.gob.pe/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTupaResponse", namespace = "http://mtc.gob.pe/")

public class GetTupaResponse {

    @XmlElement(name = "return")
    private java.util.List<pe.gob.mtc.TUPA> _return;

    public java.util.List<pe.gob.mtc.TUPA> getReturn() {
        return this._return;
    }

    public void setReturn(java.util.List<pe.gob.mtc.TUPA> new_return)  {
        this._return = new_return;
    }

}
