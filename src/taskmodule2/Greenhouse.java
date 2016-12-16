//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.15 at 08:46:58 PM MSK 
//


package taskmodule2;

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
 *         &lt;element name="plants" maxOccurs="200">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Soil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="VisualParameters">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="colorSt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="grow">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="10"/>
 *                                   &lt;maxInclusive value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="GrowTips">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="t">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="2"/>
 *                                   &lt;maxInclusive value="100"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="water">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="1000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Multiplying">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="cherenok"/>
 *                         &lt;enumeration value="semena"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
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
    "plants"
})
@XmlRootElement(name = "Greenhouse")
public class Greenhouse {

    @XmlElement(required = true)
    protected List<Greenhouse.Plants> plants;

    /**
     * Gets the value of the plants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Greenhouse.Plants }
     * 
     * 
     */
    public List<Greenhouse.Plants> getPlants() {
        if (plants == null) {
            plants = new ArrayList<Greenhouse.Plants>();
        }
        return this.plants;
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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Soil" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Origin" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="VisualParameters">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="colorSt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="grow">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;minInclusive value="10"/>
     *                         &lt;maxInclusive value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="GrowTips">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="t">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;minInclusive value="2"/>
     *                         &lt;maxInclusive value="100"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="water">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="1000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Multiplying">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="cherenok"/>
     *               &lt;enumeration value="semena"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "name",
        "soil",
        "origin",
        "visualParameters",
        "growTips",
        "multiplying"
    })
    public static class Plants {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Soil", required = true)
        protected String soil;
        @XmlElement(name = "Origin", required = true)
        protected String origin;
        @XmlElement(name = "VisualParameters", required = true)
        protected Greenhouse.Plants.VisualParameters visualParameters;
        @XmlElement(name = "GrowTips", required = true)
        protected Greenhouse.Plants.GrowTips growTips;
        @XmlElement(name = "Multiplying", required = true)
        protected String multiplying;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the soil property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSoil() {
            return soil;
        }

        /**
         * Sets the value of the soil property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSoil(String value) {
            this.soil = value;
        }

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the visualParameters property.
         * 
         * @return
         *     possible object is
         *     {@link Greenhouse.Plants.VisualParameters }
         *     
         */
        public Greenhouse.Plants.VisualParameters getVisualParameters() {
            return visualParameters;
        }

        /**
         * Sets the value of the visualParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link Greenhouse.Plants.VisualParameters }
         *     
         */
        public void setVisualParameters(Greenhouse.Plants.VisualParameters value) {
            this.visualParameters = value;
        }

        /**
         * Gets the value of the growTips property.
         * 
         * @return
         *     possible object is
         *     {@link Greenhouse.Plants.GrowTips }
         *     
         */
        public Greenhouse.Plants.GrowTips getGrowTips() {
            return growTips;
        }

        /**
         * Sets the value of the growTips property.
         * 
         * @param value
         *     allowed object is
         *     {@link Greenhouse.Plants.GrowTips }
         *     
         */
        public void setGrowTips(Greenhouse.Plants.GrowTips value) {
            this.growTips = value;
        }

        /**
         * Gets the value of the multiplying property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMultiplying() {
            return multiplying;
        }

        /**
         * Sets the value of the multiplying property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMultiplying(String value) {
            this.multiplying = value;
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
         *         &lt;element name="t">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;minInclusive value="2"/>
         *               &lt;maxInclusive value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="water">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;minInclusive value="0"/>
         *               &lt;maxInclusive value="1000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "t",
            "water"
        })
        public static class GrowTips {

            protected int t;
            protected int water;

            /**
             * Gets the value of the t property.
             * 
             */
            public int getT() {
                return t;
            }

            /**
             * Sets the value of the t property.
             * 
             */
            public void setT(int value) {
                this.t = value;
            }

            /**
             * Gets the value of the water property.
             * 
             */
            public int getWater() {
                return water;
            }

            /**
             * Sets the value of the water property.
             * 
             */
            public void setWater(int value) {
                this.water = value;
            }

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
         *         &lt;element name="color" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="colorSt" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="grow">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;minInclusive value="10"/>
         *               &lt;maxInclusive value="100"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
            "color",
            "colorSt",
            "grow"
        })
        public static class VisualParameters {

            @XmlElement(required = true)
            protected String color;
            @XmlElement(required = true)
            protected String colorSt;
            protected int grow;

            /**
             * Gets the value of the color property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getColor() {
                return color;
            }

            /**
             * Sets the value of the color property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setColor(String value) {
                this.color = value;
            }

            /**
             * Gets the value of the colorSt property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getColorSt() {
                return colorSt;
            }

            /**
             * Sets the value of the colorSt property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setColorSt(String value) {
                this.colorSt = value;
            }

            /**
             * Gets the value of the grow property.
             * 
             */
            public int getGrow() {
                return grow;
            }

            /**
             * Sets the value of the grow property.
             * 
             */
            public void setGrow(int value) {
                this.grow = value;
            }

        }

    }

}