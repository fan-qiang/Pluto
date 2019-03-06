
package com.fanqiang.sophon.jaxb.fxSpot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *                             &lt;element name="FXSPOT">
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
 *                                                           &lt;element name="ExerciseTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="ExerciseOwnerTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                                       &lt;element name="Forex">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="FOREX">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Valdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="SpotDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="BoughtCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="BoughtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                           &lt;element name="SoldCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="SoldAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                           &lt;element name="SplitCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="SplitSpotOrSwap" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="BookData">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="FXBK_DATA" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="Ccy1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="Ccy2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="Rate">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;simpleContent>
 *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                                                       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/extension>
 *                                                                                   &lt;/simpleContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="NearRate">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;simpleContent>
 *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                                                       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/extension>
 *                                                                                   &lt;/simpleContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="TrueSpotRate">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;simpleContent>
 *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                                                       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/extension>
 *                                                                                   &lt;/simpleContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="FarRate">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;simpleContent>
 *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                                                       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/extension>
 *                                                                                   &lt;/simpleContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="SplitRateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="BookType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
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
     *                   &lt;element name="FXSPOT">
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
     *                                                 &lt;element name="ExerciseTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="ExerciseOwnerTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                             &lt;element name="Forex">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="FOREX">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Valdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="SpotDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="BoughtCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="BoughtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                 &lt;element name="SoldCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="SoldAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                 &lt;element name="SplitCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="SplitSpotOrSwap" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="BookData">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="FXBK_DATA" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="Ccy1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="Ccy2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="Rate">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                                                             &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/extension>
     *                                                                         &lt;/simpleContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="NearRate">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                                                             &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/extension>
     *                                                                         &lt;/simpleContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="TrueSpotRate">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                                                             &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/extension>
     *                                                                         &lt;/simpleContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="FarRate">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                                                             &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/extension>
     *                                                                         &lt;/simpleContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="SplitRateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="BookType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="SINGLE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
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
         *         &lt;element name="FXSPOT">
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
         *                                       &lt;element name="ExerciseTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="ExerciseOwnerTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *                   &lt;element name="Forex">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="FOREX">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Valdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="SpotDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="BoughtCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="BoughtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                       &lt;element name="SoldCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="SoldAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                       &lt;element name="SplitCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="SplitSpotOrSwap" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="BookData">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="FXBK_DATA" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="Ccy1" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="Ccy2" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="Rate">
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                                                   &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/extension>
         *                                                               &lt;/simpleContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="NearRate">
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                                                   &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/extension>
         *                                                               &lt;/simpleContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="TrueSpotRate">
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                                                   &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/extension>
         *                                                               &lt;/simpleContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="FarRate">
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                                                   &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/extension>
         *                                                               &lt;/simpleContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="SplitRateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="BookType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "fxspot"
        })
        public static class TRADELIST {

            @XmlElement(name = "FXSPOT", required = true)
            protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT fxspot;

            /**
             * 获取fxspot属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT }
             *     
             */
            public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT getFXSPOT() {
                return fxspot;
            }

            /**
             * 设置fxspot属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT }
             *     
             */
            public void setFXSPOT(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT value) {
                this.fxspot = value;
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
             *                             &lt;element name="ExerciseTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="ExerciseOwnerTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
             *         &lt;element name="Forex">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="FOREX">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Valdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="SpotDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="BoughtCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="BoughtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                             &lt;element name="SoldCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="SoldAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                             &lt;element name="SplitCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="SplitSpotOrSwap" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="BookData">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="FXBK_DATA" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="Ccy1" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="Ccy2" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="Rate">
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                                                         &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/extension>
             *                                                     &lt;/simpleContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="NearRate">
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                                                         &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/extension>
             *                                                     &lt;/simpleContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="TrueSpotRate">
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                                                         &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/extension>
             *                                                     &lt;/simpleContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="FarRate">
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                                                         &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/extension>
             *                                                     &lt;/simpleContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="SplitRateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="BookType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "forex"
            })
            public static class FXSPOT {

                @XmlElement(name = "TradeType", required = true)
                protected String tradeType;
                @XmlElement(name = "Env", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env env;
                @XmlElement(name = "Back", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back back;
                @XmlElement(name = "Forex", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex forex;

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
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env getEnv() {
                    return env;
                }

                /**
                 * 设置env属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env }
                 *     
                 */
                public void setEnv(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env value) {
                    this.env = value;
                }

                /**
                 * 获取back属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back getBack() {
                    return back;
                }

                /**
                 * 设置back属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back }
                 *     
                 */
                public void setBack(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back value) {
                    this.back = value;
                }

                /**
                 * 获取forex属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex getForex() {
                    return forex;
                }

                /**
                 * 设置forex属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex }
                 *     
                 */
                public void setForex(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex value) {
                    this.forex = value;
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
                 *                   &lt;element name="ExerciseTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="ExerciseOwnerTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back.BACK back;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取back属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back.BACK }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back.BACK getBACK() {
                        return back;
                    }

                    /**
                     * 设置back属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back.BACK }
                     *     
                     */
                    public void setBACK(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Back.BACK value) {
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
                     *         &lt;element name="ExerciseTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="ExerciseOwnerTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "extTradeId",
                        "exerciseTo",
                        "exerciseOwnerTable"
                    })
                    public static class BACK {

                        @XmlElement(name = "ExtSystem", required = true)
                        protected String extSystem;
                        @XmlElement(name = "ExtTradeId", required = true)
                        protected String extTradeId;
                        @XmlElement(name = "ExerciseTo", required = true)
                        protected String exerciseTo;
                        @XmlElement(name = "ExerciseOwnerTable", required = true)
                        protected String exerciseOwnerTable;

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

                        /**
                         * 获取exerciseTo属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getExerciseTo() {
                            return exerciseTo;
                        }

                        /**
                         * 设置exerciseTo属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setExerciseTo(String value) {
                            this.exerciseTo = value;
                        }

                        /**
                         * 获取exerciseOwnerTable属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getExerciseOwnerTable() {
                            return exerciseOwnerTable;
                        }

                        /**
                         * 设置exerciseOwnerTable属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setExerciseOwnerTable(String value) {
                            this.exerciseOwnerTable = value;
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
                    protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env.ENV env;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取env属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env.ENV }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env.ENV getENV() {
                        return env;
                    }

                    /**
                     * 设置env属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env.ENV }
                     *     
                     */
                    public void setENV(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Env.ENV value) {
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
                 *         &lt;element name="FOREX">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Valdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="SpotDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="BoughtCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="BoughtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                   &lt;element name="SoldCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="SoldAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                   &lt;element name="SplitCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="SplitSpotOrSwap" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="BookData">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="FXBK_DATA" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="Ccy1" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="Ccy2" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="Rate">
                 *                                         &lt;complexType>
                 *                                           &lt;simpleContent>
                 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                                               &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/extension>
                 *                                           &lt;/simpleContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="NearRate">
                 *                                         &lt;complexType>
                 *                                           &lt;simpleContent>
                 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                                               &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/extension>
                 *                                           &lt;/simpleContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="TrueSpotRate">
                 *                                         &lt;complexType>
                 *                                           &lt;simpleContent>
                 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                                               &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/extension>
                 *                                           &lt;/simpleContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="FarRate">
                 *                                         &lt;complexType>
                 *                                           &lt;simpleContent>
                 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                                               &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/extension>
                 *                                           &lt;/simpleContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="SplitRateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="BookType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "forex"
                })
                public static class Forex {

                    @XmlElement(name = "FOREX", required = true)
                    protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX forex;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取forex属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX getFOREX() {
                        return forex;
                    }

                    /**
                     * 设置forex属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX }
                     *     
                     */
                    public void setFOREX(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX value) {
                        this.forex = value;
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
                     *         &lt;element name="Valdate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="SpotDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="BoughtCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="BoughtAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *         &lt;element name="SoldCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="SoldAmt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *         &lt;element name="SplitCcy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="SplitSpotOrSwap" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="BookData">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="FXBK_DATA" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="Ccy1" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="Ccy2" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="Rate">
                     *                               &lt;complexType>
                     *                                 &lt;simpleContent>
                     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *                                     &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/extension>
                     *                                 &lt;/simpleContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="NearRate">
                     *                               &lt;complexType>
                     *                                 &lt;simpleContent>
                     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *                                     &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/extension>
                     *                                 &lt;/simpleContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="TrueSpotRate">
                     *                               &lt;complexType>
                     *                                 &lt;simpleContent>
                     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *                                     &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/extension>
                     *                                 &lt;/simpleContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="FarRate">
                     *                               &lt;complexType>
                     *                                 &lt;simpleContent>
                     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *                                     &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/extension>
                     *                                 &lt;/simpleContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="SplitRateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="BookType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "porS",
                        "valdate",
                        "spotDate",
                        "boughtCcy",
                        "boughtAmt",
                        "soldCcy",
                        "soldAmt",
                        "splitCcy",
                        "splitSpotOrSwap",
                        "bookData"
                    })
                    public static class FOREX {

                        @XmlElement(name = "PorS", required = true)
                        protected String porS;
                        @XmlElement(name = "Valdate", required = true)
                        protected String valdate;
                        @XmlElement(name = "SpotDate", required = true)
                        protected String spotDate;
                        @XmlElement(name = "BoughtCcy", required = true)
                        protected String boughtCcy;
                        @XmlElement(name = "BoughtAmt", required = true)
                        protected BigDecimal boughtAmt;
                        @XmlElement(name = "SoldCcy", required = true)
                        protected String soldCcy;
                        @XmlElement(name = "SoldAmt", required = true)
                        protected BigDecimal soldAmt;
                        @XmlElement(name = "SplitCcy", required = true)
                        protected String splitCcy;
                        @XmlElement(name = "SplitSpotOrSwap", required = true)
                        protected String splitSpotOrSwap;
                        @XmlElement(name = "BookData", required = true)
                        protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData bookData;

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
                         * 获取valdate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValdate() {
                            return valdate;
                        }

                        /**
                         * 设置valdate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValdate(String value) {
                            this.valdate = value;
                        }

                        /**
                         * 获取spotDate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSpotDate() {
                            return spotDate;
                        }

                        /**
                         * 设置spotDate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSpotDate(String value) {
                            this.spotDate = value;
                        }

                        /**
                         * 获取boughtCcy属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBoughtCcy() {
                            return boughtCcy;
                        }

                        /**
                         * 设置boughtCcy属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBoughtCcy(String value) {
                            this.boughtCcy = value;
                        }

                        /**
                         * 获取boughtAmt属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getBoughtAmt() {
                            return boughtAmt;
                        }

                        /**
                         * 设置boughtAmt属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setBoughtAmt(BigDecimal value) {
                            this.boughtAmt = value;
                        }

                        /**
                         * 获取soldCcy属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSoldCcy() {
                            return soldCcy;
                        }

                        /**
                         * 设置soldCcy属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSoldCcy(String value) {
                            this.soldCcy = value;
                        }

                        /**
                         * 获取soldAmt属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getSoldAmt() {
                            return soldAmt;
                        }

                        /**
                         * 设置soldAmt属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setSoldAmt(BigDecimal value) {
                            this.soldAmt = value;
                        }

                        /**
                         * 获取splitCcy属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSplitCcy() {
                            return splitCcy;
                        }

                        /**
                         * 设置splitCcy属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSplitCcy(String value) {
                            this.splitCcy = value;
                        }

                        /**
                         * 获取splitSpotOrSwap属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSplitSpotOrSwap() {
                            return splitSpotOrSwap;
                        }

                        /**
                         * 设置splitSpotOrSwap属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSplitSpotOrSwap(String value) {
                            this.splitSpotOrSwap = value;
                        }

                        /**
                         * 获取bookData属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData }
                         *     
                         */
                        public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData getBookData() {
                            return bookData;
                        }

                        /**
                         * 设置bookData属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData }
                         *     
                         */
                        public void setBookData(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData value) {
                            this.bookData = value;
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
                         *         &lt;element name="FXBK_DATA" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="Ccy1" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="Ccy2" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="Rate">
                         *                     &lt;complexType>
                         *                       &lt;simpleContent>
                         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                         *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/extension>
                         *                       &lt;/simpleContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="NearRate">
                         *                     &lt;complexType>
                         *                       &lt;simpleContent>
                         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                         *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/extension>
                         *                       &lt;/simpleContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="TrueSpotRate">
                         *                     &lt;complexType>
                         *                       &lt;simpleContent>
                         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                         *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/extension>
                         *                       &lt;/simpleContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="FarRate">
                         *                     &lt;complexType>
                         *                       &lt;simpleContent>
                         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                         *                           &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/extension>
                         *                       &lt;/simpleContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="SplitRateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="BookType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                            "fxbkdata"
                        })
                        public static class BookData {

                            @XmlElement(name = "FXBK_DATA")
                            protected List<SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA> fxbkdata;
                            @XmlAttribute(name = "SINGLE")
                            protected String single;
                            @XmlAttribute(name = "TYPE")
                            protected String type;

                            /**
                             * Gets the value of the fxbkdata property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the fxbkdata property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getFXBKDATA().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA }
                             * 
                             * 
                             */
                            public List<SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA> getFXBKDATA() {
                                if (fxbkdata == null) {
                                    fxbkdata = new ArrayList<SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA>();
                                }
                                return this.fxbkdata;
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
                             *         &lt;element name="Book" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="Desk" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="Ccy1" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="Ccy2" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="Rate">
                             *           &lt;complexType>
                             *             &lt;simpleContent>
                             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                             *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/extension>
                             *             &lt;/simpleContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="NearRate">
                             *           &lt;complexType>
                             *             &lt;simpleContent>
                             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                             *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/extension>
                             *             &lt;/simpleContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="TrueSpotRate">
                             *           &lt;complexType>
                             *             &lt;simpleContent>
                             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                             *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/extension>
                             *             &lt;/simpleContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="FarRate">
                             *           &lt;complexType>
                             *             &lt;simpleContent>
                             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                             *                 &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/extension>
                             *             &lt;/simpleContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="SplitRateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="BookType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                "book",
                                "desk",
                                "ccy1",
                                "ccy2",
                                "rate",
                                "nearRate",
                                "trueSpotRate",
                                "farRate",
                                "splitRateFormat",
                                "bookType"
                            })
                            public static class FXBKDATA {

                                @XmlElement(name = "Book", required = true)
                                protected String book;
                                @XmlElement(name = "Desk", required = true)
                                protected String desk;
                                @XmlElement(name = "Ccy1", required = true)
                                protected String ccy1;
                                @XmlElement(name = "Ccy2", required = true)
                                protected String ccy2;
                                @XmlElement(name = "Rate", required = true)
                                protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.Rate rate;
                                @XmlElement(name = "NearRate", required = true)
                                protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.NearRate nearRate;
                                @XmlElement(name = "TrueSpotRate", required = true)
                                protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.TrueSpotRate trueSpotRate;
                                @XmlElement(name = "FarRate", required = true)
                                protected SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.FarRate farRate;
                                @XmlElement(name = "SplitRateFormat", required = true)
                                protected String splitRateFormat;
                                @XmlElement(name = "BookType", required = true)
                                protected String bookType;

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
                                 * 获取ccy1属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCcy1() {
                                    return ccy1;
                                }

                                /**
                                 * 设置ccy1属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCcy1(String value) {
                                    this.ccy1 = value;
                                }

                                /**
                                 * 获取ccy2属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCcy2() {
                                    return ccy2;
                                }

                                /**
                                 * 设置ccy2属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCcy2(String value) {
                                    this.ccy2 = value;
                                }

                                /**
                                 * 获取rate属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.Rate }
                                 *     
                                 */
                                public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.Rate getRate() {
                                    return rate;
                                }

                                /**
                                 * 设置rate属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.Rate }
                                 *     
                                 */
                                public void setRate(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.Rate value) {
                                    this.rate = value;
                                }

                                /**
                                 * 获取nearRate属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.NearRate }
                                 *     
                                 */
                                public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.NearRate getNearRate() {
                                    return nearRate;
                                }

                                /**
                                 * 设置nearRate属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.NearRate }
                                 *     
                                 */
                                public void setNearRate(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.NearRate value) {
                                    this.nearRate = value;
                                }

                                /**
                                 * 获取trueSpotRate属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.TrueSpotRate }
                                 *     
                                 */
                                public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.TrueSpotRate getTrueSpotRate() {
                                    return trueSpotRate;
                                }

                                /**
                                 * 设置trueSpotRate属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.TrueSpotRate }
                                 *     
                                 */
                                public void setTrueSpotRate(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.TrueSpotRate value) {
                                    this.trueSpotRate = value;
                                }

                                /**
                                 * 获取farRate属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.FarRate }
                                 *     
                                 */
                                public SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.FarRate getFarRate() {
                                    return farRate;
                                }

                                /**
                                 * 设置farRate属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.FarRate }
                                 *     
                                 */
                                public void setFarRate(SUMMIT.TRADEDETAIL.TRADELIST.FXSPOT.Forex.FOREX.BookData.FXBKDATA.FarRate value) {
                                    this.farRate = value;
                                }

                                /**
                                 * 获取splitRateFormat属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getSplitRateFormat() {
                                    return splitRateFormat;
                                }

                                /**
                                 * 设置splitRateFormat属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setSplitRateFormat(String value) {
                                    this.splitRateFormat = value;
                                }

                                /**
                                 * 获取bookType属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getBookType() {
                                    return bookType;
                                }

                                /**
                                 * 设置bookType属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setBookType(String value) {
                                    this.bookType = value;
                                }


                                /**
                                 * <p>anonymous complex type的 Java 类。
                                 * 
                                 * <p>以下模式片段指定包含在此类中的预期内容。
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;simpleContent>
                                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                                 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *     &lt;/extension>
                                 *   &lt;/simpleContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "value"
                                })
                                public static class FarRate {

                                    @XmlValue
                                    protected BigDecimal value;
                                    @XmlAttribute(name = "TYPE")
                                    protected String type;

                                    /**
                                     * 获取value属性的值。
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public BigDecimal getValue() {
                                        return value;
                                    }

                                    /**
                                     * 设置value属性的值。
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public void setValue(BigDecimal value) {
                                        this.value = value;
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

                                }


                                /**
                                 * <p>anonymous complex type的 Java 类。
                                 * 
                                 * <p>以下模式片段指定包含在此类中的预期内容。
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;simpleContent>
                                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                                 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *     &lt;/extension>
                                 *   &lt;/simpleContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "value"
                                })
                                public static class NearRate {

                                    @XmlValue
                                    protected BigDecimal value;
                                    @XmlAttribute(name = "TYPE")
                                    protected String type;

                                    /**
                                     * 获取value属性的值。
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public BigDecimal getValue() {
                                        return value;
                                    }

                                    /**
                                     * 设置value属性的值。
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public void setValue(BigDecimal value) {
                                        this.value = value;
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

                                }


                                /**
                                 * <p>anonymous complex type的 Java 类。
                                 * 
                                 * <p>以下模式片段指定包含在此类中的预期内容。
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;simpleContent>
                                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                                 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *     &lt;/extension>
                                 *   &lt;/simpleContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "value"
                                })
                                public static class Rate {

                                    @XmlValue
                                    protected BigDecimal value;
                                    @XmlAttribute(name = "TYPE")
                                    protected String type;

                                    /**
                                     * 获取value属性的值。
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public BigDecimal getValue() {
                                        return value;
                                    }

                                    /**
                                     * 设置value属性的值。
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public void setValue(BigDecimal value) {
                                        this.value = value;
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

                                }


                                /**
                                 * <p>anonymous complex type的 Java 类。
                                 * 
                                 * <p>以下模式片段指定包含在此类中的预期内容。
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;simpleContent>
                                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                                 *       &lt;attribute name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *     &lt;/extension>
                                 *   &lt;/simpleContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "value"
                                })
                                public static class TrueSpotRate {

                                    @XmlValue
                                    protected BigDecimal value;
                                    @XmlAttribute(name = "TYPE")
                                    protected String type;

                                    /**
                                     * 获取value属性的值。
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public BigDecimal getValue() {
                                        return value;
                                    }

                                    /**
                                     * 设置value属性的值。
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link BigDecimal }
                                     *     
                                     */
                                    public void setValue(BigDecimal value) {
                                        this.value = value;
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

                                }

                            }

                        }

                    }

                }

            }

        }

    }

}
