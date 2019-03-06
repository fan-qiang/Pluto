
package com.fanqiang.sophon.jaxb.repo;

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
 *                             &lt;element name="REPO_TR">
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
 *                                       &lt;element name="Repo">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="REPO">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="RepType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="RepoMktType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="PassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="MatPassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="NumCollateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                           &lt;element name="CollList">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="COLLTRL" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                                               &lt;element name="MarginExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="Margin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                                               &lt;element name="StartDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                                               &lt;element name="EndDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                                               &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="CollType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                                       &lt;element name="Asset">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ASSET">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                           &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                                                           &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                   &lt;element name="REPO_TR">
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
     *                             &lt;element name="Repo">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="REPO">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="RepType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="RepoMktType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="PassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="MatPassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="NumCollateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                 &lt;element name="CollList">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="COLLTRL" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                                     &lt;element name="MarginExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="Margin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                                     &lt;element name="StartDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                                     &lt;element name="EndDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                                     &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="CollType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                             &lt;element name="Asset">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ASSET">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                 &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *                                                 &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *         &lt;element name="REPO_TR">
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
         *                   &lt;element name="Repo">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="REPO">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="RepType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="RepoMktType" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="PassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="MatPassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="NumCollateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                       &lt;element name="CollList">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="COLLTRL" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                                           &lt;element name="MarginExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="Margin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                                           &lt;element name="StartDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                                           &lt;element name="EndDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                                           &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="CollType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *                   &lt;element name="Asset">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ASSET">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                       &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
         *                                       &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "repotr"
        })
        public static class TRADELIST {

            @XmlElement(name = "REPO_TR", required = true)
            protected SUMMIT.TRADEDETAIL.TRADELIST.REPOTR repotr;

            /**
             * 获取repotr属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR }
             *     
             */
            public SUMMIT.TRADEDETAIL.TRADELIST.REPOTR getREPOTR() {
                return repotr;
            }

            /**
             * 设置repotr属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR }
             *     
             */
            public void setREPOTR(SUMMIT.TRADEDETAIL.TRADELIST.REPOTR value) {
                this.repotr = value;
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
             *         &lt;element name="Repo">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="REPO">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="RepType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="RepoMktType" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="PassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="MatPassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="NumCollateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                             &lt;element name="CollList">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="COLLTRL" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                                                 &lt;element name="MarginExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="Margin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                                                 &lt;element name="StartDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                                                 &lt;element name="EndDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                                                 &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="CollType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
             *         &lt;element name="Asset">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ASSET">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                             &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
             *                             &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "repo",
                "asset"
            })
            public static class REPOTR {

                @XmlElement(name = "TradeType", required = true)
                protected String tradeType;
                @XmlElement(name = "Env", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env env;
                @XmlElement(name = "Back", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back back;
                @XmlElement(name = "Repo", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo repo;
                @XmlElement(name = "Asset", required = true)
                protected SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Asset asset;

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
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env getEnv() {
                    return env;
                }

                /**
                 * 设置env属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env }
                 *     
                 */
                public void setEnv(SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env value) {
                    this.env = value;
                }

                /**
                 * 获取back属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back getBack() {
                    return back;
                }

                /**
                 * 设置back属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back }
                 *     
                 */
                public void setBack(SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back value) {
                    this.back = value;
                }

                /**
                 * 获取repo属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo getRepo() {
                    return repo;
                }

                /**
                 * 设置repo属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo }
                 *     
                 */
                public void setRepo(SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo value) {
                    this.repo = value;
                }

                /**
                 * 获取asset属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Asset }
                 *     
                 */
                public SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Asset getAsset() {
                    return asset;
                }

                /**
                 * 设置asset属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Asset }
                 *     
                 */
                public void setAsset(SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Asset value) {
                    this.asset = value;
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
                 *         &lt;element name="ASSET">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="PorS" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                   &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                   &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                public static class Asset {

                    @XmlElement(name = "ASSET", required = true)
                    protected SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Asset.ASSET asset;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取asset属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Asset.ASSET }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Asset.ASSET getASSET() {
                        return asset;
                    }

                    /**
                     * 设置asset属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Asset.ASSET }
                     *     
                     */
                    public void setASSET(SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Asset.ASSET value) {
                        this.asset = value;
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
                     *         &lt;element name="Notional" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *         &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="EffDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="MatDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="INTEREST_Rate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *         &lt;element name="INTEREST_dmIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="INTEREST_Term" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "notional",
                        "ccy",
                        "effDate",
                        "matDate",
                        "interestRate",
                        "interestDmIndex",
                        "interestTerm"
                    })
                    public static class ASSET {

                        @XmlElement(name = "PorS", required = true)
                        protected String porS;
                        @XmlElement(name = "Notional", required = true)
                        protected BigDecimal notional;
                        @XmlElement(name = "Ccy", required = true)
                        protected String ccy;
                        @XmlElement(name = "EffDate", required = true)
                        protected String effDate;
                        @XmlElement(name = "MatDate", required = true)
                        protected String matDate;
                        @XmlElement(name = "INTEREST_Rate", required = true)
                        protected BigDecimal interestRate;
                        @XmlElement(name = "INTEREST_dmIndex", required = true)
                        protected String interestDmIndex;
                        @XmlElement(name = "INTEREST_Term", required = true)
                        protected String interestTerm;

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
                    protected SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back.BACK back;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取back属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back.BACK }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back.BACK getBACK() {
                        return back;
                    }

                    /**
                     * 设置back属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back.BACK }
                     *     
                     */
                    public void setBACK(SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Back.BACK value) {
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
                    protected SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env.ENV env;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取env属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env.ENV }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env.ENV getENV() {
                        return env;
                    }

                    /**
                     * 设置env属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env.ENV }
                     *     
                     */
                    public void setENV(SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Env.ENV value) {
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
                 *         &lt;element name="REPO">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="RepType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="RepoMktType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="PassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="MatPassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="NumCollateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                   &lt;element name="CollList">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="COLLTRL" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                                       &lt;element name="MarginExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="Margin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                                       &lt;element name="StartDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                                       &lt;element name="EndDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                 *                                       &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="CollType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "repo"
                })
                public static class Repo {

                    @XmlElement(name = "REPO", required = true)
                    protected SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO repo;
                    @XmlAttribute(name = "SINGLE")
                    protected String single;
                    @XmlAttribute(name = "TYPE")
                    protected String type;

                    /**
                     * 获取repo属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO }
                     *     
                     */
                    public SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO getREPO() {
                        return repo;
                    }

                    /**
                     * 设置repo属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO }
                     *     
                     */
                    public void setREPO(SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO value) {
                        this.repo = value;
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
                     *         &lt;element name="RepType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="RepoMktType" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="PassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="MatPassThru" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="NumCollateral" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *         &lt;element name="CollList">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="COLLTRL" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *                             &lt;element name="MarginExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="Margin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *                             &lt;element name="StartDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *                             &lt;element name="EndDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                     *                             &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="CollType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "repType",
                        "repoMktType",
                        "passThru",
                        "matPassThru",
                        "numCollateral",
                        "collList"
                    })
                    public static class REPO {

                        @XmlElement(name = "RepType", required = true)
                        protected String repType;
                        @XmlElement(name = "RepoMktType", required = true)
                        protected String repoMktType;
                        @XmlElement(name = "PassThru", required = true)
                        protected String passThru;
                        @XmlElement(name = "MatPassThru", required = true)
                        protected String matPassThru;
                        @XmlElement(name = "NumCollateral")
                        protected int numCollateral;
                        @XmlElement(name = "CollList", required = true)
                        protected SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO.CollList collList;

                        /**
                         * 获取repType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRepType() {
                            return repType;
                        }

                        /**
                         * 设置repType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRepType(String value) {
                            this.repType = value;
                        }

                        /**
                         * 获取repoMktType属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRepoMktType() {
                            return repoMktType;
                        }

                        /**
                         * 设置repoMktType属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRepoMktType(String value) {
                            this.repoMktType = value;
                        }

                        /**
                         * 获取passThru属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPassThru() {
                            return passThru;
                        }

                        /**
                         * 设置passThru属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPassThru(String value) {
                            this.passThru = value;
                        }

                        /**
                         * 获取matPassThru属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMatPassThru() {
                            return matPassThru;
                        }

                        /**
                         * 设置matPassThru属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMatPassThru(String value) {
                            this.matPassThru = value;
                        }

                        /**
                         * 获取numCollateral属性的值。
                         * 
                         */
                        public int getNumCollateral() {
                            return numCollateral;
                        }

                        /**
                         * 设置numCollateral属性的值。
                         * 
                         */
                        public void setNumCollateral(int value) {
                            this.numCollateral = value;
                        }

                        /**
                         * 获取collList属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO.CollList }
                         *     
                         */
                        public SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO.CollList getCollList() {
                            return collList;
                        }

                        /**
                         * 设置collList属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO.CollList }
                         *     
                         */
                        public void setCollList(SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO.CollList value) {
                            this.collList = value;
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
                         *         &lt;element name="COLLTRL" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                         *                   &lt;element name="MarginExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="Margin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                         *                   &lt;element name="StartDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                         *                   &lt;element name="EndDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                         *                   &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="CollType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                            "colltrl"
                        })
                        public static class CollList {

                            @XmlElement(name = "COLLTRL")
                            protected List<SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO.CollList.COLLTRL> colltrl;
                            @XmlAttribute(name = "SINGLE")
                            protected String single;
                            @XmlAttribute(name = "TYPE")
                            protected String type;

                            /**
                             * Gets the value of the colltrl property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the colltrl property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getCOLLTRL().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO.CollList.COLLTRL }
                             * 
                             * 
                             */
                            public List<SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO.CollList.COLLTRL> getCOLLTRL() {
                                if (colltrl == null) {
                                    colltrl = new ArrayList<SUMMIT.TRADEDETAIL.TRADELIST.REPOTR.Repo.REPO.CollList.COLLTRL>();
                                }
                                return this.colltrl;
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
                             *         &lt;element name="Sec" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                             *         &lt;element name="MarginExp" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="Margin" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                             *         &lt;element name="StartDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                             *         &lt;element name="EndDirtyPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
                             *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="Ccy" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="CollType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                "quantity",
                                "marginExp",
                                "margin",
                                "startDirtyPrice",
                                "endDirtyPrice",
                                "type",
                                "ccy",
                                "collType"
                            })
                            public static class COLLTRL {

                                @XmlElement(name = "Sec", required = true)
                                protected String sec;
                                @XmlElement(name = "Quantity", required = true)
                                protected BigDecimal quantity;
                                @XmlElement(name = "MarginExp", required = true)
                                protected String marginExp;
                                @XmlElement(name = "Margin", required = true)
                                protected BigDecimal margin;
                                @XmlElement(name = "StartDirtyPrice", required = true)
                                protected BigDecimal startDirtyPrice;
                                @XmlElement(name = "EndDirtyPrice", required = true)
                                protected BigDecimal endDirtyPrice;
                                @XmlElement(name = "Type", required = true)
                                protected String type;
                                @XmlElement(name = "Ccy", required = true)
                                protected String ccy;
                                @XmlElement(name = "CollType", required = true)
                                protected String collType;

                                /**
                                 * 获取sec属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getSec() {
                                    return sec;
                                }

                                /**
                                 * 设置sec属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setSec(String value) {
                                    this.sec = value;
                                }

                                /**
                                 * 获取quantity属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getQuantity() {
                                    return quantity;
                                }

                                /**
                                 * 设置quantity属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setQuantity(BigDecimal value) {
                                    this.quantity = value;
                                }

                                /**
                                 * 获取marginExp属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMarginExp() {
                                    return marginExp;
                                }

                                /**
                                 * 设置marginExp属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMarginExp(String value) {
                                    this.marginExp = value;
                                }

                                /**
                                 * 获取margin属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getMargin() {
                                    return margin;
                                }

                                /**
                                 * 设置margin属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setMargin(BigDecimal value) {
                                    this.margin = value;
                                }

                                /**
                                 * 获取startDirtyPrice属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getStartDirtyPrice() {
                                    return startDirtyPrice;
                                }

                                /**
                                 * 设置startDirtyPrice属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setStartDirtyPrice(BigDecimal value) {
                                    this.startDirtyPrice = value;
                                }

                                /**
                                 * 获取endDirtyPrice属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public BigDecimal getEndDirtyPrice() {
                                    return endDirtyPrice;
                                }

                                /**
                                 * 设置endDirtyPrice属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link BigDecimal }
                                 *     
                                 */
                                public void setEndDirtyPrice(BigDecimal value) {
                                    this.endDirtyPrice = value;
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
                                 * 获取collType属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCollType() {
                                    return collType;
                                }

                                /**
                                 * 设置collType属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCollType(String value) {
                                    this.collType = value;
                                }

                            }

                        }

                    }

                }

            }

        }

    }

}
