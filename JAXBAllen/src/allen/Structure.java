//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.02 at 01:29:23 PM CEST 
//


package allen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="atlas-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ontology-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="acronym" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="color-hex-triplet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="graph-order" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="st-level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hemisphere-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="parent-structure-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="children" type="{}structure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "structure", propOrder = {
    "id",
    "atlasId",
    "ontologyId",
    "acronym",
    "name",
    "colorHexTriplet",
    "graphOrder",
    "stLevel",
    "hemisphereId",
    "parentStructureId",
    "children"
})
public class Structure {

    protected short id;
    @XmlElement(name = "atlas-id")
    protected byte atlasId;
    @XmlElement(name = "ontology-id")
    protected byte ontologyId;
    @XmlElement(required = true)
    protected String acronym;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "color-hex-triplet", required = true)
    protected String colorHexTriplet;
    @XmlElement(name = "graph-order")
    protected byte graphOrder;
    @XmlElement(name = "st-level", required = true)
    protected String stLevel;
    @XmlElement(name = "hemisphere-id")
    protected byte hemisphereId;
    @XmlElement(name = "parent-structure-id", required = true)
    protected String parentStructureId;
    @XmlElement(required = true)
    protected Structure children;

    /**
     * Gets the value of the id property.
     * 
     */
    public short getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(short value) {
        this.id = value;
    }

    /**
     * Gets the value of the atlasId property.
     * 
     */
    public byte getAtlasId() {
        return atlasId;
    }

    /**
     * Sets the value of the atlasId property.
     * 
     */
    public void setAtlasId(byte value) {
        this.atlasId = value;
    }

    /**
     * Gets the value of the ontologyId property.
     * 
     */
    public byte getOntologyId() {
        return ontologyId;
    }

    /**
     * Sets the value of the ontologyId property.
     * 
     */
    public void setOntologyId(byte value) {
        this.ontologyId = value;
    }

    /**
     * Gets the value of the acronym property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * Sets the value of the acronym property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcronym(String value) {
        this.acronym = value;
    }

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
     * Gets the value of the colorHexTriplet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorHexTriplet() {
        return colorHexTriplet;
    }

    /**
     * Sets the value of the colorHexTriplet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorHexTriplet(String value) {
        this.colorHexTriplet = value;
    }

    /**
     * Gets the value of the graphOrder property.
     * 
     */
    public byte getGraphOrder() {
        return graphOrder;
    }

    /**
     * Sets the value of the graphOrder property.
     * 
     */
    public void setGraphOrder(byte value) {
        this.graphOrder = value;
    }

    /**
     * Gets the value of the stLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStLevel() {
        return stLevel;
    }

    /**
     * Sets the value of the stLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStLevel(String value) {
        this.stLevel = value;
    }

    /**
     * Gets the value of the hemisphereId property.
     * 
     */
    public byte getHemisphereId() {
        return hemisphereId;
    }

    /**
     * Sets the value of the hemisphereId property.
     * 
     */
    public void setHemisphereId(byte value) {
        this.hemisphereId = value;
    }

    /**
     * Gets the value of the parentStructureId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentStructureId() {
        return parentStructureId;
    }

    /**
     * Sets the value of the parentStructureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentStructureId(String value) {
        this.parentStructureId = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link Structure }
     *     
     */
    public Structure getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link Structure }
     *     
     */
    public void setChildren(Structure value) {
        this.children = value;
    }

}