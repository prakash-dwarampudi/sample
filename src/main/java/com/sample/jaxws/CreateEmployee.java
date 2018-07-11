
package com.sample.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createEmployee", namespace = "http://sample.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createEmployee", namespace = "http://sample.com/")
public class CreateEmployee {

    @XmlElement(name = "arg0", namespace = "")
    private com.sample.Employee arg0;

    /**
     * 
     * @return
     *     returns Employee
     */
    public com.sample.Employee getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(com.sample.Employee arg0) {
        this.arg0 = arg0;
    }

}
