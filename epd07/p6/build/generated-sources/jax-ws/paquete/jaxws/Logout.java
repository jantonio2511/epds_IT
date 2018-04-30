
package paquete.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "logout", namespace = "http://paquete/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logout", namespace = "http://paquete/")
public class Logout {

    @XmlElement(name = "token", namespace = "")
    private long token;

    /**
     * 
     * @return
     *     returns long
     */
    public long getToken() {
        return this.token;
    }

    /**
     * 
     * @param token
     *     the value for the token property
     */
    public void setToken(long token) {
        this.token = token;
    }

}