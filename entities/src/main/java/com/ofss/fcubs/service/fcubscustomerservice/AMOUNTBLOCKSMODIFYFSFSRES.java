
package com.ofss.fcubs.service.fcubscustomerservice;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="FCUBS_HEADER" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}FCUBS_HEADERType"/>
 *         &lt;element name="FCUBS_BODY">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Amount-Blocks-PK" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}AmountBlocks-PK-Type" minOccurs="0"/>
 *                   &lt;element name="Amount-Blocks-IO" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}AmountBlocks-IO-Type" minOccurs="0"/>
 *                   &lt;element name="Amount-Blocks-Full" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}AmountBlocks-Full-Type" minOccurs="0"/>
 *                   &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}ERRORType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "fcubsheader",
    "fcubsbody"
})
@XmlRootElement(name = "AMOUNTBLOCKSMODIFY_FSFS_RES")
public class AMOUNTBLOCKSMODIFYFSFSRES {

    @XmlElement(name = "FCUBS_HEADER", required = true)
    protected FCUBSHEADERType fcubsheader;
    @XmlElement(name = "FCUBS_BODY", required = true)
    protected AMOUNTBLOCKSMODIFYFSFSRES.FCUBSBODY fcubsbody;

    /**
     * Gets the value of the fcubsheader property.
     * 
     * @return
     *     possible object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public FCUBSHEADERType getFCUBSHEADER() {
        return fcubsheader;
    }

    /**
     * Sets the value of the fcubsheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link FCUBSHEADERType }
     *     
     */
    public void setFCUBSHEADER(FCUBSHEADERType value) {
        this.fcubsheader = value;
    }

    /**
     * Gets the value of the fcubsbody property.
     * 
     * @return
     *     possible object is
     *     {@link AMOUNTBLOCKSMODIFYFSFSRES.FCUBSBODY }
     *     
     */
    public AMOUNTBLOCKSMODIFYFSFSRES.FCUBSBODY getFCUBSBODY() {
        return fcubsbody;
    }

    /**
     * Sets the value of the fcubsbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link AMOUNTBLOCKSMODIFYFSFSRES.FCUBSBODY }
     *     
     */
    public void setFCUBSBODY(AMOUNTBLOCKSMODIFYFSFSRES.FCUBSBODY value) {
        this.fcubsbody = value;
    }


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
     *         &lt;element name="Amount-Blocks-PK" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}AmountBlocks-PK-Type" minOccurs="0"/>
     *         &lt;element name="Amount-Blocks-IO" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}AmountBlocks-IO-Type" minOccurs="0"/>
     *         &lt;element name="Amount-Blocks-Full" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}AmountBlocks-Full-Type" minOccurs="0"/>
     *         &lt;element name="FCUBS_ERROR_RESP" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}ERRORType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FCUBS_WARNING_RESP" type="{http://fcubs.ofss.com/service/FCUBSCustomerService}WARNINGType" maxOccurs="unbounded" minOccurs="0"/>
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
        "amountBlocksPK",
        "amountBlocksIO",
        "amountBlocksFull",
        "fcubserrorresp",
        "fcubswarningresp"
    })
    public static class FCUBSBODY {

        @XmlElement(name = "Amount-Blocks-PK")
        protected AmountBlocksPKType amountBlocksPK;
        @XmlElement(name = "Amount-Blocks-IO")
        protected AmountBlocksIOType amountBlocksIO;
        @XmlElement(name = "Amount-Blocks-Full")
        protected AmountBlocksFullType amountBlocksFull;
        @XmlElement(name = "FCUBS_ERROR_RESP")
        protected List<ERRORType> fcubserrorresp;
        @XmlElement(name = "FCUBS_WARNING_RESP")
        protected List<WARNINGType> fcubswarningresp;

        /**
         * Gets the value of the amountBlocksPK property.
         * 
         * @return
         *     possible object is
         *     {@link AmountBlocksPKType }
         *     
         */
        public AmountBlocksPKType getAmountBlocksPK() {
            return amountBlocksPK;
        }

        /**
         * Sets the value of the amountBlocksPK property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountBlocksPKType }
         *     
         */
        public void setAmountBlocksPK(AmountBlocksPKType value) {
            this.amountBlocksPK = value;
        }

        /**
         * Gets the value of the amountBlocksIO property.
         * 
         * @return
         *     possible object is
         *     {@link AmountBlocksIOType }
         *     
         */
        public AmountBlocksIOType getAmountBlocksIO() {
            return amountBlocksIO;
        }

        /**
         * Sets the value of the amountBlocksIO property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountBlocksIOType }
         *     
         */
        public void setAmountBlocksIO(AmountBlocksIOType value) {
            this.amountBlocksIO = value;
        }

        /**
         * Gets the value of the amountBlocksFull property.
         * 
         * @return
         *     possible object is
         *     {@link AmountBlocksFullType }
         *     
         */
        public AmountBlocksFullType getAmountBlocksFull() {
            return amountBlocksFull;
        }

        /**
         * Sets the value of the amountBlocksFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link AmountBlocksFullType }
         *     
         */
        public void setAmountBlocksFull(AmountBlocksFullType value) {
            this.amountBlocksFull = value;
        }

        /**
         * Gets the value of the fcubserrorresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fcubserrorresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSERRORRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ERRORType }
         * 
         * 
         */
        public List<ERRORType> getFCUBSERRORRESP() {
            if (fcubserrorresp == null) {
                fcubserrorresp = new ArrayList<ERRORType>();
            }
            return this.fcubserrorresp;
        }

        /**
         * Gets the value of the fcubswarningresp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fcubswarningresp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFCUBSWARNINGRESP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WARNINGType }
         * 
         * 
         */
        public List<WARNINGType> getFCUBSWARNINGRESP() {
            if (fcubswarningresp == null) {
                fcubswarningresp = new ArrayList<WARNINGType>();
            }
            return this.fcubswarningresp;
        }

    }

}
