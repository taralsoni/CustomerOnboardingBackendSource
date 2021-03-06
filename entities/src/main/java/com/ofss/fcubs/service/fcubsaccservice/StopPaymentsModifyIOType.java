
package com.ofss.fcubs.service.fcubsaccservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StopPayments-Modify-IO-Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopPayments-Modify-IO-Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="STOP_PAYMENT_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="STOP_PAYMENT_TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="START_CHECK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="END_CHECK_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CHG_AMOUNT" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EFFECTIVE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EXPIRY_DATE" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CONFIRMED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REMARKS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="REFERENCE_NO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="APPLY_CHARGE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAKERSTAMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UDFDETAILS" type="{http://fcubs.ofss.com/service/FCUBSAccService}UDFDETAILSType2" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Charge-Main" type="{http://fcubs.ofss.com/service/FCUBSAccService}Csconchg-Modify-IO-Type" minOccurs="0"/>
 *         &lt;element name="Event-Master" type="{http://fcubs.ofss.com/service/FCUBSAccService}Csconevt-Modify-IO-Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPayments-Modify-IO-Type", propOrder = {
    "stoppaymentno",
    "stoppaymenttype",
    "startcheckno",
    "endcheckno",
    "chgamount",
    "effectivedate",
    "expirydate",
    "confirmed",
    "remarks",
    "referenceno",
    "applycharge",
    "maker",
    "makerstamp",
    "udfdetails",
    "chargeMain",
    "eventMaster"
})
public class StopPaymentsModifyIOType {

    @XmlElement(name = "STOP_PAYMENT_NO")
    protected String stoppaymentno;
    @XmlElement(name = "STOP_PAYMENT_TYPE")
    protected String stoppaymenttype;
    @XmlElement(name = "START_CHECK_NO")
    protected String startcheckno;
    @XmlElement(name = "END_CHECK_NO")
    protected String endcheckno;
    @XmlElement(name = "CHG_AMOUNT")
    protected BigDecimal chgamount;
    @XmlElement(name = "EFFECTIVE_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectivedate;
    @XmlElement(name = "EXPIRY_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirydate;
    @XmlElement(name = "CONFIRMED")
    protected String confirmed;
    @XmlElement(name = "REMARKS")
    protected String remarks;
    @XmlElement(name = "REFERENCE_NO")
    protected String referenceno;
    @XmlElement(name = "APPLY_CHARGE")
    protected String applycharge;
    @XmlElement(name = "MAKER")
    protected String maker;
    @XmlElement(name = "MAKERSTAMP")
    protected String makerstamp;
    @XmlElement(name = "UDFDETAILS")
    protected List<UDFDETAILSType2> udfdetails;
    @XmlElement(name = "Charge-Main")
    protected CsconchgModifyIOType chargeMain;
    @XmlElement(name = "Event-Master")
    protected CsconevtModifyIOType eventMaster;

    /**
     * Gets the value of the stoppaymentno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOPPAYMENTNO() {
        return stoppaymentno;
    }

    /**
     * Sets the value of the stoppaymentno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOPPAYMENTNO(String value) {
        this.stoppaymentno = value;
    }

    /**
     * Gets the value of the stoppaymenttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTOPPAYMENTTYPE() {
        return stoppaymenttype;
    }

    /**
     * Sets the value of the stoppaymenttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTOPPAYMENTTYPE(String value) {
        this.stoppaymenttype = value;
    }

    /**
     * Gets the value of the startcheckno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTARTCHECKNO() {
        return startcheckno;
    }

    /**
     * Sets the value of the startcheckno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTARTCHECKNO(String value) {
        this.startcheckno = value;
    }

    /**
     * Gets the value of the endcheckno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENDCHECKNO() {
        return endcheckno;
    }

    /**
     * Sets the value of the endcheckno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENDCHECKNO(String value) {
        this.endcheckno = value;
    }

    /**
     * Gets the value of the chgamount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCHGAMOUNT() {
        return chgamount;
    }

    /**
     * Sets the value of the chgamount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCHGAMOUNT(BigDecimal value) {
        this.chgamount = value;
    }

    /**
     * Gets the value of the effectivedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEFFECTIVEDATE() {
        return effectivedate;
    }

    /**
     * Sets the value of the effectivedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEFFECTIVEDATE(XMLGregorianCalendar value) {
        this.effectivedate = value;
    }

    /**
     * Gets the value of the expirydate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEXPIRYDATE() {
        return expirydate;
    }

    /**
     * Sets the value of the expirydate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEXPIRYDATE(XMLGregorianCalendar value) {
        this.expirydate = value;
    }

    /**
     * Gets the value of the confirmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONFIRMED() {
        return confirmed;
    }

    /**
     * Sets the value of the confirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONFIRMED(String value) {
        this.confirmed = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREMARKS() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREMARKS(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the referenceno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCENO() {
        return referenceno;
    }

    /**
     * Sets the value of the referenceno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCENO(String value) {
        this.referenceno = value;
    }

    /**
     * Gets the value of the applycharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLYCHARGE() {
        return applycharge;
    }

    /**
     * Sets the value of the applycharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLYCHARGE(String value) {
        this.applycharge = value;
    }

    /**
     * Gets the value of the maker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKER() {
        return maker;
    }

    /**
     * Sets the value of the maker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKER(String value) {
        this.maker = value;
    }

    /**
     * Gets the value of the makerstamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAKERSTAMP() {
        return makerstamp;
    }

    /**
     * Sets the value of the makerstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAKERSTAMP(String value) {
        this.makerstamp = value;
    }

    /**
     * Gets the value of the udfdetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the udfdetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUDFDETAILS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UDFDETAILSType2 }
     * 
     * 
     */
    public List<UDFDETAILSType2> getUDFDETAILS() {
        if (udfdetails == null) {
            udfdetails = new ArrayList<UDFDETAILSType2>();
        }
        return this.udfdetails;
    }

    /**
     * Gets the value of the chargeMain property.
     * 
     * @return
     *     possible object is
     *     {@link CsconchgModifyIOType }
     *     
     */
    public CsconchgModifyIOType getChargeMain() {
        return chargeMain;
    }

    /**
     * Sets the value of the chargeMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsconchgModifyIOType }
     *     
     */
    public void setChargeMain(CsconchgModifyIOType value) {
        this.chargeMain = value;
    }

    /**
     * Gets the value of the eventMaster property.
     * 
     * @return
     *     possible object is
     *     {@link CsconevtModifyIOType }
     *     
     */
    public CsconevtModifyIOType getEventMaster() {
        return eventMaster;
    }

    /**
     * Sets the value of the eventMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link CsconevtModifyIOType }
     *     
     */
    public void setEventMaster(CsconevtModifyIOType value) {
        this.eventMaster = value;
    }

}
