
package com.fanqiang.sophon.jaxb.bond;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="COMMON">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MsgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ExternalId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="TargetSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TRADEDETAIL">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TRADELIST">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BOND_TR">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="TradeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Env">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ENV">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="TradeDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Trader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Cust" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Comment1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Comment2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Back">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BACK">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ExtSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="ExtTradeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Bond">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="BOND">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                           &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Settlement" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                           &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                           &lt;element name="Accrual" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Yield" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "common",
    "tradedetail"
})
@XmlRootElement(name = "SUMMIT")
public class SUMMIT {

    @XmlElement(name = "COMMON", required = true)
    protected SUMMIT.COMMON common;
    @XmlElement(name = "TRADEDETAIL", required = true)
    protected SUMMIT.TRADEDETAIL tradedetail;

    /**
     * 获取common属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SUMMIT.COMMON }
     *     
     */
    public SUMMIT.COMMON getCOMMON() {
        return common;
    }

    /**
     * 设置common属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SUMMIT.COMMON }
     *     
     */
    public void setCOMMON(SUMMIT.COMMON value) {
        this.common = value;
    }

    /**
     * 获取tradedetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SUMMIT.TRADEDETAIL }
     *     
     */
    public SUMMIT.TRADEDETAIL getTRADEDETAIL() {
        return tradedetail;
    }

    /**
     * 设置tradedetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SUMMIT.TRADEDETAIL }
     *     
     */
    public void setTRADEDETAIL(SUMMIT.TRADEDETAIL value) {
        this.tradedetail = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="MsgId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ExternalId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Action" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="TargetSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "msgId",
        "externalId",
        "type",
        "version",
        "action",
        "timestamp",
        "targetSystem",
        "sourceSystem"
    })
    public static class COMMON {

        @XmlElement(name = "MsgId", required = true)
        protected String msgId;
        @XmlElement(name = "ExternalId", required = true)
        protected String externalId;
        @XmlElement(name = "Type", required = true)
        protected String type;
        @XmlElement(name = "Version", required = true)
        protected String version;
        @XmlElement(name = "Action", required = true)
        protected String action;
        @XmlElement(name = "Timestamp", required = true)
        protected String timestamp;
        @XmlElement(name = "TargetSystem", required = true)
        protected String targetSystem;
        @XmlElement(name = "SourceSystem", required = true)
        protected String sourceSystem;

        /**
         * 获取msgId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsgId() {
            return msgId;
        }

        /**
         * 设置msgId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsgId(String value) {
            this.msgId = value;
        }

        /**
         * 获取externalId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalId() {
            return externalId;
        }

        /**
         * 设置externalId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalId(String value) {
            this.externalId = value;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * 获取version属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * 设置version属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * 获取action属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAction() {
            return action;
        }

        /**
         * 设置action属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAction(String value) {
            this.action = value;
        }

        /**
         * 获取timestamp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimestamp() {
            return timestamp;
        }

        /**
         * 设置timestamp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimestamp(String value) {
            this.timestamp = value;
        }

        /**
         * 获取targetSystem属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetSystem() {
            return targetSystem;
        }

        /**
         * 设置targetSystem属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetSystem(String value) {
            this.targetSystem = value;
        }

        /**
         * 获取sourceSystem属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceSystem() {
            return sourceSystem;
        }

        /**
         * 设置sourceSystem属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceSystem(String value) {
            this.sourceSystem = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TRADELIST">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BOND_TR">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="TradeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Env">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ENV">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="TradeDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Trader" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Cust" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Comment1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Comment2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Back">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BACK">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ExtSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="ExtTradeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Bond">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="BOND">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                 &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Settlement" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                 &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                 &lt;element name="Accrual" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Yield" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "tradelist"
    })
    public static class TRADEDETAIL {

        @XmlElement(name = "TRADELIST", required = true)
        protected SUMMIT.TRADEDETAIL.TRADELIST tradelist;

        /**
         * 获取tradelist属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SUMMIT.TRADEDETAIL.TRADELIST }
         *     
         */
        public SUMMIT.TRADEDETAIL.TRADELIST getTRADELIST() {
            return tradelist;
        }

        /**
         * 设置tradelist属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SUMMIT.TRADEDETAIL.TRADELIST }
         *     
         */
        public void setTRADELIST(SUMMIT.TRADEDETAIL.TRADELIST value) {
            this.tradelist = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="BOND_TR">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="TradeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Env">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ENV">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="TradeDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Trader" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Cust" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Comment1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Comment2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Back">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BACK">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ExtSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="ExtTradeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Bond">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="BOND">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                       &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Settlement" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                       &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                       &lt;element name="Accrual" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Yield" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "bondtr"
        })
        public static class TRADELIST {

            @XmlElement(name = "BOND_TR", required = true)
            protected SUMMIT.TRADEDETAIL.TRADELIST.BONDTR bondtr;

            /**
             * 获取bondtr属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR }
             *     
             */
            public SUMMIT.TRADEDETAIL.TRADELIST.BONDTR getBONDTR() {
                return bondtr;
            }

            /**
             * 设置bondtr属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR }
             *     
             */
            public void setBONDTR(SUMMIT.TRADEDETAIL.TRADELIST.BONDTR value) {
                this.bondtr = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="TradeType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Env">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ENV">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="TradeDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Trader" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Cust" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Comment1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Comment2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Back">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BACK">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ExtSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="ExtTradeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Bond">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="BOND">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                             &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Settlement" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                             &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                             &lt;element name="Accrual" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Yield" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "tradeType",
                "env",
                "back",
                "bond"
            })
            public static class BONDTR {

                @XmlElement(name = "TradeType", required = true)
                protected String tradeType;
                @XmlElement(name = "Env", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env env;
                @XmlElement(name = "Back", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back back;
                @XmlElement(name = "Bond", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond bond;

                /**
                 * 获取tradeType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTradeType() {
                    return tradeType;
                }

                /**
                 * 设置tradeType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTradeType(String value) {
                    this.tradeType = value;
                }

                /**
                 * 获取env属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env getEnv() {
                    return env;
                }

                /**
                 * 设置env属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env }
                 *     
                 */
                public void setEnv(SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env value) {
                    this.env = value;
                }

                /**
                 * 获取back属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back getBack() {
                    return back;
                }

                /**
                 * 设置back属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back }
                 *     
                 */
                public void setBack(SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back value) {
                    this.back = value;
                }

                /**
                 * 获取bond属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond getBond() {
                    return bond;
                }

                /**
                 * 设置bond属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond }
                 *     
                 */
                public void setBond(SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond value) {
                    this.bond = value;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="BACK">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ExtSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="ExtTradeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "back"
                })
                public static class Back {

                    @XmlElement(name = "BACK", required = true)
                    protected SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back.BACK back;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取back属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back.BACK }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back.BACK getBACK() {
                        return back;
                    }

                    /**
                     * 设置back属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back.BACK }
                     *     
                     */
                    public void setBACK(SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Back.BACK value) {
                        this.back = value;
                    }

                    /**
                     * 获取single属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSINGLE() {
                        return single;
                    }

                    /**
                     * 设置single属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSINGLE(String value) {
                        this.single = value;
                    }

                    /**
                     * 获取type属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTYPE() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTYPE(String value) {
                        this.type = value;
                    }


                    /**
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="ExtSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="ExtTradeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "extSystem",
                        "extTradeId"
                    })
                    public static class BACK {

                        @XmlElement(name = "ExtSystem", required = true)
                        protected String extSystem;
                        @XmlElement(name = "ExtTradeId", required = true)
                        protected String extTradeId;

                        /**
                         * 获取extSystem属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getExtSystem() {
                            return extSystem;
                        }

                        /**
                         * 设置extSystem属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setExtSystem(String value) {
                            this.extSystem = value;
                        }

                        /**
                         * 获取extTradeId属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getExtTradeId() {
                            return extTradeId;
                        }

                        /**
                         * 设置extTradeId属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setExtTradeId(String value) {
                            this.extTradeId = value;
                        }

                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="BOND">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                   &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Settlement" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                   &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                   &lt;element name="Accrual" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Yield" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "bond"
                })
                public static class Bond {

                    @XmlElement(name = "BOND", required = true)
                    protected SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond.BOND bond;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取bond属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond.BOND }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond.BOND getBOND() {
                        return bond;
                    }

                    /**
                     * 设置bond属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond.BOND }
                     *     
                     */
                    public void setBOND(SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Bond.BOND value) {
                        this.bond = value;
                    }

                    /**
                     * 获取single属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSINGLE() {
                        return single;
                    }

                    /**
                     * 设置single属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSINGLE(String value) {
                        this.single = value;
                    }

                    /**
                     * 获取type属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTYPE() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTYPE(String value) {
                        this.type = value;
                    }


                    /**
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *         &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="ValueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="SettleDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Settlement" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *         &lt;element name="Accrual" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Yield" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
                        "sec",
                        "porS",
                        "notional",
                        "ccy",
                        "valueDate",
                        "settleDate",
                        "settlement",
                        "price",
                        "accrual",
                        "yield"
                    })
                    public static class BOND {

                        @XmlElement(name = "Sec")
                        protected int sec;
                        @XmlElement(name = "PorS", required = true)
                        protected String porS;
                        @XmlElement(name = "Notional", required = true)
                        protected BigDecimal notional;
                        @XmlElement(name = "Ccy", required = true)
                        protected String ccy;
                        @XmlElement(name = "ValueDate", required = true)
                        protected String valueDate;
                        @XmlElement(name = "SettleDate", required = true)
                        protected String settleDate;
                        @XmlElement(name = "Settlement", required = true)
                        protected BigDecimal settlement;
                        @XmlElement(name = "Price", required = true)
                        protected BigDecimal price;
                        @XmlElement(name = "Accrual", required = true)
                        protected String accrual;
                        @XmlElement(name = "Yield", required = true)
                        protected BigDecimal yield;

                        /**
                         * 获取sec属性的值。
                         * 
                         */
                        public int getSec() {
                            return sec;
                        }

                        /**
                         * 设置sec属性的值。
                         * 
                         */
                        public void setSec(int value) {
                            this.sec = value;
                        }

                        /**
                         * 获取porS属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPorS() {
                            return porS;
                        }

                        /**
                         * 设置porS属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPorS(String value) {
                            this.porS = value;
                        }

                        /**
                         * 获取notional属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getNotional() {
                            return notional;
                        }

                        /**
                         * 设置notional属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setNotional(BigDecimal value) {
                            this.notional = value;
                        }

                        /**
                         * 获取ccy属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCcy() {
                            return ccy;
                        }

                        /**
                         * 设置ccy属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCcy(String value) {
                            this.ccy = value;
                        }

                        /**
                         * 获取valueDate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValueDate() {
                            return valueDate;
                        }

                        /**
                         * 设置valueDate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValueDate(String value) {
                            this.valueDate = value;
                        }

                        /**
                         * 获取settleDate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSettleDate() {
                            return settleDate;
                        }

                        /**
                         * 设置settleDate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSettleDate(String value) {
                            this.settleDate = value;
                        }

                        /**
                         * 获取settlement属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getSettlement() {
                            return settlement;
                        }

                        /**
                         * 设置settlement属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setSettlement(BigDecimal value) {
                            this.settlement = value;
                        }

                        /**
                         * 获取price属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getPrice() {
                            return price;
                        }

                        /**
                         * 设置price属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setPrice(BigDecimal value) {
                            this.price = value;
                        }

                        /**
                         * 获取accrual属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAccrual() {
                            return accrual;
                        }

                        /**
                         * 设置accrual属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAccrual(String value) {
                            this.accrual = value;
                        }

                        /**
                         * 获取yield属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getYield() {
                            return yield;
                        }

                        /**
                         * 设置yield属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setYield(BigDecimal value) {
                            this.yield = value;
                        }

                    }

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="ENV">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="TradeDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Trader" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Cust" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Comment1" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Comment2" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "env"
                })
                public static class Env {

                    @XmlElement(name = "ENV", required = true)
                    protected SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env.ENV env;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取env属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env.ENV }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env.ENV getENV() {
                        return env;
                    }

                    /**
                     * 设置env属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env.ENV }
                     *     
                     */
                    public void setENV(SUMMIT.TRADEDETAIL.TRADELIST.BONDTR.Env.ENV value) {
                        this.env = value;
                    }

                    /**
                     * 获取single属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSINGLE() {
                        return single;
                    }

                    /**
                     * 设置single属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSINGLE(String value) {
                        this.single = value;
                    }

                    /**
                     * 获取type属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTYPE() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTYPE(String value) {
                        this.type = value;
                    }


                    /**
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="TradeDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Trader" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Cust" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Comment1" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Comment2" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "tradeDate",
                        "trader",
                        "cust",
                        "company",
                        "desk",
                        "book",
                        "comment1",
                        "comment2"
                    })
                    public static class ENV {

                        @XmlElement(name = "TradeDate", required = true)
                        protected String tradeDate;
                        @XmlElement(name = "Trader", required = true)
                        protected String trader;
                        @XmlElement(name = "Cust", required = true)
                        protected String cust;
                        @XmlElement(name = "Company", required = true)
                        protected String company;
                        @XmlElement(name = "Desk", required = true)
                        protected String desk;
                        @XmlElement(name = "Book", required = true)
                        protected String book;
                        @XmlElement(name = "Comment1", required = true)
                        protected String comment1;
                        @XmlElement(name = "Comment2", required = true)
                        protected String comment2;

                        /**
                         * 获取tradeDate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTradeDate() {
                            return tradeDate;
                        }

                        /**
                         * 设置tradeDate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTradeDate(String value) {
                            this.tradeDate = value;
                        }

                        /**
                         * 获取trader属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTrader() {
                            return trader;
                        }

                        /**
                         * 设置trader属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTrader(String value) {
                            this.trader = value;
                        }

                        /**
                         * 获取cust属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCust() {
                            return cust;
                        }

                        /**
                         * 设置cust属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCust(String value) {
                            this.cust = value;
                        }

                        /**
                         * 获取company属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCompany() {
                            return company;
                        }

                        /**
                         * 设置company属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCompany(String value) {
                            this.company = value;
                        }

                        /**
                         * 获取desk属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDesk() {
                            return desk;
                        }

                        /**
                         * 设置desk属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDesk(String value) {
                            this.desk = value;
                        }

                        /**
                         * 获取book属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBook() {
                            return book;
                        }

                        /**
                         * 设置book属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBook(String value) {
                            this.book = value;
                        }

                        /**
                         * 获取comment1属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getComment1() {
                            return comment1;
                        }

                        /**
                         * 设置comment1属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setComment1(String value) {
                            this.comment1 = value;
                        }

                        /**
                         * 获取comment2属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getComment2() {
                            return comment2;
                        }

                        /**
                         * 设置comment2属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setComment2(String value) {
                            this.comment2 = value;
                        }

                    }

                }

            }

        }

    }

}
