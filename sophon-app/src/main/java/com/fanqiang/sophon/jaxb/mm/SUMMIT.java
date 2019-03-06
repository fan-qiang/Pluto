
package com.fanqiang.sophon.jaxb.mm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 *                             &lt;element name="MM">
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
 *                                       &lt;element name="Assets">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ASSET" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="MMType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                           &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                           &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="INTEREST_Basis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="INTEREST_Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="SCHED_Pay_IntRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Deliverable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="INTEREST_IntRateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="MM">
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
     *                             &lt;element name="Assets">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ASSET" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="MMType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                 &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                 &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="INTEREST_Basis" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="INTEREST_Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="SCHED_Pay_IntRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Deliverable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="INTEREST_IntRateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *         &lt;element name="MM">
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
         *                   &lt;element name="Assets">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ASSET" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="MMType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                       &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                       &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="INTEREST_Basis" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="INTEREST_Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="SCHED_Pay_IntRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Deliverable" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="INTEREST_IntRateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "mm"
        })
        public static class TRADELIST {

            @XmlElement(name = "MM", required = true)
            protected SUMMIT.TRADEDETAIL.TRADELIST.MM mm;

            /**
             * 获取mm属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM }
             *     
             */
            public SUMMIT.TRADEDETAIL.TRADELIST.MM getMM() {
                return mm;
            }

            /**
             * 设置mm属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM }
             *     
             */
            public void setMM(SUMMIT.TRADEDETAIL.TRADELIST.MM value) {
                this.mm = value;
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
             *         &lt;element name="Assets">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ASSET" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="MMType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                             &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                             &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="INTEREST_Basis" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="INTEREST_Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="SCHED_Pay_IntRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Deliverable" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="INTEREST_IntRateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "assets"
            })
            public static class MM {

                @XmlElement(name = "TradeType", required = true)
                protected String tradeType;
                @XmlElement(name = "Env", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.MM.Env env;
                @XmlElement(name = "Back", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.MM.Back back;
                @XmlElement(name = "Assets", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.MM.Assets assets;

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
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Env }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.MM.Env getEnv() {
                    return env;
                }

                /**
                 * 设置env属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Env }
                 *     
                 */
                public void setEnv(SUMMIT.TRADEDETAIL.TRADELIST.MM.Env value) {
                    this.env = value;
                }

                /**
                 * 获取back属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Back }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.MM.Back getBack() {
                    return back;
                }

                /**
                 * 设置back属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Back }
                 *     
                 */
                public void setBack(SUMMIT.TRADEDETAIL.TRADELIST.MM.Back value) {
                    this.back = value;
                }

                /**
                 * 获取assets属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Assets }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.MM.Assets getAssets() {
                    return assets;
                }

                /**
                 * 设置assets属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Assets }
                 *     
                 */
                public void setAssets(SUMMIT.TRADEDETAIL.TRADELIST.MM.Assets value) {
                    this.assets = value;
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
                 *         &lt;element name="ASSET" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="MMType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                   &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                   &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="INTEREST_Basis" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="INTEREST_Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="SCHED_Pay_IntRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Deliverable" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="INTEREST_IntRateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "asset"
                })
                public static class Assets {

                    @XmlElement(name = "ASSET")
                    protected List<SUMMIT.TRADEDETAIL.TRADELIST.MM.Assets.ASSET> asset;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * Gets the value of the asset property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the asset property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getASSET().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Assets.ASSET }
                     * 
                     * 
                     */
                    public List<SUMMIT.TRADEDETAIL.TRADELIST.MM.Assets.ASSET> getASSET() {
                        if (asset == null) {
                            asset = new ArrayList<SUMMIT.TRADEDETAIL.TRADELIST.MM.Assets.ASSET>();
                        }
                        return this.asset;
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
                     *         &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="MMType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *         &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *         &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="INTEREST_Basis" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="INTEREST_Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="SCHED_Pay_IntRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Deliverable" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="INTEREST_IntRateType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "porS",
                        "mmType",
                        "ccy",
                        "notional",
                        "interestRate",
                        "interestDmIndex",
                        "interestTerm",
                        "interestBasis",
                        "interestCcy",
                        "schedPayIntRule",
                        "deliverable",
                        "interestIntRateType",
                        "effDate",
                        "matDate"
                    })
                    public static class ASSET {

                        @XmlElement(name = "PorS", required = true)
                        protected String porS;
                        @XmlElement(name = "MMType", required = true)
                        protected String mmType;
                        @XmlElement(name = "Ccy", required = true)
                        protected String ccy;
                        @XmlElement(name = "Notional", required = true)
                        protected BigDecimal notional;
                        @XmlElement(name = "INTEREST_Rate", required = true)
                        protected BigDecimal interestRate;
                        @XmlElement(name = "INTEREST_dmIndex", required = true)
                        protected String interestDmIndex;
                        @XmlElement(name = "INTEREST_Term", required = true)
                        protected String interestTerm;
                        @XmlElement(name = "INTEREST_Basis", required = true)
                        protected String interestBasis;
                        @XmlElement(name = "INTEREST_Ccy", required = true)
                        protected String interestCcy;
                        @XmlElement(name = "SCHED_Pay_IntRule", required = true)
                        protected String schedPayIntRule;
                        @XmlElement(name = "Deliverable", required = true)
                        protected String deliverable;
                        @XmlElement(name = "INTEREST_IntRateType", required = true)
                        protected String interestIntRateType;
                        @XmlElement(name = "EffDate", required = true)
                        protected String effDate;
                        @XmlElement(name = "MatDate", required = true)
                        protected String matDate;

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
                         * 获取mmType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMMType() {
                            return mmType;
                        }

                        /**
                         * 设置mmType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMMType(String value) {
                            this.mmType = value;
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
                         * 获取interestRate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getINTERESTRate() {
                            return interestRate;
                        }

                        /**
                         * 设置interestRate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setINTERESTRate(BigDecimal value) {
                            this.interestRate = value;
                        }

                        /**
                         * 获取interestDmIndex属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getINTERESTDmIndex() {
                            return interestDmIndex;
                        }

                        /**
                         * 设置interestDmIndex属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setINTERESTDmIndex(String value) {
                            this.interestDmIndex = value;
                        }

                        /**
                         * 获取interestTerm属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getINTERESTTerm() {
                            return interestTerm;
                        }

                        /**
                         * 设置interestTerm属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setINTERESTTerm(String value) {
                            this.interestTerm = value;
                        }

                        /**
                         * 获取interestBasis属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getINTERESTBasis() {
                            return interestBasis;
                        }

                        /**
                         * 设置interestBasis属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setINTERESTBasis(String value) {
                            this.interestBasis = value;
                        }

                        /**
                         * 获取interestCcy属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getINTERESTCcy() {
                            return interestCcy;
                        }

                        /**
                         * 设置interestCcy属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setINTERESTCcy(String value) {
                            this.interestCcy = value;
                        }

                        /**
                         * 获取schedPayIntRule属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSCHEDPayIntRule() {
                            return schedPayIntRule;
                        }

                        /**
                         * 设置schedPayIntRule属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSCHEDPayIntRule(String value) {
                            this.schedPayIntRule = value;
                        }

                        /**
                         * 获取deliverable属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDeliverable() {
                            return deliverable;
                        }

                        /**
                         * 设置deliverable属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDeliverable(String value) {
                            this.deliverable = value;
                        }

                        /**
                         * 获取interestIntRateType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getINTERESTIntRateType() {
                            return interestIntRateType;
                        }

                        /**
                         * 设置interestIntRateType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setINTERESTIntRateType(String value) {
                            this.interestIntRateType = value;
                        }

                        /**
                         * 获取effDate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEffDate() {
                            return effDate;
                        }

                        /**
                         * 设置effDate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEffDate(String value) {
                            this.effDate = value;
                        }

                        /**
                         * 获取matDate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMatDate() {
                            return matDate;
                        }

                        /**
                         * 设置matDate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMatDate(String value) {
                            this.matDate = value;
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
                    protected SUMMIT.TRADEDETAIL.TRADELIST.MM.Back.BACK back;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取back属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Back.BACK }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.MM.Back.BACK getBACK() {
                        return back;
                    }

                    /**
                     * 设置back属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Back.BACK }
                     *     
                     */
                    public void setBACK(SUMMIT.TRADEDETAIL.TRADELIST.MM.Back.BACK value) {
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
                    protected SUMMIT.TRADEDETAIL.TRADELIST.MM.Env.ENV env;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取env属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Env.ENV }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.MM.Env.ENV getENV() {
                        return env;
                    }

                    /**
                     * 设置env属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.MM.Env.ENV }
                     *     
                     */
                    public void setENV(SUMMIT.TRADEDETAIL.TRADELIST.MM.Env.ENV value) {
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
