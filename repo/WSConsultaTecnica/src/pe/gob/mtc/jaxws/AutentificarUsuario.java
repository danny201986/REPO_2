
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

@XmlRootElement(name = "autentificarUsuario", namespace = "http://mtc.gob.pe/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autentificarUsuario", namespace = "http://mtc.gob.pe/", propOrder = {"usuario", "password"})

public class AutentificarUsuario {

    @XmlElement(name = "usuario")
    private java.lang.String usuario;
    @XmlElement(name = "password")
    private java.lang.String password;

    public java.lang.String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(java.lang.String newUsuario)  {
        this.usuario = newUsuario;
    }

    public java.lang.String getPassword() {
        return this.password;
    }

    public void setPassword(java.lang.String newPassword)  {
        this.password = newPassword;
    }

}
