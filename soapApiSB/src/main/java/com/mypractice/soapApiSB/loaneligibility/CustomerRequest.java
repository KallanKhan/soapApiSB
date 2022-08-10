package com.mypractice.soapApiSB.loaneligibility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="yearlyIncome" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="cibilScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="employmentMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "customerName",
        "age",
        "yearlyIncome",
        "cibilScore",
        "employmentMode"
})
@XmlRootElement(name = "CustomerRequest")
public class CustomerRequest {

    @XmlElement(required = true)
    protected String customerName;
    protected int age;
    protected long yearlyIncome;
    protected int cibilScore;
    @XmlElement(required = true)
    protected String employmentMode;

    /**
     * Gets the value of the customerName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the age property.
     *
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     *
     */
    public void setAge(int value) {
        this.age = value;
    }

    /**
     * Gets the value of the yearlyIncome property.
     *
     */
    public long getYearlyIncome() {
        return yearlyIncome;
    }

    /**
     * Sets the value of the yearlyIncome property.
     *
     */
    public void setYearlyIncome(long value) {
        this.yearlyIncome = value;
    }

    /**
     * Gets the value of the cibilScore property.
     *
     */
    public int getCibilScore() {
        return cibilScore;
    }

    /**
     * Sets the value of the cibilScore property.
     *
     */
    public void setCibilScore(int value) {
        this.cibilScore = value;
    }

    /**
     * Gets the value of the employmentMode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmploymentMode() {
        return employmentMode;
    }

    /**
     * Sets the value of the employmentMode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmploymentMode(String value) {
        this.employmentMode = value;
    }

}
