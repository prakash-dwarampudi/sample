
package com.sample.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getEmployeeResponse", namespace = "http://sample.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEmployeeResponse", namespace = "http://sample.com/")
public class GetEmployeeResponse {

    @XmlElement(name = "return", namespace = "")
    private com.sample.Employee _return;

    /**
     * 
     * @return
     *     returns Employee
     */
    public com.sample.Employee getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.sample.Employee _return) {
        this._return = _return;
    }

}
